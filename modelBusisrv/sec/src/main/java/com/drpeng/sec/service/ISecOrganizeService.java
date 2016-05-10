package com.drpeng.sec.service;

  import com.drpeng.modelCommon.common.PageData;

  import java.util.List;

/**
 * Created by zhaoyp on 2016/5/5.
 */
public interface ISecOrganizeService {

     List<PageData> findAllSecOrganize(PageData parameterMap) throws NumberFormatException;

     PageData findSecOrganizeById(String id);

}
