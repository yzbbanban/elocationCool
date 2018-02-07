package com.riti.service;

import com.riti.pojo.NFCDeviceParams;
import com.riti.pojo.QueryDeviceParams;
import com.riti.utils.ResultCode;

import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
public interface IDeviceService {
    ResultCode<String> saveDeviceParams(String dpJson);

    NFCDeviceParams getDeviceParams(int uid);

    ResultCode<List<NFCDeviceParams>> queryDeviceParams(QueryDeviceParams qdp);
}
