package com.gs.exercise;

import java.io.IOException;

import org.junit.Test;

public class RuntimeTest {
	
	@Test
	public void testRuntime() {
		// Runtime类表示Java的运行环境，此类可以用于调用操作系统所提供的一些命令
		Runtime runtime = Runtime.getRuntime(); // 获取运行时环境
		try {
			runtime.exec("C:\\Users\\ye\\Desktop\\calc.exe"); // exec     execute的简写，表示执行
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
