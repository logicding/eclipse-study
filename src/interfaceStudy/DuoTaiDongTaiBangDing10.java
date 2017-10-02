package interfaceStudy;

import javax.jws.Oneway;

public class DuoTaiDongTaiBangDing10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog01 dog = new Dog01();
		Cat cat = new Cat();
		/*		Animal05[] animal = {dog, cat};
		for(Animal05 a: animal){
			a.eat();
			a.sleep();
		}
		
		Person p = new Students();
		Person pw = new Teacher();
		Person[] per = {p, pw};
		for(Person pp : per){
			pp.eat();
			pp.sleep();*/
		Owner o = new Owner();
		o.care(dog);
		
		System.out.println("-------------------------------------");
		
		o.care(cat);
	}
}
	



class Owner {
	public void care(Animal05  a){
		a.eat();
		a.sleep();
	}
}

abstract class Person{
	public abstract void eat();
	public abstract void sleep();
}

class Students extends Person{

	/* (non-Javadoc)
	 * @see interfaceStudy.Person#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("students eat ...");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.Person#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("students sleep ...");
	}
	
}

class Teacher extends Person{

	/* (non-Javadoc)
	 * @see interfaceStudy.Person#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("teacher eat ...");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.Person#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("teacher sleep ...");
	}
	
}

//1.方法的动态绑定，是指的在运行期间判断引用类型的实际类型，根据其实际类型调用其方法

interface Animal05 {
	public void eat();
	public void sleep();
	
}

class Dog01 implements Animal05{

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal05#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eat ...");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal05#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleep ...");
	}
}
class Cat implements Animal05{

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal05#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat ...");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal05#sleep()
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat sleep ...");
	}
	
}