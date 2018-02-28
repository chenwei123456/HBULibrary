package com.hbu.service.impl;

import com.hbu.dao.ValidDao;
import com.hbu.entity.Valid;
import com.hbu.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@Repository
public class ValidServiceImpl implements ValidService {

    @Autowired
    ValidDao validDao;

    public List<Valid> queryAll() {
        return validDao.queryAllValids();
    }
}
