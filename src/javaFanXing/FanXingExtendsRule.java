package javaFanXing;

import java.util.ArrayList;

public class FanXingExtendsRule {
/*两个类之间有继承关系，但是两个类型参数的类之间没有任何的关系
 *泛型类之间可以继承也只实现接口
 * 
 * 
 * */
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		a = d;
		Myclass01<Animal> c1 = new Myclass01<Animal>();
		Myclass01<Dog> c2 = new Myclass01<Dog>();
//		c1 = c2;无任何关系，不能直接赋值
		Myclass01 c3 = new Myclass01<Animal>();//擦除后就没有类型参数了，就只有Object类
		Myclass01 c4 = new Myclass01<Dog>();
		ArrayList a1;
		
	}

}
class Myclass01<T>{}
class Animal{}
class Dog extends Animal{}