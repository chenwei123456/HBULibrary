package com.hbu.dao;

import com.hbu.entity.Identity;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface IdentityDao {
    List<Identity> queryAllIdentities();

}
