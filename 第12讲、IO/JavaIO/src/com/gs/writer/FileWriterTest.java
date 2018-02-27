package com.gs.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class FileWriterTest {
	
	@Test
	public void testFileWriter() {
		try {
			OutputStreamWriter writer = new FileWriter(new File("d:/io_test/writer"), true);
			writer.write("aÖ±½Ó²Ù×÷×Ö·û´®");
			char[] chars = new char[]{'x', 'y', 'z'};
			writer.write(chars);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
