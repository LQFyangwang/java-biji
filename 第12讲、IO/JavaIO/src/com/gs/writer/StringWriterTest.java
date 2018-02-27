package com.gs.writer;

import java.io.StringWriter;

import org.junit.Test;

public class StringWriterTest {
	
	@Test
	public void testWriter() {
		StringWriter writer = new StringWriter();
		writer.write("aaaaaa");
	}

}
