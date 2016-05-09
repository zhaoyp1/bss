package com.drpeng.sec.service;

import com.drpeng.sec.entity.SecOrganize;

import java.util.List;

/**
 * Created by zhaoyp on 2016/5/5.
 */
public interface ISecOrganizeService {

    public List<SecOrganize> findAllSecOrganize(SecOrganize secOrganize);

}
