package how.todefine_class01;

public class ValueSendClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.赋值过程（赋值和参数传递）
 * 2.方法参数传递过程
 * 3.字符串和基本类型封装比较特殊
 * */
		//1.基本类型 值传递 int byte short long float double char boolean
		int a = 1;
		int b = a;
		a = 2;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		change(a);
		System.out.println("a=" + a);
		//2.引用类型 类 类型 引用传递 （指针 地址传递）
		PersonSix p = new PersonSix();
		
		p.age = 20;
		
		PersonSix p2 = p;//相当于C中的指针赋值，都指向同一个内存区域
		
		p2.age = 30;
		
		System.out.println("p.age" + p.age);
		System.out.println("p2.age" + p2.age);
		
		change(p2);
		System.out.println("p.age" + p.age);
		System.out.println("p2.age" + p2.age);
		
		//3.Srting 和基本类型的封装类 特殊的(和基本类型一样 属于值传递)
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