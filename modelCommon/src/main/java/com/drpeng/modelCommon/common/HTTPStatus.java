/**   
 * @title: SystemCode.java 

 * @package com.boboqi.common 
 * @description: TODO(用一句话描述该文件做什么) 
 * @author songhn
 * @company HongRi Software Co.,Ltd.
 * @date 2015年10月8日 下午11:54:37 
 * @version v1.0
 */ 
package com.drpeng.modelCommon.common;

/** 
 * @className: SystemCode 
 * @description: 系统代码类
 * @date 2015年10月8日 下午11:54:37  
 */
public class HTTPStatus {
	
	public static final String SUCCESS_200         = "200";

	public static final String INVALID_PARAMETER_400 = "400";
	
	public static final String INTERNAL_ERROR_500  = "500";
 	
	
	public static String getMsg(String resp_code){
		String resp_msg = "";
		if (resp_code.equals(SUCCESS_200)) {
			resp_msg = "OK";

		} else if (resp_code.equals(INTERNAL_ERROR_500)) {
			resp_msg = "Server internal error happened!";

		} else if (resp_code.equals(INVALID_PARAMETER_400)) {
			resp_msg = "Request parameter is invalid!";

		} else {
		}
		return resp_msg;
	}
}
