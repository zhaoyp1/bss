package com.drpeng.sec.api;

 import com.drpeng.modelCommon.common.HTTPStatus;
 import com.drpeng.modelCommon.common.PageData;
 import com.drpeng.sec.service.ISecOrganizeService;
import net.sf.json.JSONArray;
 import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
 import java.util.List;
 import java.util.Map;

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
    public Map findAllOrganizes(@QueryParam("parentId") String parentId , @QueryParam("organizeName") String organizeName, @QueryParam("startIndex") String startIndex, @QueryParam("pageSize") String pageSize){
        Map result = new HashMap() ;
        PageData pageData = new PageData();
        pageData.put("parentId",parentId);
        pageData.put("organizeName",organizeName);
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
            result.put("return_code",HTTPStatus.INVALID_PARAMETER_400);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INVALID_PARAMETER_400));
        }catch (Exception e){
            e.printStackTrace();
            result.put("return_code",HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }
        result.put("return_code", HTTPStatus.SUCCESS_200);
        return  result;
    }
    @GET
    @Path("/organize/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap findOrganize(@PathParam("id") String id){
        HashMap result = new HashMap();
        result.put("return_code",HTTPStatus.SUCCESS_200);
        try{
            PageData pageData = secOrganizeService.findSecOrganizeById(id);
            result.put("data",pageData);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            result.put("return_code",HTTPStatus.INVALID_PARAMETER_400);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INVALID_PARAMETER_400));
        }catch (Exception e){
            e.printStackTrace();
            result.put("return_code",HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }
        return result;

    }
}
