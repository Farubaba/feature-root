package com.farubaba.root.interf.impl;

import com.farubaba.root.interf.IModel;

public class SuccessResult<T> implements IModel {
	
	private String apiVersion;
	private T data;
	public String getApiVersion() {
		return apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
