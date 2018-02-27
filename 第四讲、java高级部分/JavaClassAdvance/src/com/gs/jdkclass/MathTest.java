package com.gs.jdkclass;

public class MathTest {
	
	public static void main(String[] args) {
		System.out.println("PI: " + Math.PI);
		System.out.println("E: " + Math.E);
		System.out.println("����ֵ��" + Math.abs(-0.5f)); // �����ֵ
		// ���²���Ϊ���Ǻ���
		System.out.println("acos: " + Math.acos(0.5));
		System.out.println("cos: " + Math.cos(90));
		System.out.println("asin: " + Math.asin(0.5));
		System.out.println("sin: " + Math.sin(90));
		System.out.println("atan: " + Math.atan(90));
		System.out.println("tan: " + Math.tan(90));
		// ���ϲ���Ϊ���Ǻ���
		System.out.println("ceil: " + Math.ceil(1.01)); // ���ڴ�����С����
		System.out.println("floor: " + Math.floor(1.98)); // С�ڴ����������
		System.out.println("round: " + Math.round(3.3)); // ��������
		System.out.println("max: " + Math.max(10, 20)); // �����ֵ 
		System.out.println("min: " + Math.min(10, 20)); // ����Сֵ 
		System.out.println("pow: " + Math.pow(2, 3)); // pow(a, b) a��b�η�
		System.out.println("random: " + Math.random()); // ��������0��С��1�������
		System.out.println("sqrt: " + Math.sqrt(4)); // ��ƽ����
		System.out.println("add: " + Math.addExact(10, 20)); // ��
		System.out.println("subtract: " + Math.subtractExact(30, 20)); // ��
		System.out.println("multiply: " + Math.multiplyExact(10, 10)); // ��
 	}

}
