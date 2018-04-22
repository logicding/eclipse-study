package func.reject.class05;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMethod(Demo.class);
		testInvoke(Demo.class);
	}

	private static void testInvoke(Class<Demo> cls) {
		// TODO Auto-generated method stub
		Method m = null;
		try {
			m = cls.getDeclaredMethod("test1", null);
			m.setAccessible(true);//˽�з�����Ҫ�����ÿɷ�������
			m.invoke(cls.newInstance(), null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//��ȡ��������
	
		
		
	}

	private static void printMethod(Class cls) {
		// TODO Auto-generated method stub
		Method[] ms = cls.getDeclaredMethods();//��ȡ�����������η�
		for(Method m : ms){
			System.out.print("���η���");
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.print("���ƣ�");
			System.out.println(m.getName());
			
//			Class[] ps = m.getParameterTypes();//û���棬����sdk��һ��,�޷��ҵ�getParameters()����
//			for(Class p : ps){}
//			System.out.println(p);
		}
	}

}


class Demo{
	private void test1(){
		System.out.println("test1");
	}
	public void test2(int a){
		System.out.println("test2");
	}
	public void test3(int a , String b){
		System.out.println("test3:"+a+","+b);
	}
}