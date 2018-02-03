package com.riti.dao;

import com.riti.pojo.NFCTemperatureData;

public interface NFCTemperatureDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NFCTemperatureData record);

    int insertSelective(NFCTemperatureData record);

    NFCTemperatureData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NFCTemperatureData record);

    int updateByPrimaryKey(NFCTemperatureData record);
}