package how.todefine_class01;

public class StaticKey08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic ts = new TestStatic();
		ts.a = 100;
		ts.b = 200;
		
		TestStatic ts01 = new TestStatic();
		
		ts01.a = 300;
		ts01.b = 400;
		System.out.println("ts a" + ts.a);
		System.out.println("ts.b" + ts.b);
		System.out.println("ts01.a" + ts01.a);
		System.out.println("ts01.b" + ts01.b);
		TestStatic.m1();
		ts01.m2();
//		TestStatic.abd = 100;
	}

}
//1.静态变量 也叫类变量（实例变量 非静态变量）
//2.静态变量就是所有的对象共享，非静态变量每个对象有自己的一份拷贝
//3.静态变量可以用类名称直接访问
//4.静态方法，可以直接通过类名称访问,静态方法不能访问非静态方法和静态变量
// 反之可以
//5.静态代码块,代码在加载的过程中就被执行，从上至下
class TestStatic{
	static {
		int x = 100;
		int y = 200;
		//不可以写方法
		System.out.println("我是 static 01");
	}
	static {
		int c = 100;
		int d = 200;
		System.out.println("我是 static 02");
	}
	private static int abd;//变量的作用域不受static关键字影响
	public int a;
	public static int b;
	public void m2(){//实例方法，必须要实例化后才可以使用
		System.out.println("我是m2");
		m1();
	}
	public static void m1(){
//		m2();
//		a = 100;
//		this.a = 10;
		System.out.println("我是m1");
	}
}