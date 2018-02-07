package com.riti.service;

import com.riti.pojo.Company;
import com.riti.pojo.User;

import java.util.List;

/**
 * Created by brander on 2018/2/6
 */
public interface ICompanyService {

    User setUserCompany(String userId, Company company);

    Company getUserCompany(String userId);

    List<Company> findCompany(String companyName);
}
