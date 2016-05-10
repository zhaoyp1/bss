package com.drpeng.overseabss.controller;

import com.alibaba.fastjson.JSON;
import com.drpeng.overseabss.common.InitServlet;
import com.drpeng.overseabssCommon.frame.base.BaseController;
import com.drpeng.overseabssCommon.frame.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/5.
 */
@Controller
public class SecOrganizeController extends BaseController {


    @RequestMapping(value = "/organizeList")
    public ModelAndView showAllOrganize(HttpSession session, HttpServletRequest request1){
        System.out.println("1111111111111");
        ModelAndView mv= this.getModelAndView();
        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler
                .getInstance();
        HttpRequest request = new HttpRequest();
        //String pstr = "city=beijing";
        request.setUrl("http://127.0.0.1:8080/rest/users");
        /*request.setQueryString(pstr);
        Map<String, Object> header = new HashMap<String, Object>();
        header.put("apikey", "5850a3d005ef3512cb899dc3d42a1740");
        request.setHeader(header);
        */
        Map<String, String> properties = new HashMap<String, String>();
        request.setParameters(HttpClientUtil.generatNameValuePair(properties));

        HttpResponse response = httpProtocolHandler.sendGet(request);

        try{
            if (response == null) {
                mv.setViewName("orderinfo/order_statis");
            }
            String strResult = response.getStringResult();
            List secorganizes = JSON.parseArray(strResult);
            mv.addObject("secOrganizesList",secorganizes);
            mv.setViewName("secOrganizeList");
        }catch (Exception e){
            e.printStackTrace();
        }
        return mv;


    }
}
