package interfaceStudy;

public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.一个类可以实现多个接口（多继承效果）
		 * 2.多个类可以实现一个接口（多态）
		 * 3.接口之间可以实现继承
		 * */
		
		Light l = new Light();
		l.close();
		l.open();
		
		Door d = new Door();
		d.close();
		d.open();
		
		System.out.println("--------------------------------");
		OpenClose op1, op2;
		op1 = new Door();
		op2 = new Light();
		op1.open();
		Mp4 mp4 = new Mp4();
		mp4.playMusic();
		mp4.playVedeo();
		System.out.println("--------------------------------");
		Dog dog = new Dog();
		dog.sleep();
		dog.eat();
		dog.playWithOwner();
		System.out.println(dog.SID);
	}

}

class Dog implements Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ezt..");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("slepp..");
	}

	@Override
	public void playWithOwner() {
		// TODO Auto-generated method stub
		System.out.println("play..");
	}
	
}

interface Pet extends Animal{

	public void playWithOwner();
}

interface Animal{
	public static final String SID = "A-001";
//	private int a = 25;接口不能有私有的属性，只能有static 或者public的属性
	public void eat();
	public void sleep();
}

class Mp4 implements Mp3Player, VedioPlayer{

	@Override
	public void playVedeo() {
		// TODO Auto-generated method stub
		System.out.println("播放音乐");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("播放视频");
	}
	
}

interface Mp3Player{
	public void playMusic();
}
interface VedioPlayer{
	public void playVedeo();
}


interface OpenClose{
	public void open();
	public void close();
	
}

class Light implements OpenClose{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开灯");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关灯");
	}
	
}

class Door implements OpenClose{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}
	
}