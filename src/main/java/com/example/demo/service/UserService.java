package com.example.demo.service;

import com.example.demo.bean.UserBean;

import java.util.List;

public interface UserService {

    public List<UserBean> getUser();

    UserBean getUserById(Integer id);

    UserBean getUserName(String userName, String passWord);

    Integer delectUser(Integer id);
}
