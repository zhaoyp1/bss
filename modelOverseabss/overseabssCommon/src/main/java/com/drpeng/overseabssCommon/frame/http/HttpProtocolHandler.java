package com.drpeng.overseabssCommon.frame.http;

import java.net.SocketTimeoutException;
import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: HttpProtocolHandler
 * @description: 获取远程HTTP数据
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年8月26日 下午6:09:21
 */
public class HttpProtocolHandler {

	protected static Logger LOG = LoggerFactory.getLogger(HttpProtocolHandler.class);

	private static HttpProtocolHandler httpProtocolHandler = new HttpProtocolHandler();

	private static int defaultMaxConnPerHost = 30;
	private static int defaultMaxTotalConn = 200;
	/**
	 * HTTP连接管理器，该连接管理器必须是线程安全的.
	 */
	private static PoolingHttpClientConnectionManager cm = null;
	private static CloseableHttpClient httpclient = null;
	/**
	 * 表示请求器是否已经做了初始化工作
	 */
	private static boolean hasInit = false;

	/**
	 * 工厂方法
	 * 
	 * @return
	 */
	public static HttpProtocolHandler getInstance() {
		return httpProtocolHandler;
	}

	/**
	 * 私有的构造方法
	 */
	private HttpProtocolHandler() {
		init();
	}

	/**
	 * @title: ininConn
	 * @description: 初始化
	 * @author songhn
	 * @date 2015年9月13日 下午6:07:01
	 */
	private static void init() {
		try {
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.INSTANCE).build();
			// Create HttpClient Pooling Manager
			cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
			// Create socket configuration
			SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).build();
			cm.setDefaultSocketConfig(socketConfig);
			// Create message constraints
			MessageConstraints messageConstraints = MessageConstraints.custom().setMaxHeaderCount(200)
					.setMaxLineLength(2000).build();
			// Create connection configuration
			ConnectionConfig connectionConfig = ConnectionConfig.custom()
					.setMalformedInputAction(CodingErrorAction.IGNORE)
					.setUnmappableInputAction(CodingErrorAction.IGNORE).setCharset(Consts.UTF_8)
					.setMessageConstraints(messageConstraints).build();
			cm.setDefaultConnectionConfig(connectionConfig);
			// 设置最大连接数
			cm.setMaxTotal(defaultMaxTotalConn);
			// 设置 每个路由最大连接数
			cm.setDefaultMaxPerRoute(defaultMaxConnPerHost);

			httpclient = HttpClients.custom().setConnectionManager(cm).build();

