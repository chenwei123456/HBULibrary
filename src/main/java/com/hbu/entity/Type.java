package com.hbu.entity;

/**
 * Created by chenwei on 2017/11/24.
 */
public class Type implements java.lang.reflect.Type {

    //图书分类

    private Long sortId;

    private String sortName;

    public Long getSortId() {

        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public String toString() {
        return "Type{" + "sortId=" + sortId + ", sortName='" + sortName + '\'' + '}';
    }
}
