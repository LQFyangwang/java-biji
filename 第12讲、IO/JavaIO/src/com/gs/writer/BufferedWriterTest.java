package com.gs.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class BufferedWriterTest {
	
	@Test
	public void testWriter() {
		try {
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(
									new File("d:/io_test/buf_writer"), true), "utf-8"));
//			BufferedWriter writer1 = new BufferedWriter(
//					new OutputStreamWriter(
//							new BufferedOutputStream(
//									new FileOutputStream(
//											new File("")))));
			writer.write("aaÄãºÃ£¡");
			writer.write("\r\n"); // »»ÐÐ
			writer.write("helllo");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
