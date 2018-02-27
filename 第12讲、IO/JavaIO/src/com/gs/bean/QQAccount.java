package com.gs.bean;

import java.io.Serializable;

public class QQAccount implements Serializable {
	
	private static final long serialVersionUID = 9165481768692906244L;
	private int number;
	private String nickname;
	
	private transient String pwd; // transient �����Բ��ᱻ���л�
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
