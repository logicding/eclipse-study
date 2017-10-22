package CollectionListSetMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListWay02 {
/*
 * 	collecttion (公共的方法)
 *   |  -- List  列表 (有序，可重复)
 *          | -- ArrayList  数据结构是一个数组 可变数组，元素有序的，可重复的
 *          | --(添加。删除效率低，查询效率高（索引，脚标）)
 *          | -- LinkedList 数据结构是一个链表
 *          | --（添加，删除效率高，查询效率低）
 *   |  -- Set 
 * 
 * */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("three");
		
		//遍历同ArrayList
		loop(ll);
		ll.removeFirst();
		loop(ll);
		ll.removeLast();
		loop(ll);
		
		ll.push("1");//模拟栈的存放方式，先进后出 
		System.out.println(ll.pop());
		
/*		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		//1.add
		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");
		for(String a:a1){
			System.out.println(a);
		}
		
		// addall 添加一个集合
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("1");
		a2.add("2");
		a2.add("3");
		a2.add("3");
		
		a1.addAll(a2); 
		
		boolean b = a1.contains("31"); //是否包含某个元素
		System.out.println(b);
		b = a1.containsAll(a2);//是否包含某个集合
		System.out.println(b);
		System.out.println("-------------------");
		for(String a:a1){
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		//获取元素个数
		int size = a1.size();
		for(int i = 0; i < size; i++){
			System.out.println(a1.get(i));
		}
		System.out.println("-------------------");
		//迭代器遍历
		Iterator<String> it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("----------loop---------");
		
		//删除
		a1.remove("one");//删除某个元素
		a1.remove(3);//索引号删除
		a1.remove(a2);//删除某个集合
		a1.remove("yy");
		a1.clear();
		
		loop(a1);*/
	}
	
	static void loop(List<String> list){
		for(String e: list){
			System.out.println(e);
		}
	}

}
