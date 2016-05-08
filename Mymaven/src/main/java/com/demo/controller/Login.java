package com.demo.controller;

import com.demo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * Created by somoOne on 2016/4/13.
 */
@Controller
public class Login {
    @Resource(name="loginServiceImpl")
    private LoginService loginService;
    @RequestMapping("/signin.do")
    public void signin(HttpServletRequest request,HttpServletResponse response){
        System.out.print(request.getParameter("email"));
    }
    //用户登录
    @RequestMapping("/userLogin.htm")//{email}/{pwd}/
    public String login(HttpServletRequest request, HttpServletResponse response){
        String email=request.getParameter("email");
        String pwd=request.getParameter("pwd");
        boolean a=loginService.loginServiceMe(email,pwd);
        System.out.println(a);
        if(a==true){
            HttpSession session=request.getSession();
            session.setAttribute("email",email);
            session.setAttribute("pwd",pwd);
            return "show";
        }
        return "sign";
    }
    //邮箱重置密码
    @RequestMapping("/resetPwd.htm")
    public void resetPwd(HttpServletRequest request){
        String email=request.getParameter("email");
        String username=request.getParameter("username");
        LinkedHashMap<String,String> hashMap=new LinkedHashMap<String, String>();
        //这里先用email代替，后面用email+usernameMD5加密保存
        hashMap.put("emial",email);
    }
}
