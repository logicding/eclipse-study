package extend.study;

public class ExtendStructWay {
//�̳��еĹ��췽��
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
		System.out.println("����������");
	}*/
	public Animal(String name, int age){
		System.out.println("����������");
		this.name = name ;
		this.age = age;//���幹�캯����Ĭ�Ϲ��캯����û����
	}
}
class DogOne extends Animal{
	public DogOne(){
		super("����", 2);
//		super();//Ĭ�ϵģ�д��д�����У����ø���Ĺ��췽��
		System.out.println("Dog run");
	}
}
