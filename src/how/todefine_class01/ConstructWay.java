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

//1.���û�з���ֵ��û��void
//2.��ʼ����Ա����
//3.���췽��������
//4.1Ĭ�Ϲ��췽����û���������췽����ϵͳ���ṩһ��
//4.2����Լ�������һ������Ĺ��췽����ϵͳ�����ṩĬ�ϵĹ��췽��
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