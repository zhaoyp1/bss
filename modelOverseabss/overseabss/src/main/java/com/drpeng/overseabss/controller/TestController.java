package com.drpeng.overseabss.controller;

import com.drpeng.overseabssCommon.frame.base.BaseController;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhaoyp on 2016/5/4.
 */
@Controller
public class TestController extends BaseController {

    @RequestMapping("/hello")
    public String say() {
        System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@");
        return "index";

    }

}
