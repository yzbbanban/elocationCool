package com.riti.controller;

import java.util.List;

import javax.annotation.Resource;

import com.riti.consts.ServiceResult;
import com.riti.pojo.Message;
import com.riti.service.IMessageService;
import com.riti.service.expection.MessageException;
import com.riti.utils.ResultCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/message")
public class MessageController {
    @Resource
    private IMessageService messageService;

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<Message> sendMessage(String userId,
                                           String companyName, String messageDetail) {
        System.out.println(userId + "," + companyName + "," + messageDetail);
        Message message = messageService.sendMessageToManager(userId,
                companyName, messageDetail);
        System.out.println(message);
        return new ResultCode(message, "消息发送成功");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<List<Message>> getMessage(String userId) {
        System.out.println("getMessage: " + userId);
        List<Message> messages = messageService.getMessageList(userId);
        return new ResultCode(messages, "获取消息成功");
    }

    @RequestMapping(value = "/sendApplyMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<Message> sendApplyMessage(String messageId, String companyId, String apply_userId) {
        System.out.println("getMessage: " + apply_userId);
        Message message = messageService.setApplyMessage(messageId, companyId, apply_userId);
        return new ResultCode(message, "处理成功");
    }


    @ExceptionHandler(MessageException.class)
    @ResponseBody
    public ResultCode<String> handleMessage(MessageException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

}
