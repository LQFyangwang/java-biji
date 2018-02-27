
public class 二维数组 {

	public static void main(String[] args) {
		System.out.println("二维数组");
		int[][] e = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
		int[][] a={{1,3,5},{3,4,5,6},{2,2,5,6,7}};
		for (int row = 0; row < e.length; row++) { 
			// e.length返回数组的总行数
			for (int col = 0; col < e[row].length; col++) { 
				// e[row]表示数组里的第row行, e[row].length第row行有多少个数据
				System.out.println(e[row][col]);
			}
		}
		System.out.println("********************&&&&&&&&&&&！！！！！！！！！");
		//自由联系
		for(int b=0;b<a.length;b++){
			for(int c=0;c<a[b].length;c++){
				System.out.println(a[b][c]);
			}
		}
	}
}
