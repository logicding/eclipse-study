package way.struct.reject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		new Person(1, "tom", 3);
		printConstruct(Person.class);
	}
	static void printConstruct(Class cls){
		
		try {
			Constructor c1 = cls.getConstructor(null);
			Constructor c2 = cls.getConstructor(int.class, String.class, int.class);
			Constructor[] c3 = cls.getConstructors(); //只返回公共构造函数的
			Constructor[] c5 = cls.getDeclaredConstructors();//返回所有构造函数的
			System.out.println(c1);
			System.out.println(c2);
			
			for(Constructor c4: c3){
				System.out.println(c4);
				System.out.println("修饰符：" + Modifier.toString(c4.getModifiers()));
				
				Class[] pt = c4.getParameterTypes();//获取构造函数的参数类型
				for(Class p : pt){	
					System.out.println("参数类型" + p.getName());
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class Person{
	
	int pid;
	String name;
	int age;
	public Person(){
		System.out.println("Person1");
	}
	
	public Person(int pid, String name, int age){
		
		this.name = name;
		this.pid  = pid;
		this.age = age;
		System.out.println("Person2");
	}
}