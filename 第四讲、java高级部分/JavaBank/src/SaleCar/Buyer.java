package SaleCar;

public class Buyer extends Person{
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	public void buyCar(GuoJiCheHang che,double money){
		Sell[] sells=che.getSells();
		if(sells!=null && sells.length>0){
			sells[1].sellCar(che, this);
			System.out.println("���ֽУ�"+getName()+"����"+money+
			"����һ������");
		}
	}
	public void buySUV(GuoJiCheHang che ,double money){
		Sell[] sells =che.getSells();
		if(sells!=null && sells.length>0){
			sells[0].sellSUV(che, this);
			System.out.println("���ֽУ�"+getName()+"����"+money+
			"����һ��ԽҰ����");
		}
	}

}
