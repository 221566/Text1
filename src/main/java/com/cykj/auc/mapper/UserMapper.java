package com.cykj.auc.mapper;

import com.cykj.auc.bean.UserInfo;

import java.util.List;

public interface UserMapper {
    void addUser (UserInfo userInfo);
    void deleteUserById(UserInfo userInfo);
    void updateUser(UserInfo userInfo);
    List<UserInfo> findAll();

}
