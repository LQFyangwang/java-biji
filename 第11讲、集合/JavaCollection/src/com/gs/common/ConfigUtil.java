package com.gs.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 用于读取properties配置文件的通用类
 *
 */
public class ConfigUtil {
	
	private Properties prop;
	
	public ConfigUtil(String path) {
		prop = new Properties();
		try {
			// prop.load(ConfigUtil.class.getResourceAsStream(path)); // 只能拿与此类同一个包的文件
			prop.load(new FileInputStream(path)); // 可以拿 任何一个路径所指定的文件
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getString(String key) {
		return prop.getProperty(key);
	}
	
	public int getInt(String key) {
		return Integer.valueOf(prop.getProperty(key));
	}
	
	public double getDouble(String key) {
		return Double.valueOf(prop.getProperty(key));
	}

	public static void main(String[] args) {
		ConfigUtil configUtil = new ConfigUtil("src/test1.properties");
		int pageSize = configUtil.getInt("pageSize");
		System.out.println(pageSize);
	}
	
}
