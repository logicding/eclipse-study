package interfaceStudy;

public class Interface04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*接口和抽象类
		 * 不同点：
		 * 1.抽象类里面可以有实例变量，而接口里面只能有常量
		 * 2.抽象类里面可以有非抽象方法，而接口里面只能有抽象方法
		 * 3.接口比抽象类更加的抽象
		 * 相同点：
		 * 1.接口和抽象类里面都可以有抽象方法
		 * */
	}

}

				/*
				 * 
				 * 架构
				 * 
				 * 接口
				 *  |
				     抽象类
				    |
                                            类1 类2 类2				     

				 * 
				 * 
				 * 
				 * 
				 * 
				 * */
			
abstract class Test01{
	abstract void eat();//必须要有关键字abstract
	public void sleep(){
		System.out.println("eat...");
	}
}

interface Pet01{
	int i = 1;
	public abstract void eat();
	void sleep();
}