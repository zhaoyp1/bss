/**   
 * @title: HttpClientTest.java 
 * @package com.boboqi.httpclient 
 * @description: TODO(用一句话描述该文件做什么) 
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年8月26日 下午7:00:51 
 * @version v1.0
 */
package com.drpeng.overseabssCommon.frame.http;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: HttpClientTest
 * @description: HttpClient测试DEMO
 */
public class Test {

	public static void main(String[] args) throws Exception {

		HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler
				.getInstance();
		HttpRequest request = new HttpRequest(HttpResultType.BYTES);
		String pstr = "city=beijing";
		request.setUrl("http://apis.baidu.com/heweather/pro/weather");
		request.setQueryString(pstr);
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("apikey", "5850a3d005ef3512cb899dc3d42a1740");
		request.setHeader(header);

		Map<String, String> properties = new HashMap<String, String>();
		request.setParameters(HttpClientUtil.generatNameValuePair(properties));
		HttpResponse response = httpProtocolHandler.sendGet(request);
		if (response == null) {
			System.out.println("null");
		}
		String strResult = response.getStringResult();
		System.out.println(strResult);

	}

}
