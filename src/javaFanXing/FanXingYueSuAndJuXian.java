package javaFanXing;

import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class FanXingYueSuAndJuXian {
//1.基本类型  4类 8种 不能作为泛型参数
	/*第一类:逻辑型boolean
	 * 第二类:文本型char
	 * 第三类:整数型(byte、short、int、long)
	 * 第四类:浮点型(float、double)
	 * */
//2.运行时的类型检查
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = 1;//自动装包解包的过程，相当于Integ（1）；
//		ArrayList<int> a = new ArrayList<int>();//error
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		MyClassTwo<String> c1 = new MyClassTwo<String>();
		
		MyClassTwo<PersonTwo> c2 = new MyClassTwo<PersonTwo>();
		
		System.out.println(c1.getClass());
		System.out.println(c2.getClass());//c1 和 c2得到的类是一样的都是MyClass
		if(c1 instanceof MyClassTwo){
			System.out.println("99999");
		}
//3.异常处理 //a.泛型类不能继承 Exception 类
		  //b.catch不能捕获泛型参数的类型
		
//4.不能用泛型类创建数组   
//		MyClassTwo<String>[] array = new MyClassTwo<String>[10];
//		PersonTwo[] jj = new PersonTwo[10];类类型数组在new的时候无法传参数给构造函数
//5.不能实例化类型参数变量
//6.静态上下文
//7.擦除后的冲突
	}

}

class PersonTwo{
	private int id;
	public void equels() {
		// TODO Auto-generated method stub

	}
	public PersonTwo(int id) {
		System.out.println("999999999999999999999");
//		super();
		this.id = id;
	}
}

class MyClassTwo<T> {
	public boolean equels (T t){//擦除过程，把T类擦成Object类
		return true;//这样会造成冲突
	}
//	private T first;
//	private T second;
////	public static T instance;不能使用泛型参数声明静态属性
//	public MyClassTwo(){
////		first = new T();不能实例化类型参数变量
//	}
}
