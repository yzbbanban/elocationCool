package com.riti.service.impl;

import com.riti.consts.ServiceResult;
import com.riti.dao.NFCTemperatureDataMapper;
import com.riti.pojo.GetNewTempParams;
import com.riti.pojo.NFCTemperatureData;
import com.riti.pojo.QueryTempParams;
import com.riti.pojo.TempCountParams;
import com.riti.service.ITempService;
import com.riti.utils.JsonParseUtils;
import com.riti.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
@Service("iTempService")
public class TempServiceImpl implements ITempService {

    @Autowired
    private NFCTemperatureDataMapper tempMapper;

    @Autowired
    private JsonParseUtils jsonParseUtils;


    @Override
    public ResultCode<String> saveTempData(String tempJson) {
        ResultCode<String> resultCode = new ResultCode<>();
        try {
            // 解析为集合
            List<NFCTemperatureData> temperatures = jsonParseUtils.getObjList(
                    tempJson, ArrayList.class, NFCTemperatureData.class);

            // System.out.println(temperatures);
            int saveSuccess= tempMapper.insertCollect(temperatures);// 判断是否成功标志
            if (saveSuccess>0) {// 有一条不成功则失败
                resultCode = setSaveTempResult(ServiceResult.GET_MESSAGE_FALSE);
            }
            resultCode = setSaveTempResult(ServiceResult.GET_MESSAGE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ParseException) {// 上传参数异常解析异常)
                resultCode = setSaveTempResult(ServiceResult.GET_MESSAGE_FALSE);
            }
        }
        return resultCode;
    }

    /**
     * 查询温度数据
     *
     * @param qtp
     * @return
     */
    @Override
    public ResultCode<TempCountParams> queryTempData(QueryTempParams qtp) {
        ResultCode<TempCountParams> resultCode = new ResultCode<>();
        try {
            List<NFCTemperatureData> temps = tempMapper.findAllByPage(qtp);// 获取数据
            if (temps != null && temps.size() > 0) {// 获取成功，正常情况
                resultCode = setQueryTempCountResult(qtp, temps,
                        ServiceResult.GET_MESSAGE_SUCCESS);
            } else {// 查询失败
                resultCode = setQueryTempCountResult(qtp, temps,
                        ServiceResult.GET_MESSAGE_NO_DATA);
            }
        } catch (Exception e) {
            if (e instanceof ParseException) {// 上传参数异常解析异常)
                resultCode = setQueryTempResult(null,
                        ServiceResult.GET_MESSAGE_FALSE);
            }else {
                resultCode = setQueryTempResult(null,
                        ServiceResult.GET_MESSAGE_SERVICE_ERROR);
            }
        }
        return resultCode;
    }

    /**
     * 查询图表的温度数据
     *
     * @param qtp
     * @return
     */
    @Override
    public ResultCode<List<NFCTemperatureData>> queryTempChartData(QueryTempParams qtp) {
        ResultCode<List<NFCTemperatureData>> resultCode = new ResultCode<>();
        try {
            List<NFCTemperatureData> temps = tempMapper.findAll(qtp);// 获取数据
            if (temps != null && temps.size() > 0) {// 获取成功，正常情况
                resultCode = setQueryTempResult(temps,
                        ServiceResult.GET_MESSAGE_SUCCESS);
            } else {// 查询失败
                resultCode = setQueryTempResult(temps,
                        ServiceResult.GET_MESSAGE_NO_DATA);
            }
        } catch (Exception e) {
            if (e instanceof ParseException) {// 上传参数异常解析异常)
                resultCode = setQueryTempResult(null,
                        ServiceResult.GET_MESSAGE_FALSE);
            }
        }
        return resultCode;
    }


    private ResultCode<TempCountParams> setQueryTempCountResult(
            QueryTempParams qtp, List<NFCTemperatureData> temps, ServiceResult message)
            throws Exception {
        ResultCode<TempCountParams> resultCode = new ResultCode<TempCountParams>();
        resultCode.setCode(message.getIndex());
        resultCode.setMessage(message.getName());
        TempCountParams result = new TempCountParams();
        if (temps != null) {
            // 查询数量信息
            QueryTempParams params;
            int count = tempMapper.getCount(qtp);
            result.setCount(count);
            result.setTemperatures(temps);
        }
        resultCode.setResult(result);
        return resultCode;
    }


    /**
     * 返回参数
     *
     * @param message
     * @return
     */
    private ResultCode<String> setSaveTempResult(ServiceResult message) {
        ResultCode<String> resultCode = new ResultCode<String>();
        resultCode.setCode(message.getIndex());
        resultCode.setMessage(message.getName());
        resultCode.setResult(null);
        return resultCode;
    }

    /**
     * 获取最新的一条数据
     *
     * @param gntp
     * @return
     */
    @Override
    public ResultCode<NFCTemperatureData> getNewTempData(GetNewTempParams gntp) {
        ResultCode<NFCTemperatureData> resultCode = new ResultCode<>();
        try {
            NFCTemperatureData temp = tempMapper.findFirstTemp(gntp.getUid());
            if (temp != null) {
                resultCode = setQueryTempResult(temp,
                        ServiceResult.GET_MESSAGE_SUCCESS);
            } else {// 查询失败
                resultCode = setQueryTempResult(temp,
                        ServiceResult.GET_MESSAGE_NO_DATA);
            }
        } catch (Exception e) {
            if (e instanceof ParseException) {// 上传参数异常解析异常)
                resultCode = setQueryTempResult(null,
                        ServiceResult.GET_MESSAGE_FALSE);
            }
        }
        return resultCode;
    }

    /**
     * 返回参数
     *
     * @param <T>
     * @param message
     * @return
     */
    private <T> ResultCode<T> setQueryTempResult(T result, ServiceResult message) {
        ResultCode<T> resultCode = new ResultCode<T>();
        resultCode.setCode(message.getIndex());
        resultCode.setMessage(message.getName());
        resultCode.setResult((T) result);
        return (ResultCode<T>) resultCode;
    }
}
