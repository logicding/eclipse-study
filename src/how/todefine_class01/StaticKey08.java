package how.todefine_class01;

public class StaticKey08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic ts = new TestStatic();
		ts.a = 100;
		ts.b = 200;
		
		TestStatic ts01 = new TestStatic();
		
		ts01.a = 300;
		ts01.b = 400;
		System.out.println("ts a" + ts.a);
		System.out.println("ts.b" + ts.b);
		System.out.println("ts01.a" + ts01.a);
		System.out.println("ts01.b" + ts01.b);
		TestStatic.m1();
		ts01.m2();
//		TestStatic.abd = 100;
	}

}
//1.��̬���� Ҳ���������ʵ������ �Ǿ�̬������
//2.��̬�����������еĶ������Ǿ�̬����ÿ���������Լ���һ�ݿ���
//3.��̬����������������ֱ�ӷ���
//4.��̬����������ֱ��ͨ�������Ʒ���,��̬�������ܷ��ʷǾ�̬�����;�̬����
// ��֮����
//5.��̬�����,�����ڼ��صĹ����оͱ�ִ�У���������
class TestStatic{
	static {
		int x = 100;
		int y = 200;
		//������д����
		System.out.println("���� static 01");
	}
	static {
		int c = 100;
		int d = 200;
		System.out.println("���� static 02");
	}
	private static int abd;//��������������static�ؼ���Ӱ��
	public int a;
	public static int b;
	public void m2(){//ʵ������������Ҫʵ������ſ���ʹ��
		System.out.println("����m2");
		m1();
	}
	public static void m1(){
//		m2();
//		a = 100;
//		this.a = 10;
		System.out.println("����m1");
	}
}