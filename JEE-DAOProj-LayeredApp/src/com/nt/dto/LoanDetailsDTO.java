package com.nt.dto;

import java.io.Serializable;

public class LoanDetailsDTO implements Serializable {
	private String  custName;
	private String custAddrs;
	private  float  principleAmt;
	private float time;
	private float rate;
	private  String branch;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public float getPrincipleAmt() {
		return principleAmt;
	}
	public void setPrincipleAmt(float principleAmt) {
		this.principleAmt = principleAmt;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
}
