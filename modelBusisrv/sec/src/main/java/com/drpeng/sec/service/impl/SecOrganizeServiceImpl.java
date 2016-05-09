package com.drpeng.sec.service.impl;

import com.drpeng.sec.dao.ISecOrganizeDAO;
import com.drpeng.sec.entity.SecOrganize;
import com.drpeng.sec.service.ISecOrganizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhaoyp on 2016/5/5.
 */
@Service("organizeService")
public class SecOrganizeServiceImpl implements ISecOrganizeService {

    @Resource
    private ISecOrganizeDAO secOrganizeDAO;

    public List<SecOrganize> findAllSecOrganize(SecOrganize secOrganize) {


        return  secOrganizeDAO.findAll();
    }
}
