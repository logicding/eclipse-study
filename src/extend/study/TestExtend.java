package extend.study;

public class TestExtend {

	public static void main(String[] args) {
	/*1.生活中的继承实例
	  2.继承的语法 extends 子类 extends 父类
	  3.单继承 十代单传  多继承可以用 接口实现
	  4.如果任何类都没继承，默认是继承object类
	*/
		Dog dog = new Dog();
		dog.age = 2;
		dog.color = "蓝色";
		dog.name = "京巴狗";
		dog.showMsg();
		Cat cat = new Cat();
		cat.age = 3;
		cat.color = "黑灰";
		cat.name = "虎斑猫";
		cat.showMsg();
	}

}

class A{
	@Override//来自object类的方法
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
class B{}
class C{}

class D extends A{}//单继承

class E extends D{}//单继承

//class F extends A,B{}不支持多继承

class Animal{
	String name;
	int age;
	String color;
	
	public void showMsg(){
		System.out.println(name + "," + age +"岁"+ "," + color);
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}