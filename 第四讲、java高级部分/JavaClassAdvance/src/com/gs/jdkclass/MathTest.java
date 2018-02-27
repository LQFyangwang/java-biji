package com.gs.jdkclass;

public class MathTest {
	
	public static void main(String[] args) {
		System.out.println("PI: " + Math.PI);
		System.out.println("E: " + Math.E);
		System.out.println("绝对值：" + Math.abs(-0.5f)); // 求绝对值
		// 以下部分为三角函数
		System.out.println("acos: " + Math.acos(0.5));
		System.out.println("cos: " + Math.cos(90));
		System.out.println("asin: " + Math.asin(0.5));
		System.out.println("sin: " + Math.sin(90));
		System.out.println("atan: " + Math.atan(90));
		System.out.println("tan: " + Math.tan(90));
		// 以上部分为三角函数
		System.out.println("ceil: " + Math.ceil(1.01)); // 大于此数最小整数
		System.out.println("floor: " + Math.floor(1.98)); // 小于此数最大整数
		System.out.println("round: " + Math.round(3.3)); // 四舍五入
		System.out.println("max: " + Math.max(10, 20)); // 求最大值 
		System.out.println("min: " + Math.min(10, 20)); // 求最小值 
		System.out.println("pow: " + Math.pow(2, 3)); // pow(a, b) a的b次方
		System.out.println("random: " + Math.random()); // 产生大于0，小于1的随机数
		System.out.println("sqrt: " + Math.sqrt(4)); // 求平方根
		System.out.println("add: " + Math.addExact(10, 20)); // 加
		System.out.println("subtract: " + Math.subtractExact(30, 20)); // 减
		System.out.println("multiply: " + Math.multiplyExact(10, 10)); // 乘
 	}

}
