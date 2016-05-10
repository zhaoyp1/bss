package com.drpeng.sec.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.drpeng.modelCommon.common.HTTPStatus;
import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.service.ISecFunctionService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/9.
 */
@Component
@Path("/")
public class SecFunctionResource {

    @Resource
    private  ISecFunctionService secFunctionService;


    @GET
    @Path("/functions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map getAllFunctions(@QueryParam("parentId") String parentId , @QueryParam("name") String name, @QueryParam("startIndex") String startIndex, @QueryParam("pageSize") String pageSize){
        PageData pageData = new PageData();
        pageData.put("parentId",parentId);
        pageData.put("name",name);
        if(null == pageSize  || "".equals(pageSize) ){
            pageSize = "15";
        }
        if( null != startIndex  && !"".equals(startIndex)){
            pageData.put("startIndex",startIndex);
            pageData.put("pageSize",pageSize);
        }
        Map result = new HashMap();

        try{
            List<PageData> functions = secFunctionService.getAllFunction(pageData);
            result.put("data", JSONArray.toJSONString(functions).toString());
        }catch (IllegalArgumentException e ){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INVALID_PARAMETER_400);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INVALID_PARAMETER_400));
        }catch (Exception e){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }
        result.put("return_code",HTTPStatus.SUCCESS_200);


       return result;
    }

    @GET
    @Path("/roles/functions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map getFunctionGroupByRole(){
        Map result = new HashMap();
        result.put("return_code","200");
        try{
            Map<String,List<String>> roleFunctions = secFunctionService.getAllFunctionGroupByRole();
            result.put("data", JSONArray.toJSONString(roleFunctions).toString());
        }catch (Exception e ){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }

        return result;
    }

    @GET
    @Path("function/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map getFunctionById(@PathParam("id") String id){
        Map result = new HashMap();
        try{
            PageData pageData = secFunctionService.getFunctionById(id);
            result.put("data", JSONObject.toJSONString(pageData).toString());
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INVALID_PARAMETER_400);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INVALID_PARAMETER_400));

        }catch (Exception e ){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }
        return result;
    }
    @GET
    @Path("role/{roleId}/functions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map getFunctionByRole(@PathParam("roleId") String roleId){
        Map result = new HashMap();
        try{
            List<PageData> pageDatas = secFunctionService.getFunctionsByRoleId(roleId);
            result.put("data", JSONObject.toJSONString(pageDatas).toString());
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INVALID_PARAMETER_400);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INVALID_PARAMETER_400));

        }catch (Exception e ){
            e.printStackTrace();
            result.put("return_code", HTTPStatus.INTERNAL_ERROR_500);
            result.put("return_msgs",HTTPStatus.getMsg(HTTPStatus.INTERNAL_ERROR_500));
        }
        return result;
    }


}
