package com.gs.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	
	public static List<File> findFiles(String path, String extension) {
		File file = new File(path);
		File[] files = file.listFiles();
		List<File> fileList = new ArrayList<File>();
		for (File f : files) {
			if (f.isFile()) {
				String fName = f.getName();
				if (fName.endsWith(extension)) {
					fileList.add(f);
				}
			}
		}
		return fileList;
	}

}
