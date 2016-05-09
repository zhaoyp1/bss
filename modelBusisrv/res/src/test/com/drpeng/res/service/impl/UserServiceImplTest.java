package com.drpeng.res.service.impl;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by zhaoyp on 2016/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceImplTest {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

    @Test
    public void getUserById() throws Exception {
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }

}