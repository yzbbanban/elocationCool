package com.riti.dao;

import com.riti.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String coolUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String coolUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUserByName(String userName);

    List<User> findUserByCompanyId(User user);

    int updateUserCompany(User user);

    User findUserByCompany(User user);

    int updateUserCompanyLevel(User user);
}