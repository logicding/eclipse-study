package how.todefine_class01;
/*
 * �������ģʽ�� ��ʵ����һ����ֻ�ܲ���һ��ʵ��
 * 1.����ʽ
 * 2.����ʽ
 * 
 * 1.�Լ�ʵ�����Լ�
 * 2.���췽����˽�е�
 * 3.��һ�������Լ�ʵ���ľ�̬����
 * 4.��һ��˽�еľ�̬�������浱ǰʵ��
 * */
public class Sig09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton t = TestSingleton.getInstance();
		TestSingleton t1 = TestSingleton.getInstance();
		TestSingleton t2 = TestSingleton.getInstance();
		System.out.println(t == t1);
		System.out.println(t == t2);
		
		TestSignaletonTwo t3 = TestSignaletonTwo.getInstance();
		TestSignaletonTwo t4 = TestSignaletonTwo.getInstance();
		System.out.println("�� ��ģʽ " + (t3 == t4));
	}

}

//����ģʽ
class TestSingleton{
	private static TestSingleton t;
	private  TestSingleton() {
		// TODO Auto-generated constructor stub
		
	}
	public static TestSingleton getInstance(){
		if(t == null){
			t = new TestSingleton();
		}
		return t;
	}
	
}


//����ģʽ
class TestSignaletonTwo{
	private static TestSignaletonTwo t = new TestSignaletonTwo();//C++�в�֧�ֳ�Ա����������ʼ��
	private TestSignaletonTwo(){
		
	}
	public static TestSignaletonTwo getInstance(){
		return t;
	}
}

