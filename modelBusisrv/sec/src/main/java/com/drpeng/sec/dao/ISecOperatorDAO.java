package com.drpeng.sec.dao;

import com.drpeng.sec.entity.SecOperator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongwh on 16/5/9.
 */
@Repository
public interface ISecOperatorDAO {

    public List<SecOperator> findAll();

    public SecOperator findById(int id);

    public SecOperator findByCodeAndPw(@Param("code") String code, @Param("password") String password);

}
