package com.drpeng.sec.service;


import com.drpeng.modelCommon.common.PageData;

import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/9.
 */
public interface ISecFunctionService {

     List<PageData> getAllFunction(PageData pageData);

     Map<String, List<String>> getAllFunctionGroupByRole();

     PageData getFunctionById(String id) ;

     List<PageData> getFunctionsByRoleId(String roleId);
}
