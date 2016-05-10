package com.drpeng.sec.dao;


import com.drpeng.modelCommon.common.PageData;
import com.drpeng.sec.entity.SecOrganize;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISecOrganizeDAO {

      public List<PageData> organizeList(PageData parameterMap);

      public boolean insert(SecOrganize organize);

      public boolean delete(int id);

      public  boolean update(SecOrganize organize);

      public PageData findById(String id);

}