package com.cttdy.generic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

    /**
     * 登录页
     *
     * @return
     */
    @RequestMapping("/user/login")
    public String showLogin() {
        return "login";
    }

}
