package how.todefine_class01;


/*
 1.this��ʾ����ı���
 2.����ͬһ�����е�������Ա����
 3.����ͬһ�����е�������Ա����
 4.����ͬ����Ա�������β�
 5.��������һ�����췽��
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
	//2.this ÿ������Ĭ�ϵĵ�һ��������this
	//3.�������ֳ�Ա���������βα�����
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
		this(age);//��ʾʹ������һ�����췽��
		System.out.println("init ... age and name ");
		//this(age);//��ʾʹ������һ�����췽��
		this.name = name;
		//this(name);ע�⣺this�����ñ���������
	}
}