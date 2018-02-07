package com.riti.dao;

import com.riti.pojo.NFCTemperatureData;
import com.riti.pojo.QueryTempParams;

import java.util.List;

public interface NFCTemperatureDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NFCTemperatureData record);

    int insertSelective(NFCTemperatureData record);

    NFCTemperatureData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NFCTemperatureData record);

    int updateByPrimaryKey(NFCTemperatureData record);

    int insertCollect(List<NFCTemperatureData> temperatures);

    List<NFCTemperatureData> findAll(QueryTempParams qtp);

    List<NFCTemperatureData> findAllByPage(QueryTempParams qtp);

    int getCount(QueryTempParams qtp);

    NFCTemperatureData findFirstTemp(int uid);
}