package com.example.demo.mapper;

import com.example.demo.bean.UserBean;

import java.util.List;


public interface UserMapper {


    public List<UserBean> getUser();

    UserBean getUserById(Integer id);
}
