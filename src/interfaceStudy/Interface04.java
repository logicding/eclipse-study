package interfaceStudy;

public class Interface04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ӿںͳ�����
		 * ��ͬ�㣺
		 * 1.���������������ʵ�����������ӿ�����ֻ���г���
		 * 2.��������������зǳ��󷽷������ӿ�����ֻ���г��󷽷�
		 * 3.�ӿڱȳ�������ӵĳ���
		 * ��ͬ�㣺
		 * 1.�ӿںͳ��������涼�����г��󷽷�
		 * */
	}

}

				/*
				 * 
				 * �ܹ�
				 * 
				 * �ӿ�
				 *  |
				     ������
				    |
                                            ��1 ��2 ��2				     

				 * 
				 * 
				 * 
				 * 
				 * 
				 * */
			
abstract class Test01{
	abstract void eat();//����Ҫ�йؼ���abstract
	public void sleep(){
		System.out.println("eat...");
	}
}

interface Pet01{
	int i = 1;
	public abstract void eat();
	void sleep();
}