package com.drpeng.sec.service.impl;

import com.alibaba.fastjson.JSON;
import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.service.ISecRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by zhaoyp on 2016/5/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SecRoleServiceImplTest {
    private static Logger logger = LoggerFactory.getLogger(SecRoleServiceImplTest.class);
    @Resource
    private ISecRoleService   secRoleService;
    @Test
    public void findAllRoleByOperator() throws Exception {
        PageData pageData = new PageData();
        pageData.put("operator_id","1");
        pageData.put("code","dongwh");
        List<PageData> secRoleList= secRoleService.findRoleListByOperator(pageData);
        logger.info(JSON.toJSONString(secRoleList));
    }


}