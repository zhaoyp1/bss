package com.drpeng.sec.service.impl;

import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.dao.ISecRoleDAO;
import com.drpeng.sec.service.ISecRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaoyp on 2016/5/9.
 */
@Service("secRoleService")
public class SecRoleServiceImpl implements ISecRoleService {

    @Resource
    private  ISecRoleDAO secRoleDAO;
    public List<PageData> findRoleListByOperator(PageData pageData) {
        if( null == pageData){
            pageData = new PageData();
        }else if( (null == pageData.get("operator_id") || "".equals(pageData.get("operator_id"))) && (null == pageData.get("code") || "".equals(pageData.get("code")))){
            throw  new IllegalArgumentException("operator_id,code 不能同时为空");
        }
        List<PageData> pageDatas = secRoleDAO.findRoleListByOperator(pageData);
        return pageDatas;
    }

}
