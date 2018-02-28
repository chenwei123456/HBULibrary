package com.hbu.dao;

import com.hbu.entity.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by chenwei on 2017/11/26.
 */
public class AdminDaoTest {

    @Autowired
    AdminDao adminDao;

    @Test
    public void queryAllAdmin() throws Exception{
        List<Admin> admins = adminDao.queryAllAdmin();
        for(Admin admin:admins){
            System.out.println(admin);
        }
    }

    @Test
    public void insertAdmin() throws Exception {
        //int update=adminDao.insertAdmin("王杰","123456");
        //System.out.println("update="+update);
    }

    @Test
    public void deleteAdmin() throws Exception {
        int delete=adminDao.deleteAdmin(2);
        System.out.println("delete="+delete);
    }

}
