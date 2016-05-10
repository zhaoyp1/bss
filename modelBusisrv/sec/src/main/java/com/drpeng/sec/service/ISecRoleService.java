package com.drpeng.sec.service;


import com.drpeng.modelCommon.common.PageData;

import java.util.List;

/**
 * Created by zhaoyp on 2016/5/9.
 */
public interface ISecRoleService {

     List<PageData> findRoleListByOperator(PageData pageData);
}
