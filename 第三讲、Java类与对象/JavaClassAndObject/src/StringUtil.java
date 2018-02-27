
public class StringUtil {
	
	static char[] toCharArray(String str) {
		return str.toCharArray();
	}
	
	public static void main(String[] args) {
		StringUtil.toCharArray("abc"); // 没必要去实例化StringUtil的对象，而是直接使用类来调用静态方法
	}

}
