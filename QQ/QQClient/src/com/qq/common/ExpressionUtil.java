package com.qq.common;

import java.io.File;

import javax.swing.ImageIcon;

public class ExpressionUtil {
	
	public static int total() {
		File file = new File("src/images/expression");	
		File[] files = file.listFiles();
		return files.length;
	}
	
	public static ImageIcon getIcon(String name) {
		return new ImageIcon("src/images/expression/" + name + ".gif");
	}
	
	public static String getIconAlias(String name) {
		return "\\:" + name; // \:3
	}
	
	public static ImageIcon getIconByAlias(String alias) {
		return new ImageIcon("src/images/expression/" + alias.substring(2) + ".gif");
	}
}
