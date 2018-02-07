package com.riti.service.impl;

import com.riti.dao.TagListMapper;
import com.riti.pojo.TagList;
import com.riti.service.ITagListService;
import com.riti.service.expection.TagListException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by brander on 2018/2/7
 */
@Service("iTagListService")
public class TagListServiceImpl implements ITagListService{

    @Autowired
    private TagListMapper tagListMapper;

    @Override
    public TagList addTagList(String userId, String uid) {
        try {
            TagList deviceList = new TagList();
            deviceList.setUid(uid);
            deviceList.setCoolUserId(userId);

            TagList dev = tagListMapper.getDevice(deviceList);
            if (dev != null) {// 判断数据库中是否有相同数据
                return dev;
            } else {
                String id = UUID.randomUUID().toString();
                deviceList.setCoolTagListId(id);
                tagListMapper.insert(deviceList);
                return deviceList;
            }
        } catch (Exception e) {
            throw new TagListException("插入失败");
        }
    }

    @Override
    public List<TagList> getTagDeviceLists(String userId) {
        List<TagList> deviceLists = tagListMapper.getDeviceList(userId);
        if (deviceLists != null && deviceLists.size() > 0) {
            return deviceLists;
        } else {
            throw new TagListException("此用户无标签数据");
        }
    }
}
