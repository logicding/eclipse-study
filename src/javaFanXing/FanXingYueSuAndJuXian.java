package javaFanXing;

import java.util.ArrayList;

import javax.print.attribute.IntegerSyntax;

public class FanXingYueSuAndJuXian {
//1.��������  4�� 8�� ������Ϊ���Ͳ���
	/*��һ��:�߼���boolean
	 * �ڶ���:�ı���char
	 * ������:������(byte��short��int��long)
	 * ������:������(float��double)
	 * */
//2.����ʱ�����ͼ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = 1;//�Զ�װ������Ĺ��̣��൱��Integ��1����
//		ArrayList<int> a = new ArrayList<int>();//error
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		MyClassTwo<String> c1 = new MyClassTwo<String>();
		
		MyClassTwo<PersonTwo> c2 = new MyClassTwo<PersonTwo>();
		
		System.out.println(c1.getClass());
		System.out.println(c2.getClass());//c1 �� c2�õ�������һ���Ķ���MyClass
		if(c1 instanceof MyClassTwo){
			System.out.println("99999");
		}
//3.�쳣���� //a.�����಻�ܼ̳� Exception ��
		  //b.catch���ܲ����Ͳ���������
		
//4.�����÷����ഴ������   
//		MyClassTwo<String>[] array = new MyClassTwo<String>[10];
//		PersonTwo[] jj = new PersonTwo[10];������������new��ʱ���޷������������캯��
//5.����ʵ�������Ͳ�������
//6.��̬������
//7.������ĳ�ͻ
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
	public boolean equels (T t){//�������̣���T�����Object��
		return true;//��������ɳ�ͻ
	}
//	private T first;
//	private T second;
////	public static T instance;����ʹ�÷��Ͳ���������̬����
//	public MyClassTwo(){
////		first = new T();����ʵ�������Ͳ�������
//	}
}
