package com.riti.dao;

import com.riti.pojo.RfidUser;

public interface RfidUserMapper {
    int deleteByPrimaryKey(String rfiduserid);

    int insert(RfidUser record);

    int insertSelective(RfidUser record);

    RfidUser selectByPrimaryKey(String rfiduserid);

    int updateByPrimaryKeySelective(RfidUser record);

    int updateByPrimaryKey(RfidUser record);
}