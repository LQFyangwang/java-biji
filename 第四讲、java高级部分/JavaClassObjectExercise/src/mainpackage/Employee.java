package mainpackage;

public class Employee extends Role {
	
	private double salary;
	private static String id;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, String gender, double salary, String id) {
		super(name, age, gender);
		this.salary = salary;
		Employee.id = id;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Employee.id = id;
	}

	@Override
	public void play() {
		System.out.println("employee play");
	}
	
	public final void sing() {
		System.out.println("sing...");
	}

}
