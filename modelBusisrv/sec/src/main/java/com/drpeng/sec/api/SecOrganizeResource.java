package com.drpeng.sec.api;

import com.alibaba.fastjson.JSON;
import com.drpeng.sec.common.PageData;
import com.drpeng.sec.entity.SecOrganize;
import com.drpeng.sec.service.ISecOrganizeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by zhaoyp on 2016/5/5.
 */
@Component
@Path("/")
public class SecOrganizeResource {

    @Resource
    private ISecOrganizeService secOrganizeService;

    @GET
    @Path("/users")
    @Consumes(MediaType.APPLICATION_JSON)
    public String findAllUsers(){

        List<PageData> secOrganizes= secOrganizeService.findAllSecOrganize(null);
        String result= JSON.toJSONString(secOrganizes);
        return  result;
    }
}
