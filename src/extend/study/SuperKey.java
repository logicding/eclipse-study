package extend.study;

public class SuperKey {
//super关键字
	/*
	 * 1.this 表示的当前对象的引用
	 * 2.super表示父类对象的引用
	 * 3.可以调用父类的方法和属性
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass su = new SubClass();
		su.show();
		su.test();
	}

}

class SuperClass{
	int i;
	public void show(){
		System.out.println("SuperClass i = " + i);
		
	}
	public SuperClass(int i){
		this.i = i;
	}
//	public SuperClass(){}//实现默认的构造函数
}
class SubClass extends SuperClass{
	public SubClass(){
		super(9);//调用父类的构造方法
	}
	int i=100;//java里面的成员变量可以在类中定义时直接赋值
	public void show(){
		System.out.println("SubClass i = " + this.i);
		System.out.println("SuperClass i = " + super.i);
	}
	public void test(){
		System.out.println("SuperClass i =" + super.i);
		super.show();
		this.show();//show();
	}
}
