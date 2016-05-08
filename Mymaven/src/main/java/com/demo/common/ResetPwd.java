package com.demo.common;

import sun.security.provider.MD5;

import java.util.Random;

/**
 * Created by One on 2016/5/8.
 */
public class ResetPwd {
    public String getResetPwdUrl(String email,String username){
        int rand = new Random().nextInt();
        rand = rand > 0 ? rand : (rand * -1 + 1);//防止随即到负数或者0
        /*return MD5.encode(username + email +
                new Random(System.currentTimeMillis()).nextInt(rand ));*/
        return "null";
    }
}
