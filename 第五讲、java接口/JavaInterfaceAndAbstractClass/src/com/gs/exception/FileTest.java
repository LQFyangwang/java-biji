package com.gs.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest {
	
	public static void test() throws FileNotFoundException {
		File file = new File("a.txt");
		FileInputStream in = new FileInputStream(file);
	}
	
	public static void test1() throws FileNotFoundException {
		test();
	}
	
	public static void test2() throws FileNotFoundException {
		test1();
	}
	
	public static void test3() {
		File file = new File("a.txt");
		try {
			FileInputStream in = new FileInputStream(file); // 哪些代码会出现异常，则这些代码放到try{}里面
		} catch (FileNotFoundException e) { // 捕捉FileNotFoundException异常类，e是此异常类的一个对象
			// 去处理异常
			System.out.println("处理异常。。。");
			e.printStackTrace(); // 打印异常信息，方法调用堆栈信息
		} finally {
			System.out.println("finally...."); // 在整个try...catch...语句块中，不管有没有捕捉到异常，最后一定会执行的代码
		}
	}
	
	public static void main(String[] args) {
//		File file = new File("a.txt");
//		FileInputStream in = new FileInputStream(file); // 把异常信息让调用者抛出
		//test2();
		test3();
	}

}
