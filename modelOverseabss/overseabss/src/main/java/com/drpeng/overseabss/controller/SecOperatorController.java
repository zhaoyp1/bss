package com.drpeng.overseabss.controller;

import com.drpeng.overseabssCommon.frame.base.BaseController;
import com.drpeng.overseabssCommon.frame.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by dongwh on 16/5/9.
 */
@Controller
public class SecOperatorController extends BaseController {

    @RequestMapping("/operator")
    public ModelAndView showOperatorById(HttpSession session, HttpServletRequest request1){
        ModelAndView mv = this.getModelAndView();
        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler.getInstance();
        HttpRequest request = new HttpRequest(HttpResultType.BYTES);

        request.setUrl("http://localhost:8080/rest/");

        HttpResponse response = httpProtocolHandler.sendGet(request);

        try{
            if(null==response){

            }
            String result = response.getStringResult();

        }catch (Exception e){

        }
        return mv;
    }

}
