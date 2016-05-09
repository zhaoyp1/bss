package com.drpeng.sec.service;

import com.drpeng.sec.common.PageData;
import com.drpeng.sec.entity.SecOrganize;

import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/5.
 */
public interface ISecOrganizeService {

    public List<PageData> findAllSecOrganize(PageData parameterMap) throws NumberFormatException;

}
