package com.gs.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class FileReaderTest {
	
	@Test
	public void testFileReader() {
		try {
			File file = new File("d:/io_test/test.txt");
			InputStreamReader reader = new FileReader(file);
			int a = reader.read(); // ��Ȼ��ȡ���ַ����ݣ����Ƿ���int������ļ�����ĩβ�򷵻�-1
			char[] chars = new char[(int) file.length()];
			reader.read(chars); // �Ѷ�ȡ�����ַ����ݷŵ��ַ�������
			System.out.println(a);
			System.out.println(new String(chars));
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
