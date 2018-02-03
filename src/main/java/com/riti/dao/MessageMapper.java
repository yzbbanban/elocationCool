package com.riti.dao;

import com.riti.pojo.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(String coolMessageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String coolMessageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}