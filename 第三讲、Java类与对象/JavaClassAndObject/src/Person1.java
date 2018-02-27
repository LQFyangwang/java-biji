
public class Person1 {
	
	String name; // 名称
	int age; // 年龄
	String gender; // 性别
	int height; // 身高
	float weight; // 体重
	String phoneNo; // 手机号
	
	void run() {
		System.out.println(name + "跑步中。。。");
	}
	
	void read() {
		System.out.println(name + "读书中。。。");
	}
	
	void eat() {
		System.out.println(name + "吃饭中。。。");
	}
	
	void printInfo() {
		System.out.println("姓名： " + name + ", 年龄： " + age + ", 性别： " + gender 
				+ ", 身高：" + height + ", 体重：" + weight + ", 手机号: " + phoneNo);
	}
	
	public static void main(String[] args) {
		Person1 p = new Person1(); // 创建一个对象，这个对象是属于Person类
		p.name = "张三";
		p.age = 20;
		p.gender = "男";
		p.height = 170;
		p.weight = 50;
		p.phoneNo = "18888888888";
		p.printInfo();
		System.out.println(p.name + "的年龄：" + p.age);
		p.run();
		p.read();
		p.eat();
		Person1 p1 = new Person1();
		p1.name = "李四";
		p1.age = 30;
		p1.gender = "女";
		p1.height = 170;
		p1.weight = 50;
		p1.phoneNo = "13666666666";
		p1.printInfo();
		System.out.println(p1.name + "的年龄：" + p1.age);
		p1.run();
		p1.read();
		p1.eat();
	}

}
