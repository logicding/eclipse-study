package interfaceStudy;

public class Interface05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * �����ڲ���
 * 
 * �ڲ��� ��Ƕ����
 * 
 * */
		Outer out =  new Outer();
		Outer.Inner in =  out.new Inner()��
		//Outer.Inner in = out.getInner();
		in.x2();
		out.m2();
		//out.a;
	}

}


class Outer{
	private int a;
	public int b;
	static int c;
	private void m1(){}
	public void m2(){
		Outer.Inner in = new Outer.Inner();//�ⲿ�ڷ����ڲ������ʵ����
		in.a1 = 1;
		in.x1();
	}
	static void m3(){}
	
	public Inner getInner(){
		return new Outer.Inner();
	}
	
	//�����ڲ�����߳�Ա�ڲ���
	class Inner{
		private int a1;
		public int a2;
		//static int a3;//�ڲ��಻���о�̬�ķ���������
		//static void x4(){};
		private void x1(){
			a = 1;
			b = 2;//���Է����ⲿ����κγ�Ա
			c = 3;
		}
		public void x2(){
			m1();
			m2();
			m3();
		}
	}
	
}