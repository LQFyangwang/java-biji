package mainpackage;

public class AutoCar extends Auto {
	
	private String cd;
	
	public AutoCar() {
		
	}
	
	public AutoCar(String color, int seatCount, float weight, float speed, String cd) {
		super(color, seatCount, weight, speed); // �ȵ��ø��๹�췽�����ٸ�����������������Ը�ֵ 
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
