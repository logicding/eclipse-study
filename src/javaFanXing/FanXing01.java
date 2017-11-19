package javaFanXing;

import java.util.ArrayList;

public class FanXing01 {
//1.泛型 编程可以实现代码与类型无关， 从而实现代码的重用
	//2.jdk 5.0之前是通过继承实现的，所有的类型参数都是object
	//3.jdk 5.0之后使用类型参数：1）程序的可读性强2）可以在编译时发现错误，比在运行时发现错误要好
	//4.一般使用泛型，而不是设计泛型
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("9");
//		ArrayList<Dog> ag = new ArrayList<Dog>();
		ArrayList a1 = new ArrayLIst();
//		a1.add(new Dog());
//		a1.add(new Cat());
//		Dog d = a1.get(1);//会运行时报错
		ArrayList<Dog> al = new ArrayList<Dog>();
		a1.add(new Cat());
		
	}

}

class Dog{
	
}
class Cat{
	
}