package mainpackage;

public class Auto {
	
	private String color;
	private int seatCount;
	private float weight;
	private float speed;
	
	public Auto() {
		
	}
	
	public Auto(String color, int seatCount, float weight, float speed) {
		this.color = color;
		this.seatCount = seatCount;
		this.weight = weight;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public void speedUp() {
		
	}
	
	public void speedDown() {
		
	}

	public void stop() {
		
	}
	
}
