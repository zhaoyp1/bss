package com.drpeng.sec.dao;

import com.drpeng.sec.entity.SecOperator;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongwh on 16/5/9.
 */
@Repository
public interface ISecOperatorDAO {

    public List<SecOperator> findAll();

    public SecOperator findById(int id);

}
