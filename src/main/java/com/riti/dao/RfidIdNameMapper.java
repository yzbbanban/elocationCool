package com.riti.dao;

import com.riti.pojo.RfidIdName;

public interface RfidIdNameMapper {
    int deleteByPrimaryKey(Integer rfidorderid);

    int insert(RfidIdName record);

    int insertSelective(RfidIdName record);

    RfidIdName selectByPrimaryKey(Integer rfidorderid);

    int updateByPrimaryKeySelective(RfidIdName record);

    int updateByPrimaryKey(RfidIdName record);
}