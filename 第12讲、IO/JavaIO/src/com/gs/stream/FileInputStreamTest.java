package com.gs.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FileInputStreamTest {
	
	@Test
	public void testInputStraem() {
		try {
			File file = new File("d:/io_test/test.txt");
			FileInputStream in = new FileInputStream(file); // 把File所对应的文件的内容放到FileInputStream的对象中
			int a = in.read(); // 读取一个字节
			System.out.println(a);
			System.out.println(in.available() + ", " + file.length()); // in.available()返回还有多少个字节可读
			byte[] bytes = new byte[(int) file.length()];
			in.read(bytes);
			System.out.println(new String(bytes));
			in.close();
			
			System.out.println("******************************");
			FileInputStream in1 = new FileInputStream("d:/io_test/test.txt");
			byte[] bytes1 = new byte[1024];
			while (in1.read(bytes1) != -1) {
				System.out.println(new String(bytes1));
			}
			in1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
