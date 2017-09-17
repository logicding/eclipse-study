package extend.study;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
/*
 * 1.语法格式 abstract 方法只有声明没有实现（没有方法体）
 * 2.规则
 * 1）一个类中如果有一个抽象方法，那么这个类必须声明为抽象类，相反
 *   一个抽象类可以没有抽象方法（没有意义,因为不能被实例化）
 * 2）抽象类不能被实例化，只能被继承
   3）继承一个抽象类，必须实现（覆盖）所有的抽象方法，或者自己也是抽象类
   4)一个抽象类里面可以有非抽象方法
 */
abstract class AnimalSen{
	public abstract void play();
/*	public abstract void eat(){
		不能有方法体，空的也不行
	}*/
	public abstract void eat();
	public abstract void sleep();
	private int age;
	private String name;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

abstract class PetSen extends AnimalSen{

	/*@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play ...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat ...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep ...");
	}*/
	
}