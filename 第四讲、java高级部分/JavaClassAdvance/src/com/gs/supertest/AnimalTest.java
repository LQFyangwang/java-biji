package com.gs.supertest;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setName("����");
		a1.setKind("����");
		a1.eat();
		a1.sleep();
		Dog dog = new Dog(); // Dog���Ĭ�ϵĹ��췽�������˸���Ĺ��췽��
		dog.setName("��");
		dog.setKind("��");
		dog.setOwner("С��");
		dog.eat();
		dog.sleep();
		dog.run();
		Dog dog1 = new Dog("��1", "��", "С��");
		dog1.eat();
		Animal a2 = dog; // ֱ�Ӱ�һ��С��Χ���͵�ֵ��ֵ��һ����Χ���͵Ķ���
		// Dog dog2 = (Dog) a1; // ���ܰ�С��Χ���͵�����ת���ɴ�Χ���͵�����
		Animal a3 = new Dog("��2", "��", "С��"); // a3ʵ������һ��Dog��Ķ���
		// a3.run(); // a3���ܵ�������Dog��run����
		Dog d = (Dog) a3; // ����ǿ��ת��
		d.run();
	}

}
