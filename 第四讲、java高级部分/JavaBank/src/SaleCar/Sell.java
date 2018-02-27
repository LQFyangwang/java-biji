package SaleCar;

public class Sell extends Person{
	private String no;
	private String gzage;
	private int sellnumber;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public String getGzage() {
		return gzage;
	}

	public void setGzage(String gzage) {
		this.gzage = gzage;
	}

	public int getSellnumber() {
		return sellnumber;
	}

	public void setSellnumber(int sellnumber) {
		this.sellnumber = sellnumber;
	}

	public void sellCar(GuoJiCheHang che,Buyer buyer){
		che.setTotalcar(che.getTotalcar()-1);
		System.out.println("员工："+getName()+"买了一辆车给"+buyer.getName());
	}
	public void sellSUV(GuoJiCheHang che ,Buyer buyer){
		che.setTotalsuv(che.getTotalcar()-1);
		System.out.println("员工："+getName()+"买了一辆越野车给"+buyer.getName());
	}
	
}
