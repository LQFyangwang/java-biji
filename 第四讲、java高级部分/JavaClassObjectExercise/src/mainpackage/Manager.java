package mainpackage;

public class Manager extends Employee {
	
	public static final String vehicle = "aaa";
	
	@Override
	public void play() {
		System.out.println("manager play");
	}
	
	public static void main(String[] args) {
		Manager m = new Manager();
		m.play();
		m.sing();
		Employee e = new Employee();
		e.play();
		e.sing();
	}

}
