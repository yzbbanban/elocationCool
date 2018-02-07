package com.riti.service;

import com.riti.pojo.User;

import java.util.List;

/**
 * Created by brander on 2018/2/2
 */
public interface IUserService {

    User login(String name, String password);

    User regist(String name, String nick, String password);

    List<User> getUserList(String userId, String companyId, int level);

    User logOffCompany(String userId);
}
