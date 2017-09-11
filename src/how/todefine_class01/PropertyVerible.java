package how.todefine_class01;

public class PropertyVerible {
	//1.属性：成员变量 实例变量 类变量
	//2. get/set 方法 赋值 取值 方法
	//3.局部变量
	//4.属性和局部变量的默认值
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonOne p1 = new PersonOne();
		p1.setAge(10);
		p1.setName("tom");
		p1.showMsg();
		Person p2 = new Person();
		p2.eat();//其他源文件中的非public声明的类，在同一个包中其他源文件中也可以直接使用
		TestDefaultValue tt = new TestDefaultValue();
		tt.test();
		tt.test01();
	/*
	 * 成员变量(实例变量)默认值
		byte:0
		short:0
		int:0
		long:0
		float:0.0
		double:0.0
		char:0
		boolean:false
		String:null
		Customer:null
		PersonOne:null
*
*/

	}

}

class TestDefaultValue{
	byte b;
	short s;
	int i;
	long k;
	float f;
	double d;
	 char c;
	 boolean g;
	 String str;
	 Customer cus;
	 PersonOne p3;
	 public void test(){
		 System.out.println("byte:" + b);
		 System.out.println("short:" + s);
		 System.out.println("int:" + i);
		 System.out.println("long:" + k);
		 System.out.println("float:" + f);
		 System.out.println("double:" + d);
		 System.out.println("char:" + c);
		 System.out.println("boolean:" + g);
		 System.out.println("String:" + str);
		 System.out.println("Customer:" + cus);
		 System.out.println("PersonOne:" + p3);
	 }
	public void test01(){
		int a ;
		String s;
//		System.out.println(a);//局部变量在使用之前必须初始化
		
	} 
}

class Customer{
	{
		int i;
		String name;
	}
	int a;
	
}



class PersonOne{
	/**
	 * @return the name
	 */
	
	private int age;
	private String name ;
	public int  getAge(){
		return age;
	}
	public void setAge(int a){
		if(a > 0)
			age = a;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	//私有的属性 公共的方法
	public void showMsg(){
		System.out.println(age + ":" + name);
	}
}