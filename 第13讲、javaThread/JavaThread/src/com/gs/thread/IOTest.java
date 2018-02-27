package com.gs.thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {
	
	private int a = 100;
	
	public static void main(String[] args) {
		try {
				for (int i = 0; i < 100; i++) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/io_test/jdk.chm")));
				String line = null;
				while ((line = reader.readLine()) != null) {
					// System.out.println(line);
				}
				reader.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
