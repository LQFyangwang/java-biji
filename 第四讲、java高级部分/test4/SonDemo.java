package com.ht.test4;

public class SonDemo extends FatherDemo{

	public SonDemo (){
		super(0,7f);
	}
	public SonDemo (int a){
		super();
	}
	public SonDemo (int a,float b){
		super(b,a);
	}
	@Override
	public void tests(){
		//������һ�£�����ֵһ��
	}
	/*
	@Override
	void tests(int a) {
		//���������������Ͷ�Ҫһ��
	}
	*/
	@Override
	public void tests(int a) {
		//���η�Ȩ�޴��ڻ��ߵ��ڸ��෽��
	}
	/*
	@Override
	public static void testes(){
		
	}��̬����ֻ�ܵ��ã�������д
	
	@Override
	public final void testess(){

	}����Ϊfinal���͵ķ������ܱ���д
	*/
	
	/*
	 *	�븸�෽����ͬ�ģ�
	 *		1.������һ��
	 *		2.���������������Ͷ�Ҫһ��
	 *		3.����ֵһ��
	 *	�븸�෽������ͬ�ģ�
	 *		1.Ȩ�����η����ڻ��ߵ��ڸ��෽�������η�
	 *	����Ϊstatic��final���෽�����ܱ���д
	 * */
}
