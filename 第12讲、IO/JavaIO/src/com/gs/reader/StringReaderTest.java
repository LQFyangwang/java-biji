package com.gs.reader;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class StringReaderTest {
	
	@Test
	public void testReader() {
		try {
			String str = "ÄãºÃ°¡£¡";
			StringReader reader = new StringReader(str);
			int a = reader.read();
			char[] chars = new char[str.length()];
			reader.read(chars);
			System.out.println(a);
			System.out.println(new String(chars));
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
