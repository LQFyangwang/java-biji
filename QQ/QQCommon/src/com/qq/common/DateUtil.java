package com.qq.common;

import java.util.Date;

public class DateUtil {
	
	/**
	 * »ñÈ¡ÄêÁä
	 * @param birthday
	 * @return
	 */
	public static int getAge(Date birthday) {
		return (int) (System.currentTimeMillis() - birthday.getTime()) / (24 * 60 * 60 * 1000 * 365);
	}

}
