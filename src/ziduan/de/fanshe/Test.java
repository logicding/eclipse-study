package ziduan.de.fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//import com.sun.org.apache.bcel.internal.classfile.Field;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test(Demo.class);
		test1(Demo.class);
	}
	private static void test1(Class cls) {
		// TODO Auto-generated method stub
		try {
//			Field f2 = cls.getField(name)  �����ı�������ֱ�ӻ�ȡ��
			Field f1 = cls.getDeclaredField("test1");
			f1.setAccessible(true);
			Object obj = cls.newInstance();
			f1.set(obj, 100);//ͨ������ķ�ʽ���и�ֵ��ȡֵ
			System.out.println(f1.get(obj));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	static void test(Class cls){
		  Field[] fields = cls.getDeclaredFields();
		  
		  for(Field f:fields){
			  System.out.println("���η���");
			  System.out.println(Modifier.toString(f.getModifiers()));
			  System.out.println("����");
			  System.out.println(f.getType());
			  
			  System.out.println("����");
			  System.out.println(f.getName());
		  }
	}
}

class Demo{
	private int test1;
	public String test2;
	protected boolean test3;
}
