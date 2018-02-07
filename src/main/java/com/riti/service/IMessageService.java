package com.riti.service;

import com.riti.pojo.Message;

import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
public interface IMessageService {
    Message sendMessageToManager(String userId, String companyName, String messageDetail);

    List<Message> getMessageList(String userId);

    Message setApplyMessage(String messageId, String companyId, String apply_userId);
}
