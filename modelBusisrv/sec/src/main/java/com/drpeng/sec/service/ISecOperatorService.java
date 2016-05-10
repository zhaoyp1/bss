package com.drpeng.sec.service;

import com.drpeng.sec.entity.SecOperator;


/**
 * Created by dongwh on 16/5/9.
 */
public interface ISecOperatorService {

    public SecOperator findOperatorById(int id);

    /**
     * query operator by code and password
     */
    public SecOperator findOperatorByCodeAndPw(String code, String password);
}
