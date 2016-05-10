package com.drpeng.sec.service.impl;

import com.drpeng.sec.entity.SecOperator;
import com.drpeng.sec.service.ISecOperatorService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dongwh on 16/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SecOperatorServiceImplTest {

    private static Logger logger = LoggerFactory.getLogger(SecOperatorServiceImplTest.class);

    @Resource
    private ISecOperatorService secOperatorService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findOperatorById() throws Exception {
        SecOperator secOperator = secOperatorService.findOperatorById(1);
        logger.info(secOperator.getOperatorId()+"");
        logger.info(secOperator.getPassword());
    }

    @Test
    public void findOperatorByCodeAndPw() throws Exception {
        SecOperator secOperator = secOperatorService.findOperatorByCodeAndPw("1001", "123456");
        logger.info(secOperator.getOperatorId()+"");
        logger.info(secOperator.getCode()+"");
        logger.info(secOperator.getPassword());

        SecOperator secOperator2 = secOperatorService.findOperatorByCodeAndPw("1002", "123456");
        logger.info(secOperator2.getOperatorId()+"");
        logger.info(secOperator2.getCode()+"");
        logger.info(secOperator2.getPassword());
    }

}