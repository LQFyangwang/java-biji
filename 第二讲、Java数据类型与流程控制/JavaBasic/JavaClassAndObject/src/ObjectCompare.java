
public class ObjectCompare {
	
	int a;
	
	public static void main(String[] args) {
		ObjectCompare oc = new ObjectCompare();
		oc.a = 100;
		ObjectCompare oc1 = new ObjectCompare();
		oc1.a = 100;
		System.out.println(oc == oc1); // false �ж�oc��oc1�Ƿ�Ϊͬһ������
		ObjectCompare oc2 = oc;
		oc2.a = 200;
		System.out.println(oc == oc2); // true
	}

}
