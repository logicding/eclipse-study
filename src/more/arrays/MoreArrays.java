package more.arrays;

public class MoreArrays {
	static final int ROW = 3;
	static final int COL = 3;
	public static void main(String[] argv){
		//声明 类型[][]
		//2.实例化 类型[][] a = new 类型[长度][长度]
		int[][] a ;
		a = new int[ROW][COL];
		a[0][0] = 100;
		//3,直接初始化
		int[][] b = {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		//4.遍历
		for(int i = 0; i < ROW;i++){
			for(int j = 0; j < COL ; j++){
				System.out.print(" "+b[i][j]);
			}
			System.out.println("\n");
		}
	}
}
