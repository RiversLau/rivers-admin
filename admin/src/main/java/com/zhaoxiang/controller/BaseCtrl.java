package com.zhaoxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: RiversLau
 * Date: 2017/8/17 15:08
 */
@Controller
public class BaseCtrl {

    @RequestMapping("/")
    public String redirectLogin() {

        return "login";
    }

    @RequestMapping("/home")
    public String homePage() {

        return "home";
    }
}
