
public class PeopleTest {

	//final 的类，叫最终类
	//声明一个变量，（全局变量）
	String name;
	
	//声明同时赋值（第一次赋值叫初始化），定义一个变量
	String classname="123abc";
	
	void run(){
		//方法里面定义的是局部变量
		//String year = "2016";
		System.out.println(name);
		
	}
	
	void play(){
		name="李四";
		run();
		System.out.println(name);
	}
	
	public static void plays(){
		PeopleTest pt = new PeopleTest();
		pt.run();
	}
	
	public static void main(String[] a) {
		PeopleTest pt = new PeopleTest();//实例化类，分配一定的内存空间
		pt.name="你好";
		pt.play();
		plays();
	}
	
}
