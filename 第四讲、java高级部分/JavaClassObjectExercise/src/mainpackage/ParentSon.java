package mainpackage;

public class ParentSon extends Parent {
	
	public static void main(String[] args) {
		Parent p = new Parent(10, 20, 30);
		ParentSon son = new ParentSon();
		System.out.println(son.a);
		System.out.println(son.b);
		// System.out.println(son.c); // ����c��private����������û�취�̳�����
	}

}
