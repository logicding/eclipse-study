package extend.study;

public class OverriadeWay {
	//�����ļ̳к͸���
	/*1.˽�еķ������ܱ��̳� ��private ���εģ�
	 * 2.�����ĺ��ܱ����Ŀ��Ա��̳У�public protected��
	 * 3.Ĭ�ϵ���ͬ�����Լ̳У���ͬ�����ܱ��̳У�default��
	 * 4.�����ĸ��� �����������и����ͬ���ķ���
	 * �������ǵ��У�����ķ��ʿ���Ȩ��Ҫ���ڻ��ߵ��ڸ���ķ��ʿ���Ȩ��
	 * public > protexted > default > private
	 * 
	 * 5.���������� overloading
	 * �������Ǻͷ������ص���ͬ��:����������ͬ
	 * 	��ͬ�㣺�������Ǳ����м̳й�ϵ������������ͬһ������
	 * ���������Ƿ���������ͬ�������ĸ����������Ͳ�ͬ
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogone dog = new Dogone();
		dog.eat();
		dog.speak();
		dog.play();
//		dog.sleep();˽�еķ������ܱ��̳�
	}
	
	void sum(){}//����
	void sum(int a){}
	void sum (AnimalOne animal){}
	
}

class  AnimalOne{
	public void eat(){
		System.out.println("����");
	}
	private void sleep(){
		System.out.println("˯����");
	}
	protected void speak(){
		System.out.println("�����");
	}
	void play(){
		System.out.println("������");
	}
}

class Dogone extends AnimalOne{
	public/*protected*/ void speak(){
		super.speak();
		System.out.println("����");//�����ĸ���
	}
}