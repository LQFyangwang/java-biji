package com.gs.exercise;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class FileUtilTest {
	
	@Test
	public void testFindFile() {
		List<File> files = FileUtil.findFiles("d:/io_test", ".txt");
		for (File f : files) {
			System.out.println(f.getAbsolutePath());
		}
	}

}
