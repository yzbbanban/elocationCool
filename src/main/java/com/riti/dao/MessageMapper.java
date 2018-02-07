package com.riti.dao;

import com.riti.pojo.Message;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(String coolMessageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String coolMessageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> getMessageListById(String userId);

    int deleteMessageById(Message message);
}