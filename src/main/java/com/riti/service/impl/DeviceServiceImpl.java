package com.riti.service.impl;

import com.riti.consts.ServiceResult;
import com.riti.dao.NFCDeviceParamsMapper;
import com.riti.pojo.NFCDeviceParams;
import com.riti.pojo.QueryDeviceParams;
import com.riti.service.IDeviceService;
import com.riti.service.expection.DeviceException;
import com.riti.utils.JsonParseUtils;
import com.riti.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
public class DeviceServiceImpl implements IDeviceService {
    @Autowired
    private NFCDeviceParamsMapper deviceParamsMapper;

    @Autowired
    private JsonParseUtils jsonParseUtils;

    /**
     * 保存设备
     *
     * @param dpJson
     * @return
     */
    @Override
    public ResultCode<String> saveDeviceParams(String dpJson) {
        ResultCode<String> resultCode = new ResultCode<>();
        try {
            NFCDeviceParams dp = jsonParseUtils.getObj(dpJson, NFCDeviceParams.class);// 解析字符串
            if (deviceParamsMapper.findByUid(dp.getUid()) != null) {// 有数据
                int updateResult = deviceParamsMapper.updateByUid(dp);
//                System.out.println(updateResult + " dp: " + dp);
                if (updateResult > 0) {// 更新成功，正常情况
                    resultCode = setSaveDeviceResult(ServiceResult.GET_MESSAGE_SUCCESS);
                } else {// 更新失败
                    resultCode = setSaveDeviceResult(ServiceResult.GET_MESSAGE_NO_DATA);
                }
                return resultCode;
            }
            int saveResult = deviceParamsMapper.insert(dp);// 保存数据
            if (saveResult > 0) {// 保存成功，正常情况
                resultCode = setSaveDeviceResult(ServiceResult.GET_MESSAGE_SUCCESS);
            } else {// 保存失败
                resultCode = setSaveDeviceResult(ServiceResult.GET_MESSAGE_FALSE);
            }
        } catch (Exception e) {
            if (e instanceof Exception) {// 上传参数异常解析异常)
                resultCode = setSaveDeviceResult(ServiceResult.GET_MESSAGE_FALSE);
            }
        }
        return resultCode;
    }

    /**
     * 设置返回数据
     *
     * @param message
     * @return
     */
    private ResultCode<String> setSaveDeviceResult(ServiceResult message) {
        ResultCode<String> resultCode = new ResultCode<String>();
        resultCode.setCode(message.getIndex());
        resultCode.setMessage(message.getName());
        resultCode.setResult(null);
        return resultCode;
    }


    /**
     * 根据uid获取设备信息
     *
     * @param uid
     * @return
     */
    @Override
    public NFCDeviceParams getDeviceParams(int uid) {
        NFCDeviceParams device = deviceParamsMapper.findByUid(uid);
        if (device != null) {
            return device;
        } else {
            throw new DeviceException("无设备信息");
        }
    }

    /**
     * 查询所有设备
     *
     * @param qdp
     * @return
     */
    @Override
    public ResultCode<List<NFCDeviceParams>> queryDeviceParams(QueryDeviceParams qdp) {
        ResultCode<List<NFCDeviceParams>> resultCode = new ResultCode<>();
        try {
            List<NFCDeviceParams> deviceParams = deviceParamsMapper.findAll(qdp.getCompany());// 获取数据
            if (deviceParams != null && deviceParams.size() > 0) {// 获取成功，正常情况
                resultCode = setQueryDeviceResult(deviceParams,
                        ServiceResult.GET_MESSAGE_SUCCESS);
            } else {// 查询失败没数据
                resultCode = setQueryDeviceResult(deviceParams,
                        ServiceResult.GET_MESSAGE_NO_DATA);
            }
        } catch (Exception e) {
            if (e instanceof ParseException) {// 上传参数异常解析异常)
                resultCode = setQueryDeviceResult(null,
                        ServiceResult.GET_MESSAGE_FALSE);
            }
        }
        return resultCode;

    }

    private ResultCode<List<NFCDeviceParams>> setQueryDeviceResult(
            List<NFCDeviceParams> deviceParams, ServiceResult message) {
        ResultCode<List<NFCDeviceParams>> resultCode = new ResultCode<>();
        resultCode.setCode(message.getIndex());
        resultCode.setMessage(message.getName());
        resultCode.setResult(deviceParams);
        return resultCode;
    }

}