			hasInit = true;
		} catch (Exception e) {
			LOG.error("初始化异常", e);
		}
	}

	/**
	 * @title: sendGet
	 * @description: 发送Get请求
	 * @author songhn
	 * @param httprequest
	 * @return
	 * @date 2015年9月14日 上午11:39:01
	 */
	public HttpResponse sendGet(HttpRequest httprequest) {
		long s = System.currentTimeMillis();
		if (!hasInit) {
			init();
		}
		String responseString = null;
		HttpResponse httpresponse = new HttpResponse();
		// 超时设置
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(httprequest.getSocketTimeout())
				.setConnectTimeout(httprequest.getConnectionTimeout()).build();

		StringBuilder sbURL = new StringBuilder();
		String url = httprequest.getUrl();
		String qstr = httprequest.getQueryString();
		if (qstr != null && !"".equals(qstr)) {
			sbURL.append(url).append("?").append(qstr);
		} else {
			sbURL.append(url);
		}
		HttpGet get = new HttpGet(sbURL.toString());
		get.setConfig(requestConfig);
		// 设置请求头
		if (null != httprequest.getHeader()) {
			Map<String, Object> header = httprequest.getHeader();
			addHeaders(header, get); 
		}
		try {
			CloseableHttpResponse response = httpclient.execute(get);
			try {
				HttpEntity entity = response.getEntity();
				try {
					if (entity != null) {
						responseString = EntityUtils.toString(entity, httprequest.getCharset());
						httpresponse.setStringResult(responseString);
					}
					httpresponse.setResponseHeaders(response.getAllHeaders());
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} catch (Exception e) {
				LOG.error(String.format("[HttpUtils Get]get response error, url:%s", sbURL.toString()), e);
				return httpresponse;
			} finally {
				if (response != null) {
					response.close();
				}
			}
			LOG.info(String.format("[HttpUtils Get]Debug url:%s , response string %s:", sbURL.toString(),
					responseString));
		} catch (SocketTimeoutException e) {
			LOG.error(String.format("[HttpUtils Get]invoke get timout error, url:%s", sbURL.toString()), e);
			return httpresponse;
		} catch (Exception e) {
			LOG.error(String.format("[HttpUtils Get]invoke get error, url:%s", sbURL.toString()), e);
		} finally {
			get.releaseConnection();
			LOG.debug("====HttpClient-Post接口调用共执行：{} ms====", System.currentTimeMillis() - s);
		}
		return httpresponse;
	}
	// 添加请求头
	private void addHeaders(Map<String,Object> header,HttpRequestBase method){
		Set<String> mapKeys = header.keySet();
		for (Iterator<String> it = mapKeys.iterator(); it.hasNext();) {
			String key = it.next();
			method.setHeader(key, String.valueOf(header.get(key)));
		}
	}

	/**
	 * @title: sendPost
	 * @description: 发送POST请求
	 * @author songhn
	 * @param httprequest
	 * @return
	 * @date 2015年9月14日 上午11:39:18
	 */
	public HttpResponse sendPost(HttpRequest httprequest) {
		long s = System.currentTimeMillis();
		if (!hasInit) {
			init();
		}
		String responseString = null;
		HttpResponse httpresponse = new HttpResponse();
		// 超时设置
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(httprequest.getSocketTimeout())
				.setConnectTimeout(httprequest.getConnectionTimeout()).build();

		String postURL = httprequest.getUrl();
		HttpPost postMethod = new HttpPost(postURL);
		postMethod.setConfig(requestConfig);
		try {
			// 设置POST参数
			String postJSONBody = httprequest.getPostJSONBody();
			List<org.apache.http.NameValuePair> postParameters = httprequest.getParameters();
			MultipartEntityBuilder meb = httprequest.getMultipareEntity();
			if (null != postJSONBody && !"".equals(postJSONBody)) {
				postMethod.setEntity(new StringEntity(postJSONBody, httprequest.getCharset()));
			}
			if (null != postParameters && postParameters.size() > 0) {
				postMethod.setEntity(new UrlEncodedFormEntity(postParameters, httprequest.getCharset()));
			}
			if(null != meb){
				postMethod.setEntity(meb.build());
			}
			// 设置请求头
			if (null != httprequest.getHeader()) {
				Map<String, Object> header = httprequest.getHeader();
				addHeaders(header, postMethod); 
			}
			CloseableHttpResponse response = httpclient.execute(postMethod);
			try {
				HttpEntity entity = response.getEntity();
				try {
					if (entity != null) {
						responseString = EntityUtils.toString(entity, httprequest.getCharset());
						httpresponse.setStringResult(responseString);
					}
					httpresponse.setResponseHeaders(response.getAllHeaders());
				} finally {
					if (entity != null) {
						entity.getContent().close();
					}
				}
			} catch (Exception e) {
				LOG.error(String.format("[HttpUtils Get]get response error, url:%s", postURL), e);
				return httpresponse;
			} finally {
				if (response != null) {
					response.close();
				}
			}
			LOG.info(String.format("[HttpUtils Post]Debug url:%s , response string %s:", postURL, responseString));
		} catch (SocketTimeoutException e) {
			LOG.error(String.format("[HttpUtils Post]invoke post timout error, url:%s", postURL), e);
			return httpresponse;
		} catch (Exception e) {
			LOG.error(String.format("[HttpUtils Post]invoke post error, url:%s", postURL), e);
		} finally {
			postMethod.releaseConnection();
			LOG.debug("====HttpClient-Post接口调用共执行：{} ms====", System.currentTimeMillis() - s);
		}
		return httpresponse;
	}
}
