package more.arrays;

public class MoreArrays {
	static final int ROW = 3;
	static final int COL = 3;
	public static void main(String[] argv){
		//���� ����[][]
		//2.ʵ���� ����[][] a = new ����[����][����]
		int[][] a ;
		a = new int[ROW][COL];
		a[0][0] = 100;
		//3,ֱ�ӳ�ʼ��
		int[][] b = {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		//4.����
		for(int i = 0; i < ROW;i++){
			for(int j = 0; j < COL ; j++){
				System.out.print(" "+b[i][j]);
			}
			System.out.println("\n");
		}
	}
}
