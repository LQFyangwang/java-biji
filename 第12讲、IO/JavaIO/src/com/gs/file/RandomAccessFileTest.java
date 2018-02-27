package com.gs.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileTest {
	
	@Test
	public void testRandomAcess() {
		/**
		 * 读取模式：只读r，只写w，可读加可写rw，全部替换，文件末尾追加内容
		 */
		
		File file = new File("D:/io_test/test.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r"); // 以只读模式打开指定的文件，文件的内容存储在RandomAccessFile类中
			// int a = raf.read(); // 读取一个字节的数据，如果是英文，则是英文ascii码，如果中文字符，则一个中文分成多个字节来读取
			// System.out.println(a);
			byte[] bytes = new byte[6]; // file.length()获取文件内容的长度
			raf.seek(3); // 直接跳转到指定的索引位置，索引从0开始
			raf.read(bytes); // 把文件的内容一次性地读入到bytes所指定的字节数组中
			String str = new String(bytes); // 从字节数组中读取其对应的字符串
			System.out.println(str);
			raf.close();
			// raf.length(); // 获取文件的长度
			
//			RandomAccessFile raf1 = new RandomAccessFile(new File("d:/io_test/img.jpg"), "r");
//			System.out.println(raf1.readUTF()); // 文件结尾异常
			
			RandomAccessFile raf1 =new RandomAccessFile(new File("d:/io_test/test1.txt"),"rwd");
			//raf1.write('x'); // 写出一个字节，由于没有指定替换模式，则从开头进行替换
			String outStr = "你好啊，hello world!";
			raf1.write(outStr.getBytes("utf-8")); // 以utf-8的编码格式获取outStr字符串所对应的字节数组
			raf1.close();
			
			RandomAccessFile raf2 = new RandomAccessFile(new File("d:/io_test/test2.txt"), "rw");
			String account = "no:123456,pwd:123456,name:test";
			raf2.write(account.getBytes("utf-8"));
			raf2.close();
		} catch (FileNotFoundException e) { // 文件未找到异常
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
