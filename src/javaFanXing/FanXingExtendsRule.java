package javaFanXing;

import java.util.ArrayList;

public class FanXingExtendsRule {
/*������֮���м̳й�ϵ�������������Ͳ�������֮��û���κεĹ�ϵ
 *������֮����Լ̳�Ҳֻʵ�ֽӿ�
 * 
 * 
 * */
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		a = d;
		Myclass01<Animal> c1 = new Myclass01<Animal>();
		Myclass01<Dog> c2 = new Myclass01<Dog>();
//		c1 = c2;���κι�ϵ������ֱ�Ӹ�ֵ
		Myclass01 c3 = new Myclass01<Animal>();//�������û�����Ͳ����ˣ���ֻ��Object��
		Myclass01 c4 = new Myclass01<Dog>();
		ArrayList a1;
		
	}

}
class Myclass01<T>{}
class Animal{}
class Dog extends Animal{}