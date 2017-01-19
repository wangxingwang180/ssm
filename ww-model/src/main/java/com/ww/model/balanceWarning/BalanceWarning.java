package com.ww.model.balanceWarning;

public class BalanceWarning {
	private Long sn;    //主键自增
	
	private String customerId;    //客户id
	
	private Double balanceWarning;    //账号预警余额，非空，默认0.000
	
	private String phone;    //预警通知手机号，多个手机号用,(英文逗号) 隔开
	
	private String email;    //预警通知邮箱，多个邮箱用,(英文逗号) 隔开
	
	private String insertTime;    
	
	private java.util.Date updateTime;

	public Long getSn() {
		return sn;
	}

	public void setSn(Long sn) {
		this.sn = sn;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Double getBalanceWarning() {
		return balanceWarning;
	}

	public void setBalanceWarning(Double balanceWarning) {
		this.balanceWarning = balanceWarning;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
}
