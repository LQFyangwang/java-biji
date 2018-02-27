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
			int a = reader.read(); // 虽然读取的字符数据，但是返回int，如果文件到了末尾则返回-1
			char[] chars = new char[(int) file.length()];
			reader.read(chars); // 把读取到的字符数据放到字符数组里
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
