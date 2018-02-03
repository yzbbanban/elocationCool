package com.riti.dao;

import com.riti.pojo.TagList;

public interface TagListMapper {
    int deleteByPrimaryKey(String coolTagListId);

    int insert(TagList record);

    int insertSelective(TagList record);

    TagList selectByPrimaryKey(String coolTagListId);

    int updateByPrimaryKeySelective(TagList record);

    int updateByPrimaryKey(TagList record);
}