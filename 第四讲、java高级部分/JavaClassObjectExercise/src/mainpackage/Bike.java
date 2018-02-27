package mainpackage;

public class Bike implements IVehicle{

	@Override
	public void start() {
		System.out.println("自行车启动");
		
	}

	@Override
	public void stop() {
		System.out.println("自行车停止");
		
	}
	public static void main(String[] args) {
		Bike bke=new Bike();
		bke.start();
		bke.stop();
	
	}
}
