package com.qq.bean;

import java.util.Date;

public class Friends {
	
	private int id;
	private String account1; // �����еĵ�һ����
	private String account2; // �����еĵڶ�����
	private Date relationTime; // ʲôʱ���Ϊ���ѵ�
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount1() {
		return account1;
	}
	public void setAccount1(String account1) {
		this.account1 = account1;
	}
	public String getAccount2() {
		return account2;
	}
	public void setAccount2(String account2) {
		this.account2 = account2;
	}
	public Date getRelationTime() {
		return relationTime;
	}
	public void setRelationTime(Date relationTime) {
		this.relationTime = relationTime;
	}
	
}
