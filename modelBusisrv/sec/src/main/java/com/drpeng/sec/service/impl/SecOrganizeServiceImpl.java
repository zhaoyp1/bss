package com.drpeng.sec.service.impl;

import com.drpeng.sec.common.PageData;
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

    public List<PageData> findAllSecOrganize(PageData pageData) {
        if( null != pageData ){
            if(pageData.containsKey("startIndex")&&pageData.containsKey("pageSize")) {
                String startindex = pageData.getString("startIndex");
                String pagesize = pageData.getString("pageSize");
                if(!"".equals(startindex)&&!"".equals(pagesize)) {
                    int startIndex = Integer.parseInt(startindex);
                    int pageSize = Integer.parseInt(pagesize);
                    pageData.put("startIndex", startIndex);
                    pageData.put("pageSize", pageSize);
                }
            }
        }else{
            pageData = new PageData();
        }
        List<PageData> pageDatas = secOrganizeDAO.organizeList(pageData);
        return pageDatas;

    }
}
