package com.riti.dao;

import com.riti.pojo.RfidOrderRecent;

public interface RfidOrderRecentMapper {
    int deleteByPrimaryKey(String rfididname);

    int insert(RfidOrderRecent record);

    int insertSelective(RfidOrderRecent record);

    RfidOrderRecent selectByPrimaryKey(String rfididname);

    int updateByPrimaryKeySelective(RfidOrderRecent record);

    int updateByPrimaryKey(RfidOrderRecent record);
}