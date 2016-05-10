package com.drpeng.sec.dao;

 import com.drpeng.modelCommon.common.PageData;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaoyp on 2016/5/9.
 */
@Repository
public interface ISecRoleDAO {

    public  List<PageData> findRoleListByOperator(PageData pageData);

    public  List<PageData> findRoleList();
}
