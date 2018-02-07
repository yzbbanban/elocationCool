package com.riti.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.riti.pojo.NFCDeviceParams;
import com.riti.pojo.QueryDeviceParams;
import com.riti.service.IDeviceService;
import com.riti.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/device")
public class DeviceController {

	@Autowired
	private IDeviceService service;

	/**
	 * 上传设备
	 * 
	 * @param req
	 * @param res
	 * @param dpJson
	 * @return
	 */
	@RequestMapping(value = "/uploadDevice", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<String> saveDevicePost(HttpServletRequest req,
											 HttpServletResponse res, String
			dpJson) {
		ResultCode<String> result = new ResultCode<String>();
		System.out.println("sendDevice");
		System.out.println("json: " + dpJson);
		res.setCharacterEncoding("utf-8");
		try {
			// PrintWriter out = res.getWriter();
			result = service.saveDeviceParams(dpJson);
			System.out.println("result: " + result);
			if (!"null".equals(result)) {// 数据存入成功
				// out.println(result);
				return result;
			} else {// 数据存入失败
				// out.println(result);
				return result;
			}
		} catch (Exception e) {
			return result;
		}
	}

	/**
	 * 获取所有设备信息 测试用
	 * 
	 * @param qdp
	 * @param res
	 * @return
	 */
	@RequestMapping(value = "/queryDeviceList", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<List<NFCDeviceParams>> queryDevicePost(
			QueryDeviceParams qdp, HttpServletResponse res) {
		System.out.println("queryDevie");
		ResultCode<List<NFCDeviceParams>> result = new ResultCode<>();
		res.setCharacterEncoding("utf-8");
		try {
			// PrintWriter out = res.getWriter();
			result = service.queryDeviceParams(qdp);
			System.out.println("result: " + result);
			if (!"null".equals(result)) {// 数据获取成功
				// out.println(result);
				return result;
			} else {// 数据获取失败
				// out.println(result);
				return result;
			}
		} catch (Exception e) {
			return result;
		}
	}

	/**
	 * 获取单个设备信息
	 * 
	 * @param uid
	 * @return
	 */
	@RequestMapping(value = "/queryDevice", method = RequestMethod.POST)
	@ResponseBody
	public ResultCode<NFCDeviceParams> queryDeviceGet(int uid) {
		System.out.println("queryDevie");
		NFCDeviceParams deviceParams=service.getDeviceParams(uid);
		return new ResultCode(deviceParams, "获取设备成功");
	}
}
