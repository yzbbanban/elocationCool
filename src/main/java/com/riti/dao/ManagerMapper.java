package com.riti.dao;

import com.riti.pojo.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String coolManagerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String coolManagerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}