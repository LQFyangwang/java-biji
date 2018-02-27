package com.gs.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ���ڶ�ȡproperties�����ļ���ͨ����
 *
 */
public class ConfigUtil {
	
	private Properties prop;
	
	public ConfigUtil(String path) {
		prop = new Properties();
		try {
			// prop.load(ConfigUtil.class.getResourceAsStream(path)); // ֻ���������ͬһ�������ļ�
			prop.load(new FileInputStream(path)); // ������ �κ�һ��·����ָ�����ļ�
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
