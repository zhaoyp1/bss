package com.drpeng.sec.service.impl;

import com.alibaba.fastjson.JSON;
import com.drpeng.sec.entity.SecOrganize;
import com.drpeng.sec.service.ISecOrganizeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhaoyp on 2016/5/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SecOrganizeServiceImplTest {
    private static Logger logger = LoggerFactory.getLogger(SecOrganizeServiceImplTest.class);
    @Resource
    private ISecOrganizeService secOrganizeService = null;
    @Test
    public void findAllSecOrganize() throws Exception {
        List<SecOrganize> secOrganizeList= secOrganizeService.findAllSecOrganize(null);
        logger.info(JSON.toJSONString(secOrganizeList));
    }

}