package com.hbu.service.impl;

import com.hbu.dao.IdentityDao;
import com.hbu.entity.Identity;
import com.hbu.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@Repository
public class IdentityServiceImpl implements IdentityService {

    @Autowired
    IdentityDao identityDao;

    public List<Identity> queryAll() {
        return identityDao.queryAllIdentities();
    }
}
