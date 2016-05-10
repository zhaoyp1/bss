package com.drpeng.sec.service.impl;

import com.drpeng.sec.dao.ISecOperatorDAO;
import com.drpeng.sec.entity.SecOperator;
import com.drpeng.sec.service.ISecOperatorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dongwh on 16/5/9.
 */
@Service("operatorService")
public class SecOperatorServiceImpl implements ISecOperatorService {

    @Resource
    private ISecOperatorDAO secOperatorDAO;

    public SecOperator findOperatorById(int id) {
        SecOperator secOperator = null;
        if(id>0){
            secOperator = secOperatorDAO.findById(id);
        }
        return secOperator;
    }

    public SecOperator findOperatorByCodeAndPw(String code, String password) {
        SecOperator secOperator = null;
        if((null!=code && !"".equals(code)) && (null!=password && !"".equals(password))){
            secOperator = secOperatorDAO.findByCodeAndPw(code, password);
        }
        return secOperator;
    }
}
