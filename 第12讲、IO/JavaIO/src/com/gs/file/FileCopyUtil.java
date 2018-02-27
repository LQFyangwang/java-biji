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
			RandomAccessFile raf = new RandomAccessFile(src, "r"); // 读取源文件
			RandomAccessFile raf1 = new RandomAccessFile(dest, "rw"); // 写到一个目标文件
			int a = -1;
			while ((a = raf.read()) != -1) { // 已经读取到了文件的未尾，则此方法 返回-1
				raf1.write(a); // a是从源文件每次读到的一个字节，如果此字节不等于-1，则意味着还没至文件末尾
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
