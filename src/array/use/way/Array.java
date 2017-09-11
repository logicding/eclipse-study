package array.use.way;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,32,34,21,35,12,13};
		for(int b : a){
			System.out.println(b);
		}
		Arrays.sort(a);
		JustUsePrint o_print = new JustUsePrint();
		o_print.print(a);

	//2.search
	//排序的
		int index = Arrays.binarySearch(a, 13);
		if(index == -1){
			System.out.println("没有找到----");
		}else{
			System.out.println("找到了" + a[index] +" "+"索引号为"+ index);
		}
		//3.fill
		int[] b = new int[10];
		Arrays.fill(b, 100);
		for(int out: b){
			System.out.println(out);
		}
	}
}
class JustUsePrint{
	 void print(int[] x){
		for(int b : x){
			System.out.println(b);
		}
	}
}