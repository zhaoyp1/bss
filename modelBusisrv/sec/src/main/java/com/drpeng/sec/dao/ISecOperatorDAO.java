package com.drpeng.sec.dao;

import com.drpeng.sec.entity.SecOperator;

import java.util.List;

/**
 * Created by dongwh on 16/5/9.
 */
public interface ISecOperatorDAO {

    public List<SecOperator> findAll();

    public SecOperator findById(int id);

}
