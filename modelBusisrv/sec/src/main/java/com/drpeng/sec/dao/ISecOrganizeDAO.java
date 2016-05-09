package com.drpeng.sec.dao;


import com.drpeng.sec.common.PageData;
import com.drpeng.sec.entity.SecOrganize;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ISecOrganizeDAO {

    public List<PageData> organizeList(PageData parameterMap);

    public boolean insert(SecOrganize organize);

    public boolean delete(int id);

    public boolean update(SecOrganize organize);

    public SecOrganize findById(int id);

}