package com.riti.pojo;


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
	private List<NFCTemperatureData> temperatures;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<NFCTemperatureData> getTemperatures() {
		return temperatures;
	}

	public void setTemperatures(List<NFCTemperatureData> temperatures) {
		this.temperatures = temperatures;
	}

	@Override
	public String toString() {
		return "TempCountparams [count=" + count + ", temperatures="
				+ temperatures + "]";
	}

}
