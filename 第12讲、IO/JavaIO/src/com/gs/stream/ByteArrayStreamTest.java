package com.gs.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

public class ByteArrayStreamTest {
	
	@Test
	public void testByteArrayStream() {
		try {
			//�ֽ�����������
			ByteArrayInputStream bais = new ByteArrayInputStream("dfjldskjfdsl".getBytes());
			int a = bais.read();
			byte[] bytes = new byte[bais.available()];
			bais.read(bytes);
			System.out.println(a);
			System.out.println(new String(bytes));
			bais.close();
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write("���".getBytes());
			baos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
