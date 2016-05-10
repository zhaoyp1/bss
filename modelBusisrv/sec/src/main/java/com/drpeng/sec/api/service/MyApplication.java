package com.drpeng.sec.api.service;

 import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by zhaoyp on 2016/5/4.
 */
public class MyApplication extends ResourceConfig {

    public MyApplication(){
      //register(SecOrganizeResource.class);
      packages("com.drpeng.sec.api");
    }
}
