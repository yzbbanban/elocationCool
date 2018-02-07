package com.riti.pojo;

import com.riti.dao.NFCTemperatureDataMapper;

import java.io.Serializable;
import java.util.List;

/**
 * 用户发送给界面信息
 * 
 * @author brander
 * 
 */
public class TempCountParams implements Serializable{
	private int count;
	private List<NFCTemperatureDataMapper> temperatures;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<NFCTemperatureDataMapper> getTemperatures() {
		return temperatures;
	}

	public void setTemperatures(List<NFCTemperatureDataMapper> temperatures) {
		this.temperatures = temperatures;
	}

	@Override
	public String toString() {
		return "TempCountparams [count=" + count + ", temperatures="
				+ temperatures + "]";
	}

}
