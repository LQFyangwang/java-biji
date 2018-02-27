package com.qq.bean;//消息类

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Message implements Serializable {
	
	private static final long serialVersionUID = -6813476469624264099L;
	
	private QQAccount from; // 发送者
	private QQAccount to; // 接收者
	private Date sendTime; // 发送时间
	
	private String message; // 消息内容
	
	private byte[] data; // 用来存储整个文件的字节数组
	
	private Map<Integer, String> icons;
	
	private int messageType;

	public QQAccount getFrom() {
		return from;
	}

	public void setFrom(QQAccount from) {
		this.from = from;
	}

	public QQAccount getTo() {
		return to;
	}

	public void setTo(QQAccount to) {
		this.to = to;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public int getMessageType() {
		return messageType;
	}

	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}

	public Map<Integer, String> getIcons() {
		return icons;
	}

	public void setIcons(Map<Integer, String> icons) {
		this.icons = icons;
	}

}
