package extend.study;

public class ExtendsInitProcess {
//继承关系中的初始化过程
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*运行顺序
		 * 父类的静态代码块
		    父类的非静态代码块
		    父类的构造函数*/
//		SuperClassOne superone = new SuperClassOne();
		/*运行顺序
		 * 父类的静态代码块
		子类的静态代码块
		父类的非静态代码块
		父类的构造函数
		子类类的非静态代码块
		父类的构造函数
*/
		/* 1.先父类后子类
		 * 2.先代码块后构造方法
		 * 3.先静态 后非静态
		 * */
		SubClassOne subone = new SubClassOne();
	}

}
class SuperClassOne{
	static {
		System.out.println("父类的静态代码块");
	}
	{
		System.out.println("父类的非静态代码块");
	}
	public SuperClassOne(){
		System.out.println("父类的构造函数");
	}
}
class SubClassOne extends SuperClassOne{
	static {
		System.out.println("子类的静态代码块");
	}
	{
		System.out.println("子类类的非静态代码块");
	}
	public SubClassOne(){
		System.out.println("父类的构造函数");
	}
}