
public class ��ά���� {

	public static void main(String[] args) {
		System.out.println("��ά����");
		int[][] e = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
		int[][] a={{1,3,5},{3,4,5,6},{2,2,5,6,7}};
		for (int row = 0; row < e.length; row++) { 
			// e.length���������������
			for (int col = 0; col < e[row].length; col++) { 
				// e[row]��ʾ������ĵ�row��, e[row].length��row���ж��ٸ�����
				System.out.println(e[row][col]);
			}
		}
		System.out.println("********************&&&&&&&&&&&������������������");
		//������ϵ
		for(int b=0;b<a.length;b++){
			for(int c=0;c<a[b].length;c++){
				System.out.println(a[b][c]);
			}
		}
	}
}
