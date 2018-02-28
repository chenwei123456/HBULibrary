package com.hbu.service.impl;

import com.hbu.dao.TypeDao;
import com.hbu.entity.Type;
import com.hbu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@Repository
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeDao typeDao;
    public List<Type> queryAll() {
        return typeDao.queryAllType();
    }
}
