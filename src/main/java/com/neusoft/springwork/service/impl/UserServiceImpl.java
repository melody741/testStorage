package com.neusoft.springwork.service.impl;

import com.neusoft.springwork.dao.UserDao;
import com.neusoft.springwork.entity.UserInfo;
import com.neusoft.springwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhy
 * @Date: 2020/4/30 14:00
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo){
        //业务逻辑实现
        String userName = userInfo.getName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "aaa";
            userInfo.setName(userName);
        }
        return userDao.saveUser(userInfo);
    }

    @Override
    public List<UserInfo> findUser(UserInfo userInfo) {
        List<UserInfo> list=userDao.askUser(userInfo);
        for(int i=0;i<list.size();i++){
            UserInfo userInfo1 = list.get(i);
            String sex=userInfo1.getSex();
            switch(sex){
                case "0": userInfo1.setSex("男");
                        break;
                case "1": userInfo1.setSex("女");
                        break;
                case "2": userInfo1.setSex("未知");
                    break;
            }
            list.set(i, userInfo1);
        }
        return list;
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }

    @Override
    public int deleteUser(UserInfo userInfo) {
        return userDao.deleteUser(userInfo);
    }

    @Override
    public int realDeleteUser(UserInfo userInfo) {
        return userDao.realDeleteUser(userInfo);
    }
}