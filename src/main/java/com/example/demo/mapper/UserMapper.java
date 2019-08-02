package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {


    public List<UserBean> getUser();

    UserBean getUserById(Integer id);

    UserBean getUserName(@Param("userName")String username, @Param("passWord")String passWord);

    Integer delectUser(Integer id);
}
