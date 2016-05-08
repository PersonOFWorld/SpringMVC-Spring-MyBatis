package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by somoOne on 2016/4/13.
 */
@Controller
public class IntoLoginPage {
    @RequestMapping("/intoLoginPage.htm")
    public String intoLoginPage(){
        return "Login";
    }
    @RequestMapping("/toindex.htm")
    public String indexEnter()
    {
        return "index";
    }
    @RequestMapping("/signin.htm")
    public String singnin(){
        return "signin";
    }
    @RequestMapping("/forgetPwd.ht")
    public String forgetPwd(){
        return "resetPwd";
    }
}
