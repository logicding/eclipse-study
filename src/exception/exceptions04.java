package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptions04 {

	public static void main(String[] args)  {
	//	test3();
//		try {
//			test4();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		test5();
//		}
		
		
	}

	static void test5(){
		try{
		String str = null;
		str.equals("000");
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static void test4() throws FileNotFoundException{
		FileInputStream in = new FileInputStream("");
	}
/*	static void test1(){
		try{
		int[] a = {1,2,3};
		int x = a[4];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
			e.printStackTrace();
		}
	}
	static void test2(){
		test1();
	}
	static void test3(){
		test2();
	}*/
}
