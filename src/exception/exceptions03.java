package exception;

public class exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try catch finally
		//注意事项：1.这三个关键字均不能单独使用
		//      2.try catch | try catch finnaly（最常用） | try finnaly
		//      上面三个组合都可以
		///		3.作用域的问题
		//      4.匹配异常是从上到下的，如果第一个异常发生了，下面的异常就不会捕获了
		try{
			int[] a = {1,2,3};
			
			//int x = a[3];
			
			String s = null;
			
			//s.length();
			
			int c = 10, d = 0;
			int e = c/d;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
		}catch(NullPointerException e){
			System.out.println("空指针");
		}catch(ArithmeticException e){
			System.out.println("算数异常");
		}finally{
			System.out.println("肯定会执行");
		}
		
		System.out.println("shifou ....");//如果上面的异常被捕获了这里才会被执行到
		
	}

}
