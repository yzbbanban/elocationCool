package com.riti.dao;

import com.riti.pojo.RfidOrder;
import com.riti.pojo.RfidOrderKey;

public interface RfidOrderMapper {
    int deleteByPrimaryKey(RfidOrderKey key);

    int insert(RfidOrder record);

    int insertSelective(RfidOrder record);

    RfidOrder selectByPrimaryKey(RfidOrderKey key);

    int updateByPrimaryKeySelective(RfidOrder record);

    int updateByPrimaryKey(RfidOrder record);
}