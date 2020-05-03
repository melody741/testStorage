package com.neusoft.springwork.dao;

import com.neusoft.springwork.entity.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xhy
 * @Date: 2020/5/2 20:06
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/2 22:50
     */
    int saveUser(UserInfo userInfo);
    
    /*
     * 查询用户
     * @author xhy
     * @params [userInfo]
     * @return java.util.ArrayList<com.neusoft.springwork.entity.UserInfo>
     * @when 2020/5/3 10:08
     */
    List<UserInfo> askUser(UserInfo userInfo);

    /*
     * 修改用户信息
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:14
     */
    int updateUser(UserInfo userInfo);
    
    /*
     * 删除用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:23
     */
    int deleteUser(UserInfo userInfo);

    /*
     * 真删除用户
     * @author xhy
     * @params [userInfo]
     * @return int
     * @when 2020/5/3 15:23
     */
    int realDeleteUser(UserInfo userInfo);
}