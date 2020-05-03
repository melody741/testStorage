package com.neusoft.springwork.controller;

import com.neusoft.springwork.entity.UserInfo;
import com.neusoft.springwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: xhy
 * @Date: 2020/5/2 20:06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo){
        //对参数进行一些简单处理
        userInfo.setCreateBy("1");
        userInfo.setIsDeleted(0);
        userInfo.setId(UUID.randomUUID().toString());
        return userService.insertUser(userInfo);
    }

    @RequestMapping("/findUser")
    public List<UserInfo> findUser(UserInfo userInfo){
        return userService.findUser(userInfo);
    }

    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo){
        userInfo.setCreateBy("1");
        return userService.updateUser(userInfo);
    }

    @RequestMapping("/deleteUser")
    public int deleteUser(UserInfo userInfo){
        userInfo.setCreateBy("1");
        return userService.deleteUser(userInfo);
    }

    @RequestMapping("/realDeleteUser")
    public int realDeleteUser(UserInfo userInfo){
        return userService.realDeleteUser(userInfo);
    }
}