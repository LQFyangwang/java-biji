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
		 * ��ȡģʽ��ֻ��r��ֻдw���ɶ��ӿ�дrw��ȫ���滻���ļ�ĩβ׷������
		 */
		
		File file = new File("D:/io_test/test.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r"); // ��ֻ��ģʽ��ָ�����ļ����ļ������ݴ洢��RandomAccessFile����
			// int a = raf.read(); // ��ȡһ���ֽڵ����ݣ������Ӣ�ģ�����Ӣ��ascii�룬��������ַ�����һ�����ķֳɶ���ֽ�����ȡ
			// System.out.println(a);
			byte[] bytes = new byte[6]; // file.length()��ȡ�ļ����ݵĳ���
			raf.seek(3); // ֱ����ת��ָ��������λ�ã�������0��ʼ
			raf.read(bytes); // ���ļ�������һ���Եض��뵽bytes��ָ�����ֽ�������
			String str = new String(bytes); // ���ֽ������ж�ȡ���Ӧ���ַ���
			System.out.println(str);
			raf.close();
			// raf.length(); // ��ȡ�ļ��ĳ���
			
//			RandomAccessFile raf1 = new RandomAccessFile(new File("d:/io_test/img.jpg"), "r");
//			System.out.println(raf1.readUTF()); // �ļ���β�쳣
			
			RandomAccessFile raf1 =new RandomAccessFile(new File("d:/io_test/test1.txt"),"rwd");
			//raf1.write('x'); // д��һ���ֽڣ�����û��ָ���滻ģʽ����ӿ�ͷ�����滻
			String outStr = "��ð���hello world!";
			raf1.write(outStr.getBytes("utf-8")); // ��utf-8�ı����ʽ��ȡoutStr�ַ�������Ӧ���ֽ�����
			raf1.close();
			
			RandomAccessFile raf2 = new RandomAccessFile(new File("d:/io_test/test2.txt"), "rw");
			String account = "no:123456,pwd:123456,name:test";
			raf2.write(account.getBytes("utf-8"));
			raf2.close();
		} catch (FileNotFoundException e) { // �ļ�δ�ҵ��쳣
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
