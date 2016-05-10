package com.drpeng.sec.service.impl;

 import com.drpeng.modelCommon.common.PageData;
 import com.drpeng.sec.dao.ISecOrganizeDAO;
import com.drpeng.sec.entity.SecOrganize;
import com.drpeng.sec.service.ISecOrganizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaoyp on 2016/5/5.
 */
@Service("organizeService")
public class SecOrganizeServiceImpl implements ISecOrganizeService {

    @Resource
    private ISecOrganizeDAO secOrganizeDAO;

    public List<PageData> findAllSecOrganize(PageData pageData) throws NumberFormatException{
        if( null != pageData ){
            pageData.checkPageParameter();
        }
        List<PageData> pageDatas = secOrganizeDAO.organizeList(pageData);
        return pageDatas;

    }



    public PageData findSecOrganizeById(String id) {

        if( null == id || "".equals(id)){
            throw new  IllegalArgumentException("id must not be null");
        }
        PageData pageData = secOrganizeDAO.findById(id);
        return pageData;
    }
}
