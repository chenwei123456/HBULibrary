package com.hbu.dao;

import com.hbu.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface TypeDao {

    /**
     * 查询所有分类
     * @return
     */
    List<Type> queryAllType();

    /**
     * 更新分类名字
     * @param sortId
     * @param sortName
     * @return 如果影响行数=>1，表示更新的记录行数
     */
    int updateById(@Param("sortId") long sortId, @Param("sortName") String sortName);

    /**
     * 增加分类
     * @param sortName
     * @return
     */
    int insertType(@Param("sortName") String sortName);
}
