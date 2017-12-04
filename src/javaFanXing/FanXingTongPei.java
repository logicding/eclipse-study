package javaFanXing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FanXingTongPei {
/*

<?>  所有都能匹配
<? extends SuperClass >SuperClass及其子类 
<? super SubClass>SubClass 及其父类


 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal01> list = new ArrayList<Animal01>();
		list.add(new Animal01());
		list.add(new Animal01());
		loop(list);
		
		List<Pet> plist = new ArrayList<Pet>();
		plist.add(new Pet());
		plist.add(new Pet());
		loop(plist);
	}

	/*private static void loop(Collection<Animal01> c) {
		// TODO Auto-generated method stub
		Iterator<Animal01> it = c.iterator();//Collection是List实现的接口
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	/*private static void loop(Collection<?> c) { //通配符 ？没有任何继承关系的都可以遍历
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection是List实现的接口
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	
/*	private static void loop(Collection<? extends Animal01> c) { //通配符 ？使用extends限定，必须是继承了Animal01的类
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection是List实现的接口
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	private static void loop(Collection<? super Dog01> c) { //通配符 ？使用super限定,必须是父类
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection是List实现的接口
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
class Animal01{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal++";
	}
}
class Pet extends Animal01{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pet++";
	}
}
class Dog01 extends Pet{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog";
	}
}