package com.riti.service.impl;

import com.riti.dao.CompanyMapper;
import com.riti.dao.UserMapper;
import com.riti.pojo.Company;
import com.riti.pojo.User;
import com.riti.service.ICompanyService;
import com.riti.service.expection.AddCompanyException;
import com.riti.service.expection.CompanyExistException;
import com.riti.service.expection.UserUpdateException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by brander on 2018/2/6
 */
@Service("ICompanyService")
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User setUserCompany(String userId, Company company) {
        // 先判断是否有此公司
        Company comp = companyMapper.findCompanyByName(company.getCoolCompanyName());
        // 判断用户是否绑定此公司
        User user = userMapper.selectByPrimaryKey(userId);
        System.out.println("ban 创建的公司" + comp);
        if (comp == null && "".equals(user.getCoolCompanyId())) {// 没有公司在新建
            // 生成主键
            String companyId = UUID.randomUUID().toString();
            company.setCoolCompanyId(companyId);
            // 添加company
            int n = companyMapper.insert(company);
            if (n == 1) {
                user.setCoolCompanyId(companyId);
                user.setCoolUserId(userId);
                int row = userMapper.updateUserCompany(user);
                if (row == 1) {
                    user = userMapper.selectByPrimaryKey(userId);
                } else {
                    // 更新user信息失败 异常
                    throw new UserUpdateException("更新用户信息失败");
                }
            } else {
                //保存公司失败 异常
                throw new AddCompanyException("保存公司失败");
            }
        } else {
            //重复公司信息 异常
            throw new CompanyExistException("重复公司信息");
        }
        return user;
    }

    /**
     * 获取公司信息
     *
     * @param userId
     * @return
     */
    @Override
    public Company getUserCompany(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        Company company = companyMapper.selectByPrimaryKey(user.getCoolCompanyId());
        return company;
    }

    /**
     * 根据公司名模糊查找公司
     *
     * @param companyName
     * @return
     */
    @Override
    public List<Company> findCompany(String companyName) {
        //获取公司列表
        if (StringUtils.isNotBlank(companyName)) {//模糊搜索
            companyName = new StringBuilder().append("%").append(companyName).append("%").toString();
        }
        List<Company> companies = companyMapper.findCompanyByBlurName(companyName);
        if (CollectionUtils.isNotEmpty(companies)) {
            return companies;
        } else {
            throw new CompanyExistException("公司不存在");
        }
    }
}
