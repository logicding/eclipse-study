package extend.study;

public class SuperKey {
//super�ؼ���
	/*
	 * 1.this ��ʾ�ĵ�ǰ���������
	 * 2.super��ʾ������������
	 * 3.���Ե��ø���ķ���������
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass su = new SubClass();
		su.show();
		su.test();
	}

}

class SuperClass{
	int i;
	public void show(){
		System.out.println("SuperClass i = " + i);
		
	}
	public SuperClass(int i){
		this.i = i;
	}
//	public SuperClass(){}//ʵ��Ĭ�ϵĹ��캯��
}
class SubClass extends SuperClass{
	public SubClass(){
		super(9);//���ø���Ĺ��췽��
	}
	int i=100;//java����ĳ�Ա�������������ж���ʱֱ�Ӹ�ֵ
	public void show(){
		System.out.println("SubClass i = " + this.i);
		System.out.println("SuperClass i = " + super.i);
	}
	public void test(){
		System.out.println("SuperClass i =" + super.i);
		super.show();
		this.show();//show();
	}
}
