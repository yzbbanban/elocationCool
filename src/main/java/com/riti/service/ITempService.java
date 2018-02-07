package com.riti.service;

import com.riti.pojo.GetNewTempParams;
import com.riti.pojo.NFCTemperatureData;
import com.riti.pojo.QueryTempParams;
import com.riti.pojo.TempCountParams;
import com.riti.utils.ResultCode;

import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
public interface ITempService {
    ResultCode<String> saveTempData(String tempJson);

    ResultCode<TempCountParams> queryTempData(QueryTempParams qtp);

    ResultCode<List<NFCTemperatureData>> queryTempChartData(QueryTempParams qtp);

    ResultCode<NFCTemperatureData> getNewTempData(GetNewTempParams gntp);
}
