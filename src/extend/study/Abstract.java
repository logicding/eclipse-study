package extend.study;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
/*
 * 1.�﷨��ʽ abstract ����ֻ������û��ʵ�֣�û�з����壩
 * 2.����
 * 1��һ�����������һ�����󷽷�����ô������������Ϊ�����࣬�෴
 *   һ�����������û�г��󷽷���û������,��Ϊ���ܱ�ʵ������
 * 2�������಻�ܱ�ʵ������ֻ�ܱ��̳�
   3���̳�һ�������࣬����ʵ�֣����ǣ����еĳ��󷽷��������Լ�Ҳ�ǳ�����
   4)һ����������������зǳ��󷽷�
 */
abstract class AnimalSen{
	public abstract void play();
/*	public abstract void eat(){
		�����з����壬�յ�Ҳ����
	}*/
	public abstract void eat();
	public abstract void sleep();
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
}

abstract class PetSen extends AnimalSen{

	/*@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play ...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat ...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep ...");
	}*/
	
}