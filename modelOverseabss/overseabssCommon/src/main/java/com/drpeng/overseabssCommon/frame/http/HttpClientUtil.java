/**   
 * @title: HttpClientUtil.java 
 * @package com.boboqi.pay.alipay.util.httpclient 
 * @description: TODO(用一句话描述该文件做什么) 
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年8月26日 下午6:49:54 
 * @version v1.0
 */
package com.drpeng.overseabssCommon.frame.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 * @className: HttpClientUtil
 * @description: HttpClient工具类
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年8月26日 下午6:49:54
 */
public class HttpClientUtil {

	/**
	 * @title: generatNameValuePair 
	 * @description: MAP类型数组转换成NameValuePair类型
	 * @author songhn 
	 * @param properties
	 * @return
	 * @date 2015年8月26日 下午6:51:28
	 */
	public static List<NameValuePair> generatNameValuePair(Map<String, String> properties) {
		List<NameValuePair> formParams = new ArrayList<NameValuePair>(); 
		for (Map.Entry<String, String> entry : properties.entrySet()) {
            formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
		return formParams;
	}

	/**
	 * @title: toString 
	 * @description: 将NameValuePairs数组转变为字符串
	 * @author songhn 
	 * @param nameValues
	 * @return
	 * @date 2015年8月26日 下午6:51:35
	 */
	protected String toString(NameValuePair[] nameValues) {
		if (nameValues == null || nameValues.length == 0) {
			return "null";
		}
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < nameValues.length; i++) {
			NameValuePair nameValue = nameValues[i];
			if (i == 0) {
				buffer.append(nameValue.getName() + "=" + nameValue.getValue());
			} else {
				buffer.append("&" + nameValue.getName() + "="
						+ nameValue.getValue());
			}
		}
		return buffer.toString();
	}

}
