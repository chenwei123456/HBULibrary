package com.hbu.dto;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by chenwei on 2017/11/24.
 */
public class Result {

    @JsonView(Views.Public.class)
    String msg;

    @JsonView(Views.Public.class)
    String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
