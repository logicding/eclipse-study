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
			Constructor[] c3 = cls.getConstructors(); //ֻ���ع������캯����
			Constructor[] c5 = cls.getDeclaredConstructors();//�������й��캯����
			System.out.println(c1);
			System.out.println(c2);
			
			for(Constructor c4: c3){
				System.out.println(c4);
				System.out.println("���η���" + Modifier.toString(c4.getModifiers()));
				
				Class[] pt = c4.getParameterTypes();//��ȡ���캯���Ĳ�������
				for(Class p : pt){	
					System.out.println("��������" + p.getName());
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