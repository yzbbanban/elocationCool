package com.riti.controller;

import com.riti.consts.ServiceResult;
import com.riti.pojo.Company;
import com.riti.pojo.User;
import com.riti.service.IUserService;
import com.riti.service.expection.*;
import com.riti.utils.ResultCode;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by brander on 2018/2/5
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;

    // 登录
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<User> login(String name, String password) {
        User user = iUserService.login(name, password);
//        System.out.println("user: " + user);
        return new ResultCode(user, "登陆成功");
    }

    // 注册
    @RequestMapping(value = "regist.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<User> regist(String name, String nick, String password) {
        User user = iUserService.regist(name, nick, password);
//        System.out.println(user);
        return new ResultCode(user, "注册成功");
    }

    /**
     * 获取用户列表
     *
     * @param companyId
     * @return
     */
    @RequestMapping(value = "getUserList.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<List<User>> execute(String userId, String companyId, int level) {
        List<User> users=iUserService.getUserList(userId, companyId, level);
        return new ResultCode(users,"查找成功");
    }

    /**
     * 更新用户的公司信息
     *
     * @param company
     * @return
     */
    @RequestMapping(value = "updateUserCompany.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<User> updateUserByCompany(String userId, Company company) {
        System.out.println("userId: " + userId + "company: " + company);
        ResultCode<User> result = new ResultCode<User>();

        return result;
    }

    /**
     * 取消用户的公司绑定
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "logOffUserCompany.do", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<User> logOffCompany(String userId) {
        System.out.println(userId);
        User user = iUserService.logOffCompany(userId);
        return new ResultCode(user, "取消绑定成功");
    }

    // 无用户
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public ResultCode<String> handleUserNotFound(UserNotFoundException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

    // 密码错误
    @ExceptionHandler(PasswordException.class)
    @ResponseBody
    public ResultCode<String> handlePassword(PasswordException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

    // 用户名有误
    @ExceptionHandler(UserNameException.class)
    @ResponseBody
    public ResultCode<String> handleUserName(UserNameException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

    // 更新用户信息失败
    @ExceptionHandler(UserUpdateException.class)
    @ResponseBody
    public ResultCode<String> handleUserUpdate(UserUpdateException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }

    // 总管理员不能删除公司信息
    @ExceptionHandler(ManagerException.class)
    @ResponseBody
    public ResultCode<String> handleManager(ManagerException e) {
//        e.printStackTrace();
        return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
    }
}
