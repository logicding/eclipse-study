package interfaceStudy;

public class OCPDesin13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog11 dog = new Dog11();
		Cat11 cat = new Cat11();
		Bird b = new Bird();
		Snake s = new Snake();
		Person11 p = new Person11();
		p.feed(cat);
		p.feed(dog);
		p.feed(b);
		p.feed(s);
		
		
	}

}


//open   close

//����չ�ǿ��ŵ� ���޸�ʱ�رյ�
//��������Ǿ���

//1.��Ҫ������ è  ��

//2.��Ҫ����   ���� ����


interface Pet11{
	public void eat();
	public void sleep();
}

class Dog11 implements Pet11{
	public void eat(){
		System.out.println("dog eat");
	}
	public void sleep(){
		System.out.println("dog sleep ...");
	}
}

class Cat11 implements Pet11{
	public void eat(){
		System.out.println("cat eat");
	}
	public void sleep(){
		System.out.println("cat sleep ...");
	}
}

class Bird implements Pet11{
	public void eat(){
		System.out.println("bird eat");
	}
	public void sleep(){
		System.out.println("bird sleep ...");
	}
}

class Snake implements Pet11{
	public void eat(){
		System.out.println("snake eat...");
	}
	public void sleep(){
		System.out.println("snake sleep ...");
	}
}

class Person11{
	public void feed(Pet11 pet){
		pet.eat();
		pet.sleep();
	}
}
/*class Dog11{
	public void eat(){
		System.out.println("dog eat");
	}
	public void sleep(){
		System.out.println("dog sleep ...");
	}
}

class Cat11{
	public void eat(){
		System.out.println("cat eat");
	}
	public void sleep(){
		System.out.println("cat sleep ...");
	}
}

class Bird{
	public void eat(){
		System.out.println("bird eat");
	}
	public void sleep(){
		System.out.println("bird sleep ...");
	}
}

class Person11{
	public void feed(Dog11 dog){
		dog.eat();
		dog.sleep();
	}
	public void feed(Cat11 cat){
		cat.eat();
		cat.sleep();
	}
	
	public void feed(Bird bird){
		bird.eat();
		bird.sleep();
	}
}*/