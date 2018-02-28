package com.hbu.service;

import com.hbu.entity.Admin;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface AdminService {

    /**
     * 删除管理员
     * @param adminId
     * @return
     */
    int deleteById(long adminId);

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    int insert(Admin admin);

    /**
     * 登录验证
     * @param adminName
     * @param adminPassword
     * @return
     */
    Admin checkLogin(String adminName,String adminPassword);

    /**
     * 查询全部管理员
     * @return
     */
    List<Admin> queryAll();
}
