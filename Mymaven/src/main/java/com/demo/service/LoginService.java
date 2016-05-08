package com.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by somoOne on 2016/4/13.
 */
@Service
public interface LoginService {
    boolean loginServiceMe(String email, String pwd);
    boolean resetPwd(String email);
}
