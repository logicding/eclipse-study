package how.todefine_class01;


/*
 1.this表示对象的本身
 2.调用同一个类中的其他成员变量
 3.调用同一个类中的其他成员方法
 4.区分同名成员变量和形参
 5.调用另外一个构造方法
*/
public class ThisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFive person = new PersonFive();
		System.out.println(person.hashCode());
		person.m1();
		PersonFive person2 = new PersonFive(89, "Hellno");
	}

}

class PersonFive{
	//2.this 每个方法默认的第一个参数是this
	//3.可以区分成员变量名和形参变量名
	private int age;
	private String name;
	public void show(){
		
	}
	public void m1(){
		m2();
	}
	public void m2(){
		System.out.println(this.toString());
	}
	public PersonFive(){
		System.out.println(this.hashCode());
	}
	public PersonFive(int age){
		System.out.println("init ... age value");
		this.age = age;
	}
	public PersonFive(String name){
		this.name = name;
	}
	public PersonFive(int age, String name){
		this(age);//表示使用另外一个构造方法
		System.out.println("init ... age and name ");
		//this(age);//表示使用另外一个构造方法
		this.name = name;
		//this(name);注意：this语句调用必须在首行
	}
}