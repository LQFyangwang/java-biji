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
		//方法名一致，返回值一致
	}
	/*
	@Override
	void tests(int a) {
		//参数个数或者类型都要一致
	}
	*/
	@Override
	public void tests(int a) {
		//修饰符权限大于或者等于父类方法
	}
	/*
	@Override
	public static void testes(){
		
	}静态方法只能调用，不能重写
	
	@Override
	public final void testess(){

	}定义为final类型的方法不能被重写
	*/
	
	/*
	 *	与父类方法相同的：
	 *		1.方法名一致
	 *		2.参数个数或者类型都要一致
	 *		3.返回值一致
	 *	与父类方法不相同的：
	 *		1.权限修饰符大于或者等于父类方法的修饰符
	 *	定义为static，final父类方法不能被重写
	 * */
}
