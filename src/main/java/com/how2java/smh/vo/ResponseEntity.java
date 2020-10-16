package com.how2java.smh.vo;

import java.util.Map;

public class ResponseEntity {
	private int success=1;
	private Map<String,Object> data;
	private String errorMsg=null;
	public int getSuccess() {
		return success;
	}
	public void setSuccess(int success) {
		this.success = success;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
