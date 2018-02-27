package com.gs.exception;

public class MyNumberException extends Exception {

	public MyNumberException() {
		super(); // 直接调用父类的无参构造 
	}

	public MyNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace); // 调用父类中4个参数的构造方法
	}

	public MyNumberException(String message, Throwable cause) {
		super(message, cause); // 调用父类两个参数的构造方法
	}

	public MyNumberException(String message) {
		super(message); // message都是指异常的错误信息
	}

	public MyNumberException(Throwable cause) {
		super(cause); // Throwable cause表示异常或错误的根源
	}
	
}
