package how.todefine_class01;
import array.use.way.Array;
public class ClassAndClass {
	/*
	 1.������ϵ use a 
	 2.������ϵ has a
	 3.���Ϲ�ϵonws a
	 4.��Ϲ�ϵis a part of
	 5.�̳й�ϵis a
	 
	 * */
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		Pet pet =  new Pet();
		PersonThree p = new PersonThree();
		Tv tv  = new Tv();
		p.setTv(tv);
		p.ride(b);
		p.care(pet);
		p.getTv().playFilm();
		WhileHorse horse = new WhileHorse();
		horse.eat();
		}
	}


class Horse{
	public void eat(){
		System.out.println("��...");
	}
}

class WhileHorse extends Horse{
	
}

class CPU{
	ROM rom;
}

class ROM{
	int mem;
}

class MainBoard{
	
}

class Computer{
	CPU cpu;
	MainBoard board;
}

class Pet{
	void play(){
		System.out.println("play...");
	}
}

class Bicycle{
	void run(){
		System.out.println("run ...");
	}
}
class Tv{
	public void playFilm(){
		System.out.println("����Ӱ...");
	}
}
class PersonThree{
	private Tv tv;
	/**
	 * @return the tv
	 */
	public Tv getTv() {
		return tv;
	}
	/**
	 * @param tv the tv to set
	 */
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	public void ride(Bicycle b){
		b.run();
	}
	public void care(Pet p){
		p.play();
	}
}
