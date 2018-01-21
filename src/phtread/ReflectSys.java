package phtread;

public class ReflectSys {
//java的反射机制
	//Class 自动描述类 （描述当前对象自己的一个类，通过该类实例可以获取类的属性和方法）（包括私有属性和构造方法）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getClass1();
		
	}
	static void getClass1(){
		Persons p = new Persons();
		Class cls = p.getClass();
		System.out.println(cls.getName());
	}
}


class Persons{
	private int age;
	private String name;
	private int pid;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}