package interfaceStudy;

public class DuoTaiUseway12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	MP5 mp3 = new Computer01();
		mp3.playMusic();
		MP5 mp4 = new Mobile01();
		mp4.playMusic();
		
		Person01 p = new Person01();
		p.use(mp4);
		p.use(mp3);
		
		Person01 p2 = new Person01(mp4);
		
		p2.use();*/
		Person01 p = new Person01(new Dog07());
		p.care();
		p.care(new Cat07());
	}

}


//1.接口之间
//2.继承关系，父类和子类之间
//3.之间赋值
//4.依赖关系
//5.关联关系



abstract class Animal07{
	public abstract void play();
}

class Dog07 extends Animal07{

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal07#play()
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(" dog play ...");
	}
	
}

class Cat07 extends Animal07{

	/* (non-Javadoc)
	 * @see interfaceStudy.Animal07#play()
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("cat play ...");
	}
	
}


interface MP5{
	public void playMusic();
}
class Mobile01 implements MP5{
	public void playMusic(){
		System.out.println("播放手机中的mp3");
	}
}
class Computer01 implements MP5{
	public void playMusic(){
		System.out.println("播放电脑中的mp3");
	}
}

class Person01{
	MP5 mp3;
	Animal07 animal;
	
	public Person01(Animal07 animal) {
		this.animal = animal;
	}
	public void care(){
		animal.play();
	}
	public void care(Animal07 an){
		an.play();
	}
	public Person01(MP5 mp3) {
		this.mp3 = mp3;
	}
	
	public Person01() {
	}

	public void use(){
		mp3.playMusic();
	}
	public void use(MP5 mp3){
		mp3.playMusic();
	}
}