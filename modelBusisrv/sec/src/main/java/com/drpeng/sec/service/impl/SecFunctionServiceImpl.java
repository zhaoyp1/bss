package com.drpeng.sec.service.impl;

import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.dao.ISecFunctionDAO;
import com.drpeng.sec.dao.ISecRoleDAO;
import com.drpeng.sec.service.ISecFunctionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/9.
 */
@Service("secFunctionService")
public class SecFunctionServiceImpl implements ISecFunctionService {

    @Resource
    public ISecFunctionDAO secFunctionDAO;

    @Resource
    public ISecRoleDAO secRoleDAO;

    public List<PageData> getAllFunction(PageData pageData) {
        if( null != pageData ){
            pageData.checkPageParameter();
        }
        List<PageData> pageDatas = secFunctionDAO.findAllSecFunction(pageData);
        return pageDatas;
    }

    public Map<String, List<String>> getAllFunctionGroupByRole() {
        Map<String,List<String>> roleFunction = new HashMap ();
        List<PageData> functions  = secFunctionDAO.findSecFunctionByRole(null);
        List<PageData> roles = secRoleDAO.findRoleList();
        for (PageData pageData :roles){
            String roleId = String.valueOf(pageData.get("ROLE_ID"));
            List<String> functionList = new ArrayList<String>();
            for(PageData function : functions){

                if(String.valueOf(function.get("ROLE_ID")).equals(roleId)){
                    functionList.add(String.valueOf(function.get("FUNC_ID")));
                }
            }
            roleFunction.put(roleId,functionList);
        }
        return roleFunction;
    }

    public PageData getFunctionById(String id){
        if(null == id || "".equals(id)){
            throw  new IllegalArgumentException("id must not be null");
        }
        PageData function = secFunctionDAO.findSecFunctionById(id);

        return function;
    }

    public List<PageData> getFunctionsByRoleId(String roleId) {

        if( null == roleId || "".equals(roleId)){
            throw new IllegalArgumentException("roleId must not be null");
        }
        PageData pageData = new PageData();
        pageData.put("roleId",roleId);
        List<PageData> functions = secFunctionDAO.findSecFunctionByRole(pageData);

        return functions;
    }
}
