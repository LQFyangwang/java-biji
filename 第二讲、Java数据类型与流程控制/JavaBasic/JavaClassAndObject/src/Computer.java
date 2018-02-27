
public class Computer {
	
	int no;
	String name;
	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.no = 1001;
		c1.name = new String("abc"); // ����һ���ַ�������ֵΪabc
		Computer c2 = new Computer();
		c2.no = 1001;
		c2.name = new String("abc");
		
		System.out.println(c1 == c2); // false
		// ���ʹ��Ĭ�ϵ�equals�������бȽϣ���Ƚ�c1��c2�ĵ�ַ������false
		// ���ʹ������ʵ�ֵ�equals�������бȽϣ���Ȼ��ַ��һ�������ǻ��ֵ���бȽϣ����ڱȽϵ�no��һ���ģ��򷵻�true
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1)); 
		
		System.out.println(c1.equals(c1)); // true
	}
	
	/**
	 * ��һ�����жϱ������this����Ҫ�ȽϵĶ���obj�Ƿ�Ϊͬһ����ַ������ǣ��򷵻�true��������ǣ����뵽�ڶ���
	 * �ڶ������ж���Ҫ�Ƚϵ�obj�����Ƿ�Ϊ�����һ��ʵ��������ǣ�����뵽��������������ǣ��򷵻�false
	 * ������������Ҫ�Ƚϵ�obj����ǿ��ת��Ϊ�����һ��ʵ�����ٶԱ���Ķ���this��ǿ��ת����Ķ������ֵ�ıȽϣ�
	 * ���ֵ�ıȽ�һ�£��򷵻�true�����ֵ�ıȽϲ�һ�£��򷵻�false
	 */
	@Override
	public boolean equals(Object obj) { // ����ʵ�ֶ��������е�equals
		if (this == obj) { // �����������Ҫ�ȽϵĶ�����е�ַ�Ƚ�
			return true;
		}
		// �ж�obj�����Ƿ�ΪComputer���������ģ���������棬��֤��obj��������Computer�ഴ��������
		// ��ʱ����Ҫ��this���бȽϣ����������Computer���������ģ�this��obj����Ҫ�Ƚ�
		if (obj instanceof Computer) { 
			Computer c = (Computer) obj; // ��obj����ǿ��ת��ΪComputer��Ķ��󣨴�Χǿ��ת����С��Χ��
			if (this.no == c.no && this.name.equals(c.name)) {
				return true;
			}
		}
		return false;
	}

}
