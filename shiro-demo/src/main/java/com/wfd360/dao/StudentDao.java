package com.wfd360.dao;

import com.wfd360.model.PageData;

import java.util.List;

/**
 * Created by Administrator on 2018/10/29.
 */
public interface StudentDao {
    /**
     * 根据条件获取Student对象
     * @param pageData
     * @return
     */
    List<PageData> getAll(PageData pageData);
}
