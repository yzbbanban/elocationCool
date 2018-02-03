package com.riti.dao;

import com.riti.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String coolUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String coolUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}