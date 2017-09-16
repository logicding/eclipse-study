package extend.study;

public class ExtendStructWay {
//继承中的构造方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogOne dog = new DogOne();
		dog.showMsg();
	}

}
class Animal{
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
	public void showMsg(){
		System.out.println("age:"+age+"name:"+name);
	}
	/*public Animal(){
		System.out.println("动物跑起来");
	}*/
	public Animal(String name, int age){
		System.out.println("动物跑起来");
		this.name = name ;
		this.age = age;//定义构造函数后，默认构造函数就没有了
	}
}
class DogOne extends Animal{
	public DogOne(){
		super("京巴", 2);
//		super();//默认的，写不写都会有，调用父类的构造方法
		System.out.println("Dog run");
	}
}
