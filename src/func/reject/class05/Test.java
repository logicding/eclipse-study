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
			m.setAccessible(true);//私有方法需要先设置可访问属性
			m.invoke(cls.newInstance(), null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//获取方法调用
	
		
		
	}

	private static void printMethod(Class cls) {
		// TODO Auto-generated method stub
		Method[] ms = cls.getDeclaredMethods();//获取方法名和修饰符
		for(Method m : ms){
			System.out.print("修饰符：");
			System.out.println(Modifier.toString(m.getModifiers()));
			System.out.print("名称：");
			System.out.println(m.getName());
			
//			Class[] ps = m.getParameterTypes();//没法玩，好像sdk不一样,无法找到getParameters()方法
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