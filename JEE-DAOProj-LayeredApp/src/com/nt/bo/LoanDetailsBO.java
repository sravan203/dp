package com.nt.bo;

public class LoanDetailsBO {
	private String  custName;
	private String custAddrs;
	private  float  principleAmt;
	private String branch;
	private float intrAmt;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrs() {
		return custAddrs;
	}
	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}
	public float getPrincipleAmt() {
		return principleAmt;
	}
	public void setPrincipleAmt(float principleAmt) {
		this.principleAmt = principleAmt;
	}
	public float getIntrAmt() {
		return intrAmt;
	}
	public void setIntrAmt(float intrAmt) {
		this.intrAmt = intrAmt;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
