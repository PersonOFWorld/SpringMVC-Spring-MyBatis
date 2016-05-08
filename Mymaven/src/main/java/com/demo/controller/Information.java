package com.demo.controller;

import com.demo.testSpring1.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by somoOne on 2016/4/13.
 */
@Controller
public class Information{
    @RequestMapping("/myInfo.htm")
    public String getInfo(HttpServletRequest request){
        return "show";
    }

}
