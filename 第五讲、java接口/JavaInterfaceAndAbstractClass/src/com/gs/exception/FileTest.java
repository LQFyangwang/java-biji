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
			FileInputStream in = new FileInputStream(file); // ��Щ���������쳣������Щ����ŵ�try{}����
		} catch (FileNotFoundException e) { // ��׽FileNotFoundException�쳣�࣬e�Ǵ��쳣���һ������
			// ȥ�����쳣
			System.out.println("�����쳣������");
			e.printStackTrace(); // ��ӡ�쳣��Ϣ���������ö�ջ��Ϣ
		} finally {
			System.out.println("finally...."); // ������try...catch...�����У�������û�в�׽���쳣�����һ����ִ�еĴ���
		}
	}
	
	public static void main(String[] args) {
//		File file = new File("a.txt");
//		FileInputStream in = new FileInputStream(file); // ���쳣��Ϣ�õ������׳�
		//test2();
		test3();
	}

}
