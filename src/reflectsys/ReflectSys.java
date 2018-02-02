package reflectsys;

public class ReflectSys {
//java的反射机制
	//Class 自动描述类 （描述当前对象自己的一个类，通过该类实例可以获取类的属性和方法）（包括私有属性和构造方法）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getClass1();
		getClass2();
		getClass3();
		
	}
	//推荐使用该方法来获取自描述，主要原因是该方法可以通过配置文件来修改代码逻辑的效果
	private static void getClass3() {
	// TODO Auto-generated method stub
		Class cls = null;
		try {
			cls = Class.forName("reflectsys.Persons");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cls.getName());
}
	private static void getClass2() {
	// TODO Auto-generated method stub
		Class cls = Persons.class;//通过.class属性
		System.out.println(cls.getName());
	
}
	static void getClass1(){
		Persons p = new Persons();
		Class cls = p.getClass();//所有的类都有一个自描述类
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