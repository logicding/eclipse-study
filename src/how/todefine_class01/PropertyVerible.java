package how.todefine_class01;

public class PropertyVerible {
	//1.���ԣ���Ա���� ʵ������ �����
	//2. get/set ���� ��ֵ ȡֵ ����
	//3.�ֲ�����
	//4.���Ժ;ֲ�������Ĭ��ֵ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonOne p1 = new PersonOne();
		p1.setAge(10);
		p1.setName("tom");
		p1.showMsg();
		Person p2 = new Person();
		p2.eat();//����Դ�ļ��еķ�public�������࣬��ͬһ����������Դ�ļ���Ҳ����ֱ��ʹ��
		TestDefaultValue tt = new TestDefaultValue();
		tt.test();
		tt.test01();
	/*
	 * ��Ա����(ʵ������)Ĭ��ֵ
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
//		System.out.println(a);//�ֲ�������ʹ��֮ǰ�����ʼ��
		
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
	//˽�е����� �����ķ���
	public void showMsg(){
		System.out.println(age + ":" + name);
	}
}