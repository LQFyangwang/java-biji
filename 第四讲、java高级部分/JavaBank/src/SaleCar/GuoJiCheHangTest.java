package SaleCar;

public class GuoJiCheHangTest {
	public static void main(String[] args) {
		GuoJiCheHang che=new GuoJiCheHang();  //�ȴ���һ������
		Car car=new Car();
		car.setName("����");
		car.setType("C");
		car.setColor("��ɫ");
		car.setPrice(1000000.0);
		che.hireCar(car);//����һ����
		
		Car car1=new Car();
		car1.setName("�µ�2");
		car1.setColor("��ɫ");
		car1.setType("D");
		car1.setPrice(1200000.0);
		che.hireCar(car1);//����һ����
		
		SUV suv=new SUV();
		suv.setName("�µ�");
		suv.setColor("��ɫ");
		suv.setPrice(200000.0);
		che.hireSUV(suv);
		
		Sell sell=new Sell();
		sell.setName("ˮ��");
		sell.setAge(23);
		sell.setSex("��");
		che.inSell(sell);
		
		Sell sell1=new Sell();
		sell1.setName("asd");
		sell1.setAge(23);
		sell1.setSex("��");
		che.inSell(sell1);
		
		Buyer buyer=new Buyer();
		buyer.setName("����");
		buyer.setAge(19);
		buyer.setSex("Ů");
		buyer.setMoney(20000000.0);
		
		buyer.buyCar(che, 1000000.0);
		buyer.buySUV(che, 200000.0);
	}

}
