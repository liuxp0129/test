package com.example.demo.controller;


import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;



    @RequestMapping("/getUser")
    @ResponseBody
    public List<UserBean> getUser() {

        return userService.getUser();
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public UserBean getUserById(Integer id){

        UserBean user = userService.getUserById(id);

        return user;
    }

    @RequestMapping("/getUserName")
    @ResponseBody
    public UserBean getUserName(@Param("userName") String userName, @Param("passWord")String passWord){

      UserBean user =  userService.getUserName(userName,passWord);
      return user;
    }
    @RequestMapping("/delectUser")
    @ResponseBody
    public String delectUser(Integer id){
      Integer i=  userService.delectUser(id);
      if (i<=0){
          return "hh";
      }
      return "11";
    }
}
