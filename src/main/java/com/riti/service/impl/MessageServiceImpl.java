package com.riti.service.impl;

import com.riti.dao.CompanyMapper;
import com.riti.dao.MessageMapper;
import com.riti.dao.UserMapper;
import com.riti.pojo.Message;
import com.riti.pojo.User;
import com.riti.service.IMessageService;
import com.riti.service.expection.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by brander on 2018/2/7
 */
@Service("iMessageService")
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CompanyMapper companyMapper;


    @Override
    public Message sendMessageToManager(String userId, String companyName, String messageDetail) {
        Message message = new Message();
        try {

            // 根据公司名获取公司id
            String companyId = companyMapper.findCompanyByName(companyName)
                    .getCoolCompanyId();
            User user = new User();
            // 设置为管理者
            user.setCoolCompanyId(companyId);
            user.setCoolUserLevel(1);
            // 查询公司管理者userId
            User u = userMapper.findUserByCompany(user);
            // 设置接收方为公司管理者
            message.setCoolMessageHandleId(u.getCoolUserId());
            message.setCoolUserId(userId);
            String id = UUID.randomUUID().toString();
            message.setCoolMessageId(id);
            // 设置基本信息
            message.setCoolCompanyId(companyId);
            message.setCoolMessageDetail(messageDetail);
            message.setIsdelete(0);
            int row = messageMapper.insert(message);
            if (row == 1) {
                return message;
            } else {
                throw new MessageException("消息发送失败，请重试");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new MessageException("消息发送失败，请重试");
        }
    }

    /**
     * 获取消息列表
     *
     * @param userId
     * @return
     */
    @Override
    public List<Message> getMessageList(String userId) {
        List<Message> messages = messageMapper.getMessageListById(userId);
        if (messages != null && messages.size() > 0) {
            return messages;
        } else {
            throw new MessageException("没有消息");
        }
    }

    @Override
    public Message setApplyMessage(String messageId, String companyId, String apply_userId) {
        // 设置userId为公司ID
        User user = new User();
        user.setCoolCompanyId(companyId);
        user.setCoolUserId(apply_userId);
        user.setCoolUserLevel(20);
        // 存入user信息
        int n = userMapper.updateUserCompanyLevel(user);
        Message message = new Message(companyId, apply_userId,1);
        // 删除消息
        int row = messageMapper.deleteMessageById(message);
        if (n == 1 && row == 1) {
            return message;
        } else {
            throw new MessageException("同意失败");
        }
    }
}
