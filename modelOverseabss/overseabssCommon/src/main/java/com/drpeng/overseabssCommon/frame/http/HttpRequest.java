package com.drpeng.overseabssCommon.frame.http;

import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;

/**
 * @className: HttpRequest 
 * @description: Http请求对象的封装 
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年8月26日 下午6:08:49
 */
public class HttpRequest {

    /**
     * 待请求的url
     */
    private String             url               = null;

    /**
     * 连接超时时间，默认10秒
     */
    private int                socketTimeout      = 10000;
    /**
     * 传输超时时间，默认30秒
     */
    private int                connectionTimeout = 5000;

    /**
     * Post方式请求时组装好的参数值对
     */
    private List<NameValuePair> parameters       = null;
    
    /**
     * Post方式请求提交JSON格式数据
     */
    private String             postJSONBody      = null;
    
    /**
     * 文件上传（二进制）数据体
     */
    private MultipartEntityBuilder multipareEntity= null;
    
    /**
     * Get方式请求时对应的参数
     */
    private String             queryString       = null;

    /**
     * 默认的请求编码方式
     */
    private String             charset           = "UTF-8";

    /**
     * 请求发起方的ip地址
     */
    private String             clientIp;

    /**
     * 请求返回的方式
     */
    private HttpResultType     resultType        = HttpResultType.STRING;
    
    /**
     * 请求头
     */
    private Map<String,Object>   header          = null;

    public MultipartEntityBuilder getMultipareEntity() {
		return multipareEntity;
	}

	public void setMultipareEntity(MultipartEntityBuilder multipareEntity) {
		this.multipareEntity = multipareEntity;
	}

	public Map<String,Object> getHeader() {
		return header;
	}

	public void setHeader(Map<String,Object> header) {
		this.header = header;
	}
	
	public String getPostJSONBody() {
		return postJSONBody;
	}

	public void setPostJSONBody(String postJSONBody) {
		this.postJSONBody = postJSONBody;
	}

	public HttpRequest(HttpResultType resultType) {
        super();
        this.resultType = resultType;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public List<NameValuePair> getParameters() {
        return parameters;
    }

    public void setParameters(List<NameValuePair> parameters) {
        this.parameters = parameters;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int timeout) {
        this.socketTimeout = timeout;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public HttpResultType getResultType() {
        return resultType;
    }

    public void setResultType(HttpResultType resultType) {
        this.resultType = resultType;
    }

}
