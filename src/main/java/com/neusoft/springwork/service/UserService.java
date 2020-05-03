package com.neusoft.springwork.service;

import com.neusoft.springwork.entity.UserInfo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface UserService {
    /**
     * 新增用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/2 21:29
     */
    int insertUser(UserInfo userInfo);
    
    /*
     * 查询用户
     * @author xhy
     * @params [userInfo]
     * @return java.util.ArrayList<com.neusoft.springwork.entity.UserInfo>
     * @when 2020/5/3 10:09
     */
    List<UserInfo> findUser(UserInfo userInfo);
    
    /*
     * 修改用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:18
     */
    int updateUser(UserInfo userInfo);
    
    /*
     * 删除用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:22
     */
    int deleteUser(UserInfo userInfo);
    
    /*
     * 真删除用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:28
     */
    int realDeleteUser(UserInfo userInfo);
}
