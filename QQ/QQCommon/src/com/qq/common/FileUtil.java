package com.qq.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	public static final String DEFAULT_FILE_DIR = "d:/qq";
	
	public static byte[] readFile(File file) {
		byte[] bytes = new byte[(int) file.length()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(bytes);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	public static void saveFile(String no, String fileName, byte[] data) {
		File qqDir = new File(DEFAULT_FILE_DIR + "/" + no);
		if (!qqDir.exists()) {
			qqDir.mkdirs(); // 创建多级目录
		}
		// 开始保存文件
		try {
			FileOutputStream out = new FileOutputStream(qqDir.getAbsolutePath() + "/" + fileName);
			out.write(data);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
