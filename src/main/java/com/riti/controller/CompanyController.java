package com.riti.controller;

import java.util.List;

import javax.annotation.Resource;

import com.riti.consts.ServiceResult;
import com.riti.pojo.Company;
import com.riti.pojo.User;
import com.riti.service.ICompanyService;
import com.riti.service.expection.AddCompanyException;
import com.riti.service.expection.CompanyExistException;
import com.riti.service.expection.UserUpdateException;
import com.riti.utils.ResultCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Resource
	private ICompanyService companyService;

	/**
	 * 添加公司
	 * 
	 * @param userId
	 * @param company
	 * @return
	 */
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<User> addCompany(String userId, Company company) {
		User user = companyService.setUserCompany(userId, company);
		System.out.println(userId + "," + company);
		return new ResultCode<User>(user, "新建公司完成");
	}

	/**
	 * 获取公司
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/getCompany", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<Company> getCompany(String userId) {
//		System.out.println("getCompany: "+userId);
		Company company = companyService.getUserCompany(userId);
//		System.out.println(company);
		return new ResultCode(company, "查询成功");
	}

	/**
	 * 获取公司
	 * 
	 * @param companyName
	 * @return
	 */
	@RequestMapping(value = "/findCompany", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<List<Company>> findCompany(String companyName) {
//		System.out.println("companyName: "+companyName);
		List<Company> companies = companyService.findCompany(companyName);

		return new ResultCode(companies, "查询成功");
	}

	// 更新用户信息失败
	@ExceptionHandler(UserUpdateException.class)
	@ResponseBody
	public ResultCode<String> handleUserUpdate(UserUpdateException e) {
//		e.printStackTrace();
		return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
	}

	// 保存公司失败
	@ExceptionHandler(AddCompanyException.class)
	@ResponseBody
	public ResultCode<String> addCompany(AddCompanyException e) {
//		e.printStackTrace();
		return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
	}

	// 重复公司信息
	@ExceptionHandler(CompanyExistException.class)
	@ResponseBody
	public ResultCode<String> companyExist(CompanyExistException e) {
//		e.printStackTrace();
		return new ResultCode(ServiceResult.GET_MESSAGE_FALSE.getIndex(), e);
	}

}
