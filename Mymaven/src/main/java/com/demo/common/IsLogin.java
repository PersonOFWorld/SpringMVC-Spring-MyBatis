package com.demo.common;

import org.springframework.aop.MethodBeforeAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Created by One on 2016/4/21.
 */
public class IsLogin {

    public boolean isLogin(HttpServletRequest request){
        HttpSession session=request.getSession();
        if (session==null)
            return true;
        return false;
    }
}
