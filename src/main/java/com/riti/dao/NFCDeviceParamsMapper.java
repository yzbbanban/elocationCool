package com.riti.dao;

import com.riti.pojo.NFCDeviceParams;
import com.riti.pojo.QueryDeviceParams;

import java.util.List;

public interface NFCDeviceParamsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NFCDeviceParams record);

    int insertSelective(NFCDeviceParams record);

    NFCDeviceParams selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NFCDeviceParams record);

    int updateByPrimaryKey(NFCDeviceParams record);

    int updateByUid(NFCDeviceParams dp);

    NFCDeviceParams findByUid(Integer uid);

    List<NFCDeviceParams> findAll(String company);
}