package com.gs.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class FileCopyUtil {
	
	public static void copyFile(String src, String dest) {
		copyFile(new File(src), new File(dest));
	}
	
	public static void copyFile(File src, File dest) {
		try {
			RandomAccessFile raf = new RandomAccessFile(src, "r"); // ��ȡԴ�ļ�
			RandomAccessFile raf1 = new RandomAccessFile(dest, "rw"); // д��һ��Ŀ���ļ�
			int a = -1;
			while ((a = raf.read()) != -1) { // �Ѿ���ȡ�����ļ���δβ����˷��� ����-1
				raf1.write(a); // a�Ǵ�Դ�ļ�ÿ�ζ�����һ���ֽڣ�������ֽڲ�����-1������ζ�Ż�û���ļ�ĩβ
			}
			
			raf.close();
			raf1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCopy() {
		FileCopyUtil.copyFile("d:/io_test/img.jpg", "d:/io_test/img1.jpg");
	}

}
