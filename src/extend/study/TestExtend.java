package extend.study;

public class TestExtend {

	public static void main(String[] args) {
	/*1.�����еļ̳�ʵ��
	  2.�̳е��﷨ extends ���� extends ����
	  3.���̳� ʮ������  ��̳п����� �ӿ�ʵ��
	  4.����κ��඼û�̳У�Ĭ���Ǽ̳�object��
	*/
		Dog dog = new Dog();
		dog.age = 2;
		dog.color = "��ɫ";
		dog.name = "���͹�";
		dog.showMsg();
		Cat cat = new Cat();
		cat.age = 3;
		cat.color = "�ڻ�";
		cat.name = "����è";
		cat.showMsg();
	}

}

class A{
	@Override//����object��ķ���
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
class B{}
class C{}

class D extends A{}//���̳�

class E extends D{}//���̳�

//class F extends A,B{}��֧�ֶ�̳�

class Animal{
	String name;
	int age;
	String color;
	
	public void showMsg(){
		System.out.println(name + "," + age +"��"+ "," + color);
	}
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}