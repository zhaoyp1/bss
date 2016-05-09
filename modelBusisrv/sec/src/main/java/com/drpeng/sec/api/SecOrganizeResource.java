package com.drpeng.sec.api;

import com.drpeng.sec.common.PageData;
import com.drpeng.sec.service.ISecOrganizeService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
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
    @Path("/organizes")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap findAllUsers(@QueryParam("startIndex") String startIndex, @QueryParam("pageSize") String pageSize){
        HashMap result = new HashMap() ;
        PageData pageData = new PageData();
        if(null == pageSize  || "".equals(pageSize) ){
            pageSize = "15";
        }
        if( null != startIndex  && !"".equals(startIndex)){
            pageData.put("startIndex",startIndex);
            pageData.put("pageSize",pageSize);
        }
        try{
            List<PageData> secOrganizes= secOrganizeService.findAllSecOrganize(pageData);
            String returnResult= JSONArray.fromObject(secOrganizes).toString();
            result.put("data",returnResult);
        }catch (NumberFormatException e){
            e.printStackTrace();
            result.put("return_code","500");
            result.put("return_msgs","[失败]参数异常");
        }catch (Exception e){
            e.printStackTrace();
            result.put("return_code","500");
            result.put("return_msgs","[失败]接口异常");
        }
        result.put("return_code","200");
        return  result;
    }
}
