package com.riti.dao;

import com.riti.pojo.NFCDeviceParams;

public interface NFCDeviceParamsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NFCDeviceParams record);

    int insertSelective(NFCDeviceParams record);

    NFCDeviceParams selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NFCDeviceParams record);

    int updateByPrimaryKey(NFCDeviceParams record);
}