package com.hbu.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenwei on 2017/11/25.
 */
public class IndexController {


    @RequestMapping("/login")
    public String login(){
            return "login";
        }

    }
