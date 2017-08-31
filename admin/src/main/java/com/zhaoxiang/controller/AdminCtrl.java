package com.zhaoxiang.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/8/27 16:01
 */
@Controller
@RequestMapping("/user")
public class AdminCtrl {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(@RequestParam Map<String, String> params) {

        String username = params.get("username");
        String password = params.get("password");
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated()) {
            try {
                subject.login(token);
                Session session = subject.getSession();
                session.setAttribute("user", username);
            } catch (AuthenticationException e) {
                throw new UnknownAccountException("用户名或密码错误");
            }
        }

        return "redirect:/home";
    }

    @RequestMapping("/logout")
    public String userLogout() {

        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/";
    }
}
