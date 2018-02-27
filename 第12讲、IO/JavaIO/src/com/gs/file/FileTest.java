package com.gs.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {
	
	@Test
	public void testFile() {
		/**
		 * Windows系统里用\来表示路径的分割，但是其他操作系统是用/来分割的
		 * 
		 * 如果需要匹配任何一个操作系统，则路径分割符使用/
		 */
		
		File file = new File("C:/Users/ye/Desktop/a.txt"); // 获取指定路径的文件对象
		File file1 = new File("src/test"); // 相对路径
		File file2 = new File("src/test1");
		File file3 = new File("src/test1/a.txt");
		File file4 = new File("src/test2/test/test");
		File file5 = new File("d:/io_test/test.txt");
		System.out.println(file.getName()); // 获取文件的名称
		System.out.println(file1.getName());
		System.out.println(file.getAbsolutePath()); // 获取绝对路径
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getPath()); // 获取相对路径
		try {
			System.out.println(file.getCanonicalPath()); // 获取一个绝对的，唯一的路径
			System.out.println(file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.isFile()); // 判断是否为一个文件
		System.out.println(file1.isFile());
		System.out.println(file1.isDirectory()); // 判断是否为一个目录
		if (!file2.exists()) { // 判断文件是否存在，如果存在返回true，不存在返回false
			System.out.println("不存在");
			file2.mkdir(); // 创建目录，只支持一个层次
		}
		if (!file3.exists()) {
			try {
				file3.createNewFile(); // 创建新文件
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} else {
			// file3.delete(); // 删除文件
			file3.renameTo(new File("src/test1/b.txt")); // 修改文件的名称（不会修改内容）
		}
		if (!file4.exists()) {
			file4.mkdirs(); // 支持创建多个层次的目录
		}
		System.out.println(file5.length()); // 返回以字节为单位的文件长度
	}

}
