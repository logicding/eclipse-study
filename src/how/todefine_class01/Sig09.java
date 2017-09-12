package how.todefine_class01;
/*
 * 单例设计模式， 单实例，一个类只能产生一个实例
 * 1.懒汉式
 * 2.饿汉式
 * 
 * 1.自己实例化自己
 * 2.构造方法是私有的
 * 3.有一个创建自己实例的静态方法
 * 4.有一个私有的静态变量保存当前实例
 * */
public class Sig09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton t = TestSingleton.getInstance();
		TestSingleton t1 = TestSingleton.getInstance();
		TestSingleton t2 = TestSingleton.getInstance();
		System.out.println(t == t1);
		System.out.println(t == t2);
		
		TestSignaletonTwo t3 = TestSignaletonTwo.getInstance();
		TestSignaletonTwo t4 = TestSignaletonTwo.getInstance();
		System.out.println("饿 汉模式 " + (t3 == t4));
	}

}

//懒汉模式
class TestSingleton{
	private static TestSingleton t;
	private  TestSingleton() {
		// TODO Auto-generated constructor stub
		
	}
	public static TestSingleton getInstance(){
		if(t == null){
			t = new TestSingleton();
		}
		return t;
	}
	
}


//饿汉模式
class TestSignaletonTwo{
	private static TestSignaletonTwo t = new TestSignaletonTwo();//C++中不支持成员变量这样初始化
	private TestSignaletonTwo(){
		
	}
	public static TestSignaletonTwo getInstance(){
		return t;
	}
}

