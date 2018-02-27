package com.gs.exercise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class CharToByteTest {

	@Test
	public void testCharToByte() {
		FileReader reader;
		try {
			reader = new FileReader("e:/java/s/a.txt ");
			char[] chars = new char[1024];
			reader.read(chars);
			ByteArrayInputStream bais = new ByteArrayInputStream(new String(chars).getBytes());
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(bais.read());
			
//			DataInputStream dis = new DataInputStream();
//			DateOutputStream dos = new DataOutputStream();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
