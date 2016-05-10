package com.drpeng.sec.api;

import com.drpeng.sec.entity.SecOperator;
import com.drpeng.sec.service.ISecOperatorService;
import net.sf.ezmorph.array.ObjectArrayMorpher;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongwh on 16/5/9.
 */
@Component
@Path("/operators")
public class SecOperatorResource {

    @Resource
    ISecOperatorService secOperatorService;

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Map findOperatorById(@PathParam("id") String id){
        System.out.println("findOperatorById=================");
        Map resultMap = new HashMap<String,Object>();
        SecOperator secOperator = null;
        if(null!=id && !"".equals(id)){
            secOperator = secOperatorService.findOperatorById(Integer.parseInt(id));
            String resultData = JSONObject.fromObject(secOperator).toString();
            resultMap.put("data", resultData);
        }
        return resultMap;
    }

    @GET
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String findOperatorByCodeAndPw(@QueryParam("userName") String userName, @QueryParam("password") String password){
        SecOperator secOperator = null;
        if((null!=userName && !"".equals(userName)) && (null!=password && !"".equals(password))){
            secOperator = secOperatorService.findOperatorByCodeAndPw(userName, password);
        }
        return JSONObject.fromObject(secOperator).toString();
    }

}
