package mainpackage;

public class Bike implements IVehicle{

	@Override
	public void start() {
		System.out.println("���г�����");
		
	}

	@Override
	public void stop() {
		System.out.println("���г�ֹͣ");
		
	}
	public static void main(String[] args) {
		Bike bke=new Bike();
		bke.start();
		bke.stop();
	
	}
}
