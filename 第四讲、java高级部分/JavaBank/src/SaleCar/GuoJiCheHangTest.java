package SaleCar;

public class GuoJiCheHangTest {
	public static void main(String[] args) {
		GuoJiCheHang che=new GuoJiCheHang();  //先创建一个车店
		Car car=new Car();
		car.setName("宝马");
		car.setType("C");
		car.setColor("白色");
		car.setPrice(1000000.0);
		che.hireCar(car);//进了一辆车
		
		Car car1=new Car();
		car1.setName("奥迪2");
		car1.setColor("红色");
		car1.setType("D");
		car1.setPrice(1200000.0);
		che.hireCar(car1);//进了一辆车
		
		SUV suv=new SUV();
		suv.setName("奥迪");
		suv.setColor("黑色");
		suv.setPrice(200000.0);
		che.hireSUV(suv);
		
		Sell sell=new Sell();
		sell.setName("水军");
		sell.setAge(23);
		sell.setSex("男");
		che.inSell(sell);
		
		Sell sell1=new Sell();
		sell1.setName("asd");
		sell1.setAge(23);
		sell1.setSex("男");
		che.inSell(sell1);
		
		Buyer buyer=new Buyer();
		buyer.setName("富豪");
		buyer.setAge(19);
		buyer.setSex("女");
		buyer.setMoney(20000000.0);
		
		buyer.buyCar(che, 1000000.0);
		buyer.buySUV(che, 200000.0);
	}

}
