package com.riti.dao;

import com.riti.pojo.Company;

import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(String coolCompanyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String coolCompanyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    Company findCompanyByName(String coolCompanyName);

    List<Company> findCompanyByBlurName(String companyName);
}