
public class Computer {
	
	int no;
	String name;
	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.no = 1001;
		c1.name = new String("abc"); // 创建一个字符串对象，值为abc
		Computer c2 = new Computer();
		c2.no = 1001;
		c2.name = new String("abc");
		
		System.out.println(c1 == c2); // false
		// 如果使用默认的equals方法进行比较，则比较c1与c2的地址，返回false
		// 如果使用重新实现的equals方法进行比较，虽然地址不一样，但是会对值进行比较，由于比较的no是一样的，则返回true
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1)); 
		
		System.out.println(c1.equals(c1)); // true
	}
	
	/**
	 * 第一步：判断本类对象this与需要比较的对象obj是否为同一个地址，如果是，则返回true，如果不是，进入到第二步
	 * 第二步：判断需要比较的obj对象是否为本类的一个实例，如果是，则进入到第三步，如果不是，则返回false
	 * 第三步：把需要比较的obj对象强制转换为本类的一个实例，再对本类的对象this与强制转换后的对象进行值的比较，
	 * 如果值的比较一致，则返回true，如果值的比较不一致，则返回false
	 */
	@Override
	public boolean equals(Object obj) { // 重新实现对象中已有的equals
		if (this == obj) { // 本类对象与需要比较的对象进行地址比较
			return true;
		}
		// 判断obj对象是否为Computer创建出来的，如果返回真，则证明obj对象是由Computer类创建出来的
		// 此时才需要与this进行比较，如果不是由Computer创建出来的，this与obj不需要比较
		if (obj instanceof Computer) { 
			Computer c = (Computer) obj; // 把obj对象强制转换为Computer类的对象（大范围强制转换到小范围）
			if (this.no == c.no && this.name.equals(c.name)) {
				return true;
			}
		}
		return false;
	}

}
