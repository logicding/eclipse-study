package interfaceStudy;

public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.成员变量的特点：只能是final static
 * 2.方法的特点 不能有方法体
 * 3.不能实例化
 * 4.实现一个接口，要实现所有的方法
 * */
		
	}

}

abstract class Comp implements MyInterface{
	public void read(){//自己变成抽象类
		
	}
}


interface MyInterface{
	/*
	 * 1.常量
	 * 2.默认就是public abstract 公共抽象
	 * 3.不能有方法提体
	 * 4.接口里面不能有构造函数，并且不能实例化
	 * 5.实现一个接口必须实现所有的方法，或者自己变成抽象类
	 * */
//	int i = 1;默认情况下就是一个final类型的
	public static final int UP = 1;
	void read();//默认情况下就是public abstract read();
	public abstract void write();
//	public MyInterface(){}
}