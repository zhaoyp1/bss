package com.drpeng.sec.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.service.ISecOrganizeService;
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
public class SecOrganizeServiceImplTest {
    private static Logger logger = LoggerFactory.getLogger(SecOrganizeServiceImplTest.class);
    @Resource
    private ISecOrganizeService secOrganizeService;
    @Test
    public void findAllSecOrganize() throws Exception {
        PageData pageDate = new PageData();
        //pageDate.put("startIndex","1");
        //pageDate.put("pageSize","2");
        List<PageData> secOrganizeList= secOrganizeService.findAllSecOrganize(pageDate);
        logger.info(JSON.toJSONString(secOrganizeList));
    }
    @Test
    public void findSecOrganizeById(){
        PageData pageDate =secOrganizeService.findSecOrganizeById("1");
        logger.info(JSONObject.toJSONString(pageDate));
    }

}