package com.ht.test4;

public class FatherDemo {

	/*��׼��javadocע��
	 * 							--�޲������޷���ֵ
	 * 			----Ĭ�ϵĹ��췽��	--������������һ��
	 * 							--����ʹ��void�ؼ���
	 * 							--ʹ��public�ؼ�������
	 * ���췽��--------------------------------------
	 * 
	 * 							--�޷���ֵ
	 * 			----���غ�		--���������������Ͳ�һ��
	 * 							--����ʹ��void�ؼ���
	 * 
	 * */
	
	public FatherDemo (){
		System.out.println("Ĭ�ϵĹ��췽��");
		//������ʼ������
	}
	public FatherDemo (int a,float b){
		//������ʼ������
	}
	public FatherDemo (float a,int b){
		//������ʼ������
	}
	FatherDemo (int b){
		//������ʼ������
	}
	
	public void tests(){
		System.out.println("����tests��������");
	}
	//���������������Ͳ�һ��,������һ��
	void tests(int a){//boolean����������true��false
		
	}
	
	public static void testes(){
		
		System.out.println("���Ǿ�̬��testes����");
	}
	
	public void testes(int a){
		
		System.out.println("���Ǿ�̬��testes����");
	}
	
	public final void testess(){
		System.out.println("����final���͵�testess����");
	}
	
	public final void testess(int a){
		System.out.println("����final���͵�testess����");
	}
	
}
