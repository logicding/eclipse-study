package how.todefine_class01;

public class Test {
//1.如何声明类
	/*
	1.访问控制：public private protected (default什么都不写)
	2.class:关键字表示声明一个类
	3.类名称：首字母要大写，单词分割大写CustimerOrder
	4.extends implements
	5.{}类体body
	6.{
		类的成员member,属性（变量）和方法
		构造方法
		内部类
		代码块
		...
	}
	7.同一个类文件中 创建多个类，public 公共类只能有一个
	 */
	//2.如何产生一个对象
	//3.访问类成员 点儿 (.)运算符
	//4.一个类可以创建若干个对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------01");
		//基本类型的声明
		int i ;
		Person p1;
		p1 = new Person();
		//new Person();对象
		//p1 ：对象的引用，（指针），对象的一个实例
		p1.age = 20;
		p1.name = "tom";
		p1.eat();
		p1.work();
		p1.showMsg();
		Circle ci = new Circle();
		/*
		 * 第一：如果两个代码都在同一个包中的话，
		 *  是不用使用import语句来调用的。 可以直接使用另一个主类，
		 *  通过新建对象的方式使用类的方法等等。
		       第二：如果两个代码不在同一个包中，
		       可以使用"import 包名.类名"的形式来导入另一个主类，
		       然后还是通过新建对象的方式使用主类的方法等
		 * */
		ci.r = 100;
		System.out.println(ci.getMianji());
		System.out.println(ci.getZhouchang());
	}
}

//作业
//创建一个圆Circle 有PI 和半径 r成员变量，两个方法：周长和半径


class Person{
	//成员变量->实例变量和类变量
	public int age;
	public String name;
	//成员方法
	public void showMsg(){
		System.out.println(age+name);
	}
	public void eat(){
		System.out.println("eat 。。。");
	}
	public void work(){
		System.out.println("work 。。。");
	}
	//构造方法
}

class Myclass{
	
}
