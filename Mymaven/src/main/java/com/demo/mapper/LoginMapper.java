package com.demo.mapper;


import com.demo.Model.User;

/**
 * Created by somoOne on 2016/4/13.
 */
//@Repository
public interface LoginMapper extends SqlMapper{
    User login(String email);
}
