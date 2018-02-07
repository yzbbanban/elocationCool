package com.riti.service;

import com.riti.pojo.TagList;

import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
public interface ITagListService {
    TagList addTagList(String userId, String uid);

    List<TagList> getTagDeviceLists(String userId);

}
