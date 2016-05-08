package com.demo.servieImpl;

import com.demo.Model.User;
import com.demo.mapper.LoginMapper;
import com.demo.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by somoOne on 2016/4/13.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource(name="loginMapper")
    private LoginMapper loginMapper;
    public boolean loginServiceMe(String email, String pwd) {
        System.out.println("Email:"+email+"\n"+"Pwd"+pwd);
        User passwd=loginMapper.login(email);
        System.out.println("Sql:"+loginMapper.login(email).getPwd()+"\n");
        if (passwd.getPwd().equals(pwd))
            return true;
        return false;
    }
    public boolean resetPwd(String email) {

        return false;
    }

}
