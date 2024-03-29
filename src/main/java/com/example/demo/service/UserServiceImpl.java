package com.example.demo.service;

import com.example.demo.bean.UserBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UserBean> getUser() {
        return userMapper.getUser();
    }

    @Override
    public UserBean getUserById(Integer id) {

        return  userMapper.getUserById(id);
    }

    @Override
    public UserBean getUserName(String userName, String passWord) {
        return userMapper.getUserName(userName,passWord);
    }

    @Override
    public Integer delectUser(Integer id) {

        return userMapper.delectUser(id);
    }
}
