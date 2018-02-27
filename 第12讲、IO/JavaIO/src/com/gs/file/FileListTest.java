package com.gs.file;

import java.io.File;

import org.junit.Test;

public class FileListTest {
	
	public void readFile(String path) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles(); // 列出指定目录下的所有File对象  
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getAbsolutePath());
				} else if (f.isDirectory()) {
					readFile(f.getAbsolutePath()); // 递归调用，自己调用自己
				}
			}
		}
	}
	
	@Test
	public void testFile() {
		readFile("d:/io_test");
	}

}
