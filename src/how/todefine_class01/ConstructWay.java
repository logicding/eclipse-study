package how.todefine_class01;

public class ConstructWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PersonF person =  new PersonF();
		 person.show();
		 PersonF person2 =  new PersonF(38, "Niu");
		 person2.show();
		 
		 Pet01 pet = new Pet01();
		 Pet01 pet2 =  new Pet01("maomao", 39);
		 
	}

}
/*2017*/
class Pet01 {
	String name;
	int age;
	public Pet01(){}
	public Pet01(String name , int age){
		this.age = age;
		this.name = name;
	}
}

//1.概念：没有返回值，没有void
//2.初始化成员变量
//3.构造方法的重载
//4.1默认构造方法：没有其他构造方法，系统会提供一个
//4.2如果自己定义了一个额外的构造方法，系统不在提供默认的构造方法
class PersonF{
	private int age;
	private String name;
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	public PersonF(int a, String n){
		System.out.println("init2...");
		age = a;
		name = n;
	}
	public PersonF(){
		System.out.println("init ...");
		age = 20;
		name = "tom";
	}
	public void show(){
		System.out.println(age +":" + name );
	}
}