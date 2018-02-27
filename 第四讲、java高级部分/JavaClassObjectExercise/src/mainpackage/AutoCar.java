package mainpackage;

public class AutoCar extends Auto {
	
	private String cd;
	
	public AutoCar() {
		
	}
	
	public AutoCar(String color, int seatCount, float weight, float speed, String cd) {
		super(color, seatCount, weight, speed); // 先调用父类构造方法，再给本类对象新增的属性赋值 
		this.cd = cd;
	}

	public String getCd() {
		return cd;
	}

	public void setCd(String cd) {
		this.cd = cd;
	}
	
	@Override
	public void speedUp() {
		
	}
	
	@Override
	public void speedDown() {
		
	}
	

}
