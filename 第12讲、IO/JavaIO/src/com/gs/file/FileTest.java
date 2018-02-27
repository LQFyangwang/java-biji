package com.gs.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void testFile() {
		/**
		 * Windowsϵͳ����\����ʾ·���ķָ������������ϵͳ����/���ָ��
		 * 
		 * �����Ҫƥ���κ�һ������ϵͳ����·���ָ��ʹ��/
		 */
		
		File file = new File("C:/Users/ye/Desktop/a.txt"); // ��ȡָ��·�����ļ�����
		File file1 = new File("src/test"); // ���·��
		File file2 = new File("src/test1");
		File file3 = new File("src/test1/a.txt");
		File file4 = new File("src/test2/test/test");
		File file5 = new File("d:/io_test/test.txt");
		System.out.println(file.getName()); // ��ȡ�ļ�������
		System.out.println(file1.getName());
		System.out.println(file.getAbsolutePath()); // ��ȡ����·��
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getPath()); // ��ȡ���·��
		try {
			System.out.println(file.getCanonicalPath()); // ��ȡһ�����Եģ�Ψһ��·��
			System.out.println(file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.isFile()); // �ж��Ƿ�Ϊһ���ļ�
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory()); // �ж��Ƿ�Ϊһ��Ŀ¼
		if (!file2.exists()) { // �ж��ļ��Ƿ���ڣ�������ڷ���true�������ڷ���false
			System.out.println("������");
			file2.mkdir(); // ����Ŀ¼��ֻ֧��һ�����
		}
		if (!file3.exists()) {
			try {
				file3.createNewFile(); // �������ļ�
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} else {
			// file3.delete(); // ɾ���ļ�
			file3.renameTo(new File("src/test1/b.txt")); // �޸��ļ������ƣ������޸����ݣ�
		}
		if (!file4.exists()) {
			file4.mkdirs(); // ֧�ִ��������ε�Ŀ¼
		}
		System.out.println(file5.length()); // �������ֽ�Ϊ��λ���ļ�����
	}

}
