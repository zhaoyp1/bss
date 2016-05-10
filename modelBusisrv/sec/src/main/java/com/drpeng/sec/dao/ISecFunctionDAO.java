package com.drpeng.sec.dao;

 import com.drpeng.modelCommon.common.PageData;
 import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaoyp on 2016/5/9.
 */
@Repository
public interface ISecFunctionDAO {

    public List<PageData> findSecFunctionByRole(PageData pd);

    public PageData findSecFunctionById(String functionId);

    public List<PageData> findAllSecFunction(PageData pd);
}
