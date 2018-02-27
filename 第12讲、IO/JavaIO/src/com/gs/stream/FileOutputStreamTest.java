package com.gs.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class FileOutputStreamTest {

	@Test
	public void testFileOutputStream() {
		try {
			FileOutputStream out = new FileOutputStream(new File("d:/io_test/test1.txt"), true); // Ĭ���Ǹ���
			out.write("�Ҳ���".getBytes("utf-8"));
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) { // ��֧�ֵı����쳣
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
