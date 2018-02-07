package com.riti.service.impl;

import com.riti.dao.UserMapper;
import com.riti.pojo.User;
import com.riti.service.IUserService;
import com.riti.service.expection.*;
import com.riti.utils.MD5Util;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by brander on 2018/2/5
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登陆
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public User login(String name, String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new PasswordException("密码空");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new UserNotFoundException("用户名空");
        }
        User user = userMapper.findUserByName(name.trim());
        if (user == null) {
            throw new UserNotFoundException("用户名错误");
        }

        System.out.println("login: " + user);
        String pwd = MD5Util.MD5EncodeUtf8(password);
        System.out.println("login pwd: " + pwd);
        if (pwd.equals(user.getCoolUserPassword())) {
            user.setCoolUserPassword("");
            return user;
        }
        throw new PasswordException("密码错误");
    }

    /**
     * 注册
     *
     * @param name
     * @param nick
     * @param password
     * @return
     */
    @Override
    public User regist(String name, String nick, String password) {
        // 检查name, 不能重复
        if (name == null || name.trim().isEmpty()) {
            throw new UserNameException("请填写用户名");
        }
        User one = userMapper.findUserByName(name);
        if (one != null) {
            throw new UserNameException("用户已注册，请重新填写用户名");
        }
        // 检查密码
        if (password == null || password.trim().isEmpty()) {
            throw new PasswordException("请填写密码");
        }

        // 检查nick
        if (nick == null || nick.trim().isEmpty()) {
            nick = name;
        }
        String id = UUID.randomUUID().toString();
        String token = "";

        password = MD5Util.MD5EncodeUtf8(password);
        // 设置user信息
        // id,登录名，密码，token，昵称，创建时间，用户权限为最高
        User user = new User();
        user.setCoolUserPassword(password);
        user.setCoolUserId(id);
        user.setCoolCompanyId("");
        user.setCoolUserToken(token);
        user.setCoolUserGender("F");
        user.setCoolUserLevel(1);
        user.setCoolUserNick(nick);
        user.setCoolUserEmail("");
        user.setCoolUserName(name);
        int n = userMapper.insert(user);
        if (n != 1) {
            throw new RuntimeException("添加用户失败!");
        }
        user.setCoolUserPassword("");
        return user;
    }

    /**
     * 获取用户列表
     *
     * @param userId
     * @param companyId
     * @param level
     * @return
     */
    @Override
    public List<User> getUserList(String userId, String companyId, int level) {
        User user = new User();
        user.setCoolCompanyId(companyId);
        user.setCoolUserId(userId);
        user.setCoolUserLevel(level);
        List<User> users = new ArrayList<User>();
        users = userMapper.findUserByCompanyId(user);
        // System.out.println("ssss");
        User u = userMapper.selectByPrimaryKey(userId);
        if (u != null) {//添加第一个位置
            users.add(0, u);
        } else {
            throw new UserNotFoundException("没有用户");
        }
        System.out.println(users);
        if (users != null && users.size() > 0) {
            return users;
        } else {
            throw new UserNotFoundException("没有用户");
        }
    }

    @Override
    public User logOffCompany(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user.getCoolUserLevel() == 1) {
            // TODO 不能删除因为是总管理员
            throw new ManagerException("总管理员不能删除公司信息");
        }
        user.setCoolCompanyId("");
        user.setCoolUserId(userId);
        int row = userMapper.updateByPrimaryKey(user);
        if (row == 1) {
            user = userMapper.selectByPrimaryKey(userId);
        } else {
            // TODO 更新user信息失败 异常
            throw new UserUpdateException("更新用户信息失败");
        }
        user.setCoolUserPassword("");
        return user;
    }
}
