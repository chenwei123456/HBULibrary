package com.hbu.service.impl;

import com.hbu.dao.AdminDao;
import com.hbu.entity.Admin;
import com.hbu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@ResponseBody
public class AdminServiceImpl implements AdminService {

    //注入Service依赖

    @Autowired
    AdminDao adminDao;

    public int deleteById(long adminId) {
        return adminDao.deleteAdmin(adminId);
    }

    public int insert(Admin admin) {
        return adminDao.insertAdmin(admin);
    }

    public Admin checkLogin(String adminName, String adminPassword) {
        return adminDao.selectByNameAndPwd(adminName,adminPassword);
    }

    public List<Admin> queryAll() {
        return adminDao.queryAllAdmin();
    }
}
