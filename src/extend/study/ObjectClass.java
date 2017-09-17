package extend.study;

public class ObjectClass {
/*
 * 1.object类是所有类的顶级父类
 * 2.object里面的常用方法
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonG p = new PersonG(1, "tom", 20);
		PersonG p2 = new PersonG(1, "toms", 20);
		PersonG p3 = p;
		System.out.println(p == p2);
		System.out.println(p == p3);
		
		System.out.println(p.equals(p2));
		
		Class cls = p.getClass();//自描述的一个类
		System.out.println(cls.getName());
		
		System.out.println(p);
		p = null;
		p2 =null;
		p3 =null;
		System.gc();
	}

}

//1.equals 2.getClass 3.toString 4. finalize(gc机制)

class PersonG{
	private int age;
	private String name;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	private int pid;
	public PersonG(){}
	public PersonG(int age, String name, int pid){
		super();
		this.age = age;
		this.pid = pid;
		this.name = name;
	}
	public boolean equals(Object o){
		PersonG p = (PersonG)o;
		if(this.pid == p.pid && (this.name.equals(p.name))){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return pid + "," + "age:" +age + name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();//内存回收的时候会调用
		System.out.println("finalize ...");
	}
}

