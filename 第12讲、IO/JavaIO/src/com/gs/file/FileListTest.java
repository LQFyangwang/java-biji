package com.gs.file;

import java.io.File;

import org.junit.Test;

public class FileListTest {
	
	public void readFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles(); // �г�ָ��Ŀ¼�µ�����File����  
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getAbsolutePath());
				} else if (f.isDirectory()) {
					readFile(f.getAbsolutePath()); // �ݹ���ã��Լ������Լ�
				}
			}
		}
	}
	
	@Test
	public void testFile() {
		readFile("d:/io_test");
	}

}
