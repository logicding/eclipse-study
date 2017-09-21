package interfaceStudy;

public class Interface05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 属性内部类
 * 
 * 内部类 ：嵌套类
 * 
 * */
		Outer out =  new Outer();
		Outer.Inner in =  out.new Inner()；
		//Outer.Inner in = out.getInner();
		in.x2();
		out.m2();
		//out.a;
	}

}


class Outer{
	private int a;
	public int b;
	static int c;
	private void m1(){}
	public void m2(){
		Outer.Inner in = new Outer.Inner();//外部内访问内部类必须实例化
		in.a1 = 1;
		in.x1();
	}
	static void m3(){}
	
	public Inner getInner(){
		return new Outer.Inner();
	}
	
	//属性内部类或者成员内部类
	class Inner{
		private int a1;
		public int a2;
		//static int a3;//内部类不能有静态的方法和属性
		//static void x4(){};
		private void x1(){
			a = 1;
			b = 2;//可以访问外部类的任何成员
			c = 3;
		}
		public void x2(){
			m1();
			m2();
			m3();
		}
	}
	
}