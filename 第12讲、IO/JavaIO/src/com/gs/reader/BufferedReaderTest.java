package com.gs.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class BufferedReaderTest {
	
	@Test
	public void testReader() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									new File("d:/io_test/test.txt")), "utf-8"));
			String str = reader.readLine(); // 如果已经到了文件的末尾，则返回null
			System.out.println(str);
			String s = null;
			while ((s = reader.readLine()) != null) { // 只要读取的一行不为空，则继续读
				System.out.println(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
