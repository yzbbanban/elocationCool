package com.riti.controller;

import java.util.List;

import javax.annotation.Resource;

import com.riti.consts.ServiceResult;
import com.riti.pojo.TagList;
import com.riti.service.ITagListService;
import com.riti.service.expection.TagListException;
import com.riti.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/tagList")
public class TagListController {
    @Autowired
    private ITagListService tagListService;

    @RequestMapping(value = "/sendTagList", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<TagList> setTagList(String userId, String uid) {
        System.out.println("sendTagList: " + userId + "," + uid);
        TagList deviceList = tagListService.addTagList(userId, uid);
        return new ResultCode(deviceList, "上传成功");
    }

    @RequestMapping(value = "/getTagList", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<List<TagList>> getTagList(String userId) {
        System.out.println("getTagList: " + userId);
        List<TagList> deviceLists = tagListService.getTagDeviceLists(userId);
        return new ResultCode(deviceLists, "获取数据成功");
    }

    // 保存公司失败
    @ExceptionHandler(TagListException.class)
    @ResponseBody
    public ResultCode<String> getTagListError(TagListException e) {
        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

}
