package com.gs.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class FileCopyUtil {
	
	public static void copyFile(String src, String dest) {
		try {
			File srcFile = new File(src);
			File destFile = new File(dest);
			FileReader reader = new FileReader(srcFile);
			FileWriter writer = new FileWriter(destFile);
			int a = -1;
			while ((a = reader.read()) != -1) {
				writer.write(a);
			}
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFile1(String src, String dest) {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(src)));
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(dest)));
			String line  = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.write("\r\n");
			}
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFile2(String src, String dest) {
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(dest);
			byte[] bytes = new byte[in.available()];
			while (in.read(bytes) != -1) {
				out.write(bytes);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCopy() {
		FileCopyUtil.copyFile2("d:/io_test/test.txt", "d:/io_test/test.bak1");
	}

}
