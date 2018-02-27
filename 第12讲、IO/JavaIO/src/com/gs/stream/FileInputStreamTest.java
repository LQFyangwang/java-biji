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
			FileInputStream in = new FileInputStream(file); // ��File����Ӧ���ļ������ݷŵ�FileInputStream�Ķ�����
			int a = in.read(); // ��ȡһ���ֽ�
			System.out.println(a);
			System.out.println(in.available() + ", " + file.length()); // in.available()���ػ��ж��ٸ��ֽڿɶ�
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
