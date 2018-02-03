package com.riti.dao;

import com.riti.pojo.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(String coolCompanyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String coolCompanyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}