package com.gs.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.junit.Test;

public class PrintWriterTest {
	
	@Test
	public void testWriter() {
		try {
			PrintWriter writer = new PrintWriter("d:/io_test/pw.txt");
			writer.write("print writer!ÖÐÎÄ");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
