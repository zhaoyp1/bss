package com.drpeng.overseabssCommon.frame.base;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drpeng.modelCommon.util.UuidUtil;
import com.drpeng.overseabssCommon.frame.common.PageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @className: BaseController
 * @description: 系统控制器基类，所有控制器均继承该基类
 * @author zhaoyp
 * @company com.drpeng
 * @date 2016年5月5日 上午11:07:19
 */
public class BaseController implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;

	protected Logger logger = LoggerFactory.getLogger(this.getClass());


	/**
	 * 得到PageData
	 */
	public PageData getPageData() {
		return new PageData(this.getRequest());
	}
	/**
	 * @title: getModelAndView 
	 * @description: 得到ModelAndView
	 * @company com.drpeng
	 * @date 2016年5月5日 上午11:07:19
	 */
	public ModelAndView getModelAndView() {
		return new ModelAndView();
	}

	/**
	 * @title: getRequest 
	 * @description: 得到request对象
	 * @company com.drpeng
	 * @date 2016年5月5日 上午11:07:19
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();

		return request;
	}

	/**
	 * @title: get32UUID 
	 * @description: 得到32位的uuid
	 * @author zhaoyp
	 */
	public String get32UUID() {

		return UuidUtil.get32UUID();
	}

	/**
	 * @title: writeStr 
	 * @description: 在Response对象中写输出流
	 * @company com.drpeng
	 * @date 2016年5月5日 上午11:07:19
	 */
	protected void writeStr(HttpServletResponse response, String str) {
		PrintWriter pw = null;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		try {
			pw = response.getWriter();
			pw.print(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.flush();
				pw.close();
			}
		}
	}
	
	/**
	 * @title: getRequestObject 
	 * @description: 从Request中获取所有参数
	 * @company com.drpeng
	 * @date 2016年5月5日 上午11:07:19
	 */
	protected Map<String, String> getRequestObject(HttpServletRequest request) {
		Map<String, String> therequestdata = new HashMap<String, String>();
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement().toString();
			therequestdata.put(name, getParameter(name, request));
		}
		return therequestdata;
	}
	
	/**
	 * @title: getParameter 
	 * @description: 从Request中获取参数
	 * @author zhaoyp
	 * @param name
	 * @param request
	 * @return
	 * @date 2015年6月8日 下午1:16:28
	 */
	protected String getParameter(String name, HttpServletRequest request) {
		return request.getParameter(name);
	}

	/**
	 * @title : getParameterFromStram
	 * @author: zhaoyp
	 * @date  : 2016年2月2日 上午10:54:30
	 * @description: 从HttpServletRequest对象中获取提交的数据流
	 * @param request
	 * @return
	 * @throws Exception
	 */
	protected String getParameterFromStream(HttpServletRequest request) throws Exception {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
			String line = null;
			while((line = in.readLine()) != null){
				sb.append(line);
			}
		} catch (Exception e) {
			logger.equals("【处理失败】从请求数据流中获取请求数据失败");
			throw e;
		}
		return sb.toString();
	}

	/**
	 * @title: getIpAddress 
	 * @description: 获取请求主机IP地址
	 * @author zhaoyp
	 * @param request
	 * @return
	 * @throws IOException
	 * @date 2015年10月27日 下午11:03:45
	 */
	protected String getIpAddress(HttpServletRequest request)
			throws IOException {
		// 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址
		String ip = request.getHeader("X-Forwarded-For");
		if (logger.isInfoEnabled()) {
			logger.info("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
				if (logger.isInfoEnabled()) {
					logger.info("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);
				}
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
				if (logger.isInfoEnabled()) {
					logger.info("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);
				}
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_CLIENT_IP");
				if (logger.isInfoEnabled()) {
					logger.info("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" 	+ ip);
				}
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("HTTP_X_FORWARDED_FOR");
				if (logger.isInfoEnabled()) {
					logger.info("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);
				}
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
				if (logger.isInfoEnabled()) {
					logger.info("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);
				}
			}
		} else if (ip.length() > 15) {
			String[] ips = ip.split(",");
			for (int index = 0; index < ips.length; index++) {
				String strIp = (String) ips[index];
				if (!("unknown".equalsIgnoreCase(strIp))) {
					ip = strIp;
					break;
				}
			}
		}
		return ip;
	}
	
	private static long sTime = 0L;
	private static long eTime = 0L;
	
	public static void logBefore(Logger logger, String interfaceName) {
		sTime = System.currentTimeMillis();
		logger.info("==================log start==================");
		logger.info(interfaceName);
	}

	public static void logAfter(Logger logger) {
		eTime = System.currentTimeMillis();
		logger.info("共执行"+(eTime - sTime)+"ms");
		logger.info("================== log end ==================");
	}

}
