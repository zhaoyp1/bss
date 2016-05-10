package com.drpeng.overseabss.common;
import com.drpeng.overseabssCommon.frame.http.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by zhaoyp on 2016/5/10.
 */
@Component("initServlet")
public class InitServlet {
    public static Map<String,JSONObject> functions = new HashMap<String,JSONObject>() ;
    public static Map<String,List> roleFunctions = new HashMap<String, List>();

    @PostConstruct
    public void init(){
        cacheFunctions();
        cacheRoleFunctions();
    }

    public void cacheRoleFunctions(){
        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler
                .getInstance();
        HttpRequest request = new HttpRequest(HttpResultType.BYTES);
        request.setUrl(SystemConstants.API_ROLE_FUNCTIONS_URL);
        Map<String, String> properties = new HashMap<String, String>();
        request.setParameters(HttpClientUtil.generatNameValuePair(properties));
        try{
            HttpResponse response = httpProtocolHandler.sendGet(request);
            String strResult = response.getStringResult();
            Map<String,Object> result = JSONObject.fromObject(strResult);
            String code = String.valueOf(result.get("return_code"));
            if(code.equals("200")){
                JSONObject datas = JSONObject.fromObject(result.get("data"));
                for (Iterator iter = datas.keys(); iter.hasNext();) {
                    String key = (String)iter.next();
                    JSONArray functions = JSONArray.fromObject(datas.get(key));
                    List functionlist = new ArrayList();
                    for (int i = 0 ; i<functions.size()  ; i++){
                        functionlist.add(functions.get(i));
                    }
                    roleFunctions.put(key,functionlist);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void cacheFunctions(){

        HttpProtocolHandler httpProtocolHandler = HttpProtocolHandler
                .getInstance();
        HttpRequest request = new HttpRequest();
        request.setUrl(SystemConstants.API_FUNCTIONS_URL);
        Map<String, String> properties = new HashMap<String, String>();
        request.setParameters(HttpClientUtil.generatNameValuePair(properties));
        try{
            HttpResponse response = httpProtocolHandler.sendGet(request);
            String strResult = response.getStringResult();
            Map<String,Object> result = JSONObject.fromObject(strResult);
            String code = String.valueOf(result.get("return_code"));
            if(code.equals("200")){
                JSONArray datas = JSONArray.fromObject(result.get("data"));
                for (int i = 0; i < datas.size(); i++) {
                    JSONObject data = (JSONObject) datas.get(i);
                     functions.put(data.getString("FUNC_ID"),data);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
