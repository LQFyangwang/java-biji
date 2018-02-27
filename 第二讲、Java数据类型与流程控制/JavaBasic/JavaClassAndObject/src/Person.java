
public class Person {
	
	String name; // 名称
	int age; // 年龄
	String gender; // 性别
	int height; // 身高
	float weigth; // 体重
	String phoneNo; // 手机号
	
	void run() {
		System.out.println("跑步中。。。");
	}
	
	void read() {
		System.out.println("读书中。。。");
	}
	
	void eat() {
		System.out.println("吃饭中。。。");
	}
	
	public static void main(String[] args) {
		Person p = new Person(); // 创建一个对象，这个对象是属于Person类
		p.run();
		p.read();
		p.eat();
	}

}
