package com.gs.exception;

public class MyNumberException extends Exception {

	public MyNumberException() {
		super(); // ֱ�ӵ��ø�����޲ι��� 
	}

	public MyNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace); // ���ø�����4�������Ĺ��췽��
	}

	public MyNumberException(String message, Throwable cause) {
		super(message, cause); // ���ø������������Ĺ��췽��
	}

	public MyNumberException(String message) {
		super(message); // message����ָ�쳣�Ĵ�����Ϣ
	}

	public MyNumberException(Throwable cause) {
		super(cause); // Throwable cause��ʾ�쳣�����ĸ�Դ
	}
	
}
