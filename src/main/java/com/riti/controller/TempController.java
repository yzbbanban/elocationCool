package com.riti.controller;

import com.riti.pojo.GetNewTempParams;
import com.riti.pojo.NFCTemperatureData;
import com.riti.pojo.QueryTempParams;
import com.riti.pojo.TempCountParams;
import com.riti.service.ITempService;
import com.riti.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by brander on 2018/2/7
 */
@Controller
@RequestMapping("/temp")
public class TempController {
    @Autowired
    private ITempService service;

    // 保存温度数据
    @RequestMapping(value = "/uploadTemp", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<String> saveTempPost(HttpServletResponse res,
                                           String tempJson) {
        ResultCode<String> result = new ResultCode<String>();
        System.out.println("saveTempPost");
        System.out.println("json: " + tempJson);
        res.setCharacterEncoding("utf-8");
        try {
            // PrintWriter out = res.getWriter();
            result = service.saveTempData(tempJson);
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

    // 获取温度数据
    @RequestMapping(value = "/queryTempByPage", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<TempCountParams> queryTempPost(HttpServletResponse res,
                                                     QueryTempParams qtp) {
        ResultCode<TempCountParams> result = new ResultCode<>();
        System.out.println(qtp);
        res.setCharacterEncoding("utf-8");
        try {
            // PrintWriter out = res.getWriter();
            result = service.queryTempData(qtp);
            System.out.println("result: " + result);
            if (!"".equals(result)) {// 数据获取成功
                // out.println(result);
                System.out.println("!!");
                return result;
            } else {// 数据获取失败
                // out.println(result);
                return result;
            }
        } catch (Exception e) {
            return result;
        }

    }

    // 获取温度数据
    @RequestMapping(value = "/queryTempChart", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<List<NFCTemperatureData>> queryTempChart(HttpServletResponse res,
                                                               QueryTempParams qtp) {
        ResultCode<List<NFCTemperatureData>> result = new ResultCode<>();
        System.out.println(qtp);
        res.setCharacterEncoding("utf-8");
        try {
            // PrintWriter out = res.getWriter();
            result = service.queryTempChartData(qtp);
            System.out.println("result: " + result);
            if (!"".equals(result)) {// 数据获取成功
                // out.println(result);
                System.out.println("!!");
                return result;
            } else {// 数据获取失败
                // out.println(result);
                return result;
            }
        } catch (Exception e) {
            return result;
        }

    }

    // 测试用
    @RequestMapping(value = "/getQueryTemp", method = RequestMethod.GET)
    @ResponseBody
    public ResultCode<List<NFCTemperatureData>> queryTempGet() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ResultCode<List<NFCTemperatureData>> rc = new ResultCode<>();
        List<NFCTemperatureData> temps = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            NFCTemperatureData temp = new NFCTemperatureData();
            temp.setUid(1111112);
            temp.setDaterecordtime(sdf
                    .format(new Date(1502696936203L + i * 1000 * 60)));
            temp.setGoodsname("good" + i);
            temp.setMintemperature(-10.0);
            temp.setMaxtemperature(20.0);
            temp.setTemperature(10.0);
            temp.setTempstatus(0);
            temp.setHum(80.0);
            temp.setMinhum(60.0);
            temp.setMaxhum(90.0);
            temp.setHumstatus(0);
            temps.add(temp);
        }
        rc.setCode("10000");
        rc.setMessage("正常");
        rc.setResult(temps);
        System.out.println(rc);
        return rc;
    }

    @RequestMapping(value = "/getNewTemp", method = RequestMethod.POST)
    @ResponseBody
    public ResultCode<NFCTemperatureData> queryNewTempPost(HttpServletResponse res,
                                                           GetNewTempParams gntp) {

        ResultCode<NFCTemperatureData> result = new ResultCode<>();
        res.setCharacterEncoding("utf-8");
        try {
            // PrintWriter out = res.getWriter();
            result = service.getNewTempData(gntp);
            System.out.println("result: " + result);
            if (!"".equals(result)) {// 数据获取成功
                // out.println(result);
                System.out.println("!!");
                return result;
            } else {// 数据获取失败
                // out.println(result);
                return result;
            }
        } catch (Exception e) {
            return result;
        }
    }

}