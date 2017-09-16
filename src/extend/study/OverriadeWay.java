package extend.study;

public class OverriadeWay {
	//方法的继承和覆盖
	/*1.私有的方法不能被继承 （private 修饰的）
	 * 2.公共的和受保护的可以被继承（public protected）
	 * 3.默认的相同包可以继承，不同包不能被继承（default）
	 * 4.方法的覆盖 ，子类里面有父类的同名的方法
	 * 方法覆盖当中，子类的访问控制权限要大于或者等于父类的访问控制权限
	 * public > protexted > default > private
	 * 
	 * 5.方法的重载 overloading
	 * 方法覆盖和方法重载的相同点:方法名称相同
	 * 	不同点：方法覆盖必须有继承关系，方法重载在同一个类中
	 * 方法重载是方法名称相同，参数的个数或者类型不同
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogone dog = new Dogone();
		dog.eat();
		dog.speak();
		dog.play();
//		dog.sleep();私有的方法不能被继承
	}
	
	void sum(){}//重载
	void sum(int a){}
	void sum (AnimalOne animal){}
	
}

class  AnimalOne{
	public void eat(){
		System.out.println("狗粮");
	}
	private void sleep(){
		System.out.println("睡狗窝");
	}
	protected void speak(){
		System.out.println("动物叫");
	}
	void play(){
		System.out.println("动物玩");
	}
}

class Dogone extends AnimalOne{
	public/*protected*/ void speak(){
		super.speak();
		System.out.println("汪汪");//方法的覆盖
	}
}