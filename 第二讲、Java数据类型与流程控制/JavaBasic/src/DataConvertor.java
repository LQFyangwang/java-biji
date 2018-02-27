
public class DataConvertor {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		float c = (a + b) / 2; //  (a + b) / 2 ===>  7  ==> 7.0
		float c1 = (float) (a + b) / 2;
		float c2 = (a + b) / 2.f;
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
	}

}
