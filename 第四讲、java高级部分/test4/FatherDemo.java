package com.ht.test4;

public class FatherDemo {

	/*标准的javadoc注释
	 * 							--无参数，无返回值
	 * 			----默认的构造方法	--方法名于类名一致
	 * 							--不能使用void关键字
	 * 							--使用public关键字修饰
	 * 构造方法--------------------------------------
	 * 
	 * 							--无返回值
	 * 			----重载后		--参数个数或者类型不一致
	 * 							--不能使用void关键字
	 * 
	 * */
	
	public FatherDemo (){
		System.out.println("默认的构造方法");
		//用作初始化操作
	}
	public FatherDemo (int a,float b){
		//用作初始化操作
	}
	public FatherDemo (float a,int b){
		//用作初始化操作
	}
	FatherDemo (int b){
		//用作初始化操作
	}
	
	public void tests(){
		System.out.println("这是tests（）方法");
	}
	//参数个数或者类型不一致,方法名一致
	void tests(int a){//boolean（布尔）：true，false
		
	}
	
	public static void testes(){
		
		System.out.println("这是静态的testes方法");
	}
	
	public void testes(int a){
		
		System.out.println("这是静态的testes方法");
	}
	
	public final void testess(){
		System.out.println("这是final类型的testess方法");
	}
	
	public final void testess(int a){
		System.out.println("这是final类型的testess方法");
	}
	
}
