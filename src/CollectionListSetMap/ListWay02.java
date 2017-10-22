package CollectionListSetMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListWay02 {
/*
 * 	collecttion (�����ķ���)
 *   |  -- List  �б� (���򣬿��ظ�)
 *          | -- ArrayList  ���ݽṹ��һ������ �ɱ����飬Ԫ������ģ����ظ���
 *          | --(��ӡ�ɾ��Ч�ʵͣ���ѯЧ�ʸߣ��������ű꣩)
 *          | -- LinkedList ���ݽṹ��һ������
 *          | --����ӣ�ɾ��Ч�ʸߣ���ѯЧ�ʵͣ�
 *   |  -- Set 
 * 
 * */
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("three");
		
		//����ͬArrayList
		loop(ll);
		ll.removeFirst();
		loop(ll);
		ll.removeLast();
		loop(ll);
		
		ll.push("1");//ģ��ջ�Ĵ�ŷ�ʽ���Ƚ���� 
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
		
		// addall ���һ������
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("1");
		a2.add("2");
		a2.add("3");
		a2.add("3");
		
		a1.addAll(a2); 
		
		boolean b = a1.contains("31"); //�Ƿ����ĳ��Ԫ��
		System.out.println(b);
		b = a1.containsAll(a2);//�Ƿ����ĳ������
		System.out.println(b);
		System.out.println("-------------------");
		for(String a:a1){
			System.out.println(a);
		}
		System.out.println("-------------------");
		
		//��ȡԪ�ظ���
		int size = a1.size();
		for(int i = 0; i < size; i++){
			System.out.println(a1.get(i));
		}
		System.out.println("-------------------");
		//����������
		Iterator<String> it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("----------loop---------");
		
		//ɾ��
		a1.remove("one");//ɾ��ĳ��Ԫ��
		a1.remove(3);//������ɾ��
		a1.remove(a2);//ɾ��ĳ������
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
