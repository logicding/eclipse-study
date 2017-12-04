package javaFanXing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FanXingTongPei {
/*

<?>  ���ж���ƥ��
<? extends SuperClass >SuperClass�������� 
<? super SubClass>SubClass ���丸��


 
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
		Iterator<Animal01> it = c.iterator();//Collection��Listʵ�ֵĽӿ�
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	/*private static void loop(Collection<?> c) { //ͨ��� ��û���κμ̳й�ϵ�Ķ����Ա���
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection��Listʵ�ֵĽӿ�
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	
/*	private static void loop(Collection<? extends Animal01> c) { //ͨ��� ��ʹ��extends�޶��������Ǽ̳���Animal01����
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection��Listʵ�ֵĽӿ�
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	private static void loop(Collection<? super Dog01> c) { //ͨ��� ��ʹ��super�޶�,�����Ǹ���
		// TODO Auto-generated method stub
		Iterator<?> it = c.iterator();//Collection��Listʵ�ֵĽӿ�
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