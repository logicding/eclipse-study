package interfaceStudy;

public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.��Ա�������ص㣺ֻ����final static
 * 2.�������ص� �����з�����
 * 3.����ʵ����
 * 4.ʵ��һ���ӿڣ�Ҫʵ�����еķ���
 * */
		
	}

}

abstract class Comp implements MyInterface{
	public void read(){//�Լ���ɳ�����
		
	}
}


interface MyInterface{
	/*
	 * 1.����
	 * 2.Ĭ�Ͼ���public abstract ��������
	 * 3.�����з�������
	 * 4.�ӿ����治���й��캯�������Ҳ���ʵ����
	 * 5.ʵ��һ���ӿڱ���ʵ�����еķ����������Լ���ɳ�����
	 * */
//	int i = 1;Ĭ������¾���һ��final���͵�
	public static final int UP = 1;
	void read();//Ĭ������¾���public abstract read();
	public abstract void write();
//	public MyInterface(){}
}