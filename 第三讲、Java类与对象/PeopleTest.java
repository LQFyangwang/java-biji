
public class PeopleTest {

	//final ���࣬��������
	//����һ����������ȫ�ֱ�����
	String name;
	
	//����ͬʱ��ֵ����һ�θ�ֵ�г�ʼ����������һ������
	String classname="123abc";
	
	void run(){
		//�������涨����Ǿֲ�����
		//String year = "2016";
		System.out.println(name);
		
	}
	
	void play(){
		name="����";
		run();
		System.out.println(name);
	}
	
	public static void plays(){
		PeopleTest pt = new PeopleTest();
		pt.run();
	}
	
	public static void main(String[] a) {
		PeopleTest pt = new PeopleTest();//ʵ�����࣬����һ�����ڴ�ռ�
		pt.name="���";
		pt.play();
		plays();
	}
	
}
