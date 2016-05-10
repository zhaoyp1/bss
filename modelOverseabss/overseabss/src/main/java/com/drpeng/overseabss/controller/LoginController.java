package com.drpeng.overseabss.controller;

import com.drpeng.overseabss.common.SystemConstants;
import com.drpeng.overseabssCommon.frame.base.BaseController;
import com.drpeng.overseabssCommon.frame.http.HttpProtocolHandler;
import com.drpeng.overseabssCommon.frame.http.HttpRequest;
import com.drpeng.overseabssCommon.frame.http.HttpResponse;
import com.drpeng.overseabssCommon.frame.http.HttpResultType;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by dongwh on 16/5/10.
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping("/login")
    public String login() {
        return "login";

    }

    @RequestMapping("/isLogin")
    public ModelAndView isLogin(HttpSession session, HttpServletRequest request1){

        ModelAndView mv = this.getModelAndView();

        String userName = request1.getParameter("userName");
        String password = request1.getParameter("password");

        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();
        HttpRequest request = new HttpRequest(HttpResultType.BYTES);
        HttpResponse response = null;
        String parameter = "userName="+userName+"&password="+password;
        request.setQueryString(parameter);
        if((null!=userName && !"".equals(userName)) && (null!=password && !"".equals(password))){
            request.setUrl(SystemConstants.API_OPERATOR);
            response = httpProtocolHandler.sendGet(request);
        }else{
            mv.setViewName("login");
            return mv;
        }

        try{
            String result = response.getStringResult();
            if(null==response || null==result || "null".equals(result)){
                mv.setViewName("login");
            }else{
                JSONObject jsonObject = JSONObject.fromObject(result);
                session.setAttribute("code", jsonObject.get("code").toString());
                session.setAttribute("staffId", jsonObject.get("staffId").toString());
                session.setAttribute("opId", jsonObject.get("opId").toString());
                session.setAttribute("orgId", jsonObject.get("orgId").toString());

                //TODO 调用查询员工信息接口,查询其姓名等基本信息

                mv.addObject("loginInfo",result);
                mv.setViewName("index");
            }
        }catch (Exception e){

        }
        return mv;
    }


}
