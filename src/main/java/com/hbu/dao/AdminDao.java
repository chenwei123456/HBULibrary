package com.hbu.dao;

import com.hbu.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface AdminDao {

/**
 *                    .::::.
 *                  .::::::::.
 *                 :::::::::::
 *             ..:::::::::::'
 *           '::::::::::::'
 *             .::::::::::
 *        '::::::::::::::..
 *             ..::::::::::::.
 *           ``::::::::::::::::
 *            ::::``:::::::::'        .:::.
 *           ::::'   ':::::'       .::::::::.
 *         .::::'      ::::     .:::::::'::::.
 *        .:::'       :::::  .:::::::::' ':::::.
 *       .::'        :::::.:::::::::'      ':::::.
 *      .::'         ::::::::::::::'         ``::::.
 *  ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 *                    '.:::::'                    ':'````..
 */


    /**
     * 查询所有管理员
     * @return
     */
    List<Admin> queryAllAdmin();


    /**
     * 增加管理员
     * @param admin
     * @return 如果影响行数=>1，表示插入的记录行数
     */
    int insertAdmin(Admin admin);

    /**
     * 删除管理员
     * @param adminId
     * @return 如果影响行数=>1，表示更新的记录行数
     */
    int deleteAdmin(@Param("adminId") long adminId);

    Admin selectByNameAndPwd(@Param("adminName") String adminName,@Param("adminPassword") String adminPassword);

}
