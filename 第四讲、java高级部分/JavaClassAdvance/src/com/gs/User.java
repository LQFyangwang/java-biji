package com.gs;

public class User {
	
	/**
	 * private���ε�����ֻ�����Լ�������ʹ�ã���������ʲ�������������--->��ķ�װ
	 * �����������Ҫ���ʴ���private���ε����ԣ�������ṩһ�������ķ���ȥ��ȡ�����ô�����
	 * �ṩһ��setMemberName����ר�������������Ե�ֵ, setter��������������������ֵ
	 * �ṩһ��getMemberName����ר�����ڻ�ȡ���Ե�ֵ, getter��������������ȡ����ֵ
	 */
	private String name; 
	private int age;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}@Override
	public String toString() {
		return "name: " + name + ", age: " + age + ", gender: " + gender;
	}
	
	
	/**
	 * ���ط�����ֻ�б�����ʹ�á�
	 */
	private void eat() {
		
	}
	
	public static void main(String[] args) {
		User user = new User();
		user.name = "abc";
		user.eat();
	}

}
