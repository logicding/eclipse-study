package exception;

public class exceptions01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.java的异常不是编译错误而是在运行期间发生的错误
		//2.java的异常时面向对象的，当异常发生时会自动产生一个异常对象
		int[] a = {1,2,3};
		//a[3] = 5;
		String b = null;
		//b.equals("q");空指针异常
		
		int c =10, d = 0;
		//int e = c/d;分母为0异常
		
	}

}
