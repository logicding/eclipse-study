package how.todefine_class01;

public class ValueSendClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.��ֵ���̣���ֵ�Ͳ������ݣ�
 * 2.�����������ݹ���
 * 3.�ַ����ͻ������ͷ�װ�Ƚ�����
 * */
		//1.�������� ֵ���� int byte short long float double char boolean
		int a = 1;
		int b = a;
		a = 2;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		change(a);
		System.out.println("a=" + a);
		//2.�������� �� ���� ���ô��� ��ָ�� ��ַ���ݣ�
		PersonSix p = new PersonSix();
		
		p.age = 20;
		
		PersonSix p2 = p;//�൱��C�е�ָ�븳ֵ����ָ��ͬһ���ڴ�����
		
		p2.age = 30;
		
		System.out.println("p.age" + p.age);
		System.out.println("p2.age" + p2.age);
		
		change(p2);
		System.out.println("p.age" + p.age);
		System.out.println("p2.age" + p2.age);
		
		//3.Srting �ͻ������͵ķ�װ�� �����(�ͻ�������һ�� ����ֵ����)
		String s1 = "Hello";
		String s2 = s1;
		s1 = "hello world";
		System.out.println("s1" + s1);
		System.out.println("s2" + s2);
		Integer i = Integer.valueOf(1);
		Integer j = i;
		i  = 2;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		
	}
	
	static void change(PersonSix p){
		p.age = 35;
	}
	static void change(int x){
		x = 3;
	}
}


class PersonSix{
	public int age;
}