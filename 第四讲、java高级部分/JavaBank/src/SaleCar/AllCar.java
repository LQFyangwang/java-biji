package SaleCar;
/**
 * ³µµÄ¸¸Àà
 */
public class AllCar {
	public static final String TYPE_A="A";
	public static final String TYPE_B="B";
	public static final String TYPE_C="C";
	public static final String TYPE_D="D";
	
	public static final int DRIVR_2=2;
	public static final int DRIVR_4=4;
	
	private String name;
	private String pipai;
	private String color;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPipai() {
		return pipai;
	}
	public void setPipai(String pipai) {
		this.pipai = pipai;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
