package how.todefine_class01;

public class ClassWayUse {
	/*
	 * //1.�������﷨�ṹ
	 ���ʿ��Ʒ��ţ�public, private, protected default
	 ����ֵ void int float ��������һ��������
	 �������� ���� ����ĸСд �����ʷָ��д sayHello
	 
	//2.�����ķ���ֵ
	//3.�����ķ���
	 * �з���ֵ �޷���ֵ �в��� �޲���  ʵ������  �෽����static��
	//4.����������
	 * ����������ͬ�������ĸ����������Ͳ�ͬ�����Թ�������
	//5.�����Ĳ���
	//6.�ݹ����
	 * �Լ������Լ�����һ����������
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	static int diG(int x){
		if(x == 1){
			return 1;
		}else{
			System.out.println(x);
			return x*diG(x-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	TestMethod tm;
			tm = new TestMethod();
			tm.sayHello("ţ��");
			//���õĹ��̽���ʵ�ʲ�����ʵ�Σ�
			tm.sum(100, 200);
			tm.sum(1, 2);*/
			/*TestMethodOverloading tm = new TestMethodOverloading();
			tm.sum();
			System.out.println(tm.sum(1, 2));
			System.out.println(tm.sum(1.0f, 2.22f));*/
		
			int result = 5;
			/*	for(int i = 5; i > 0 ; i--){
				result *= i;
			}*/
			diG(result);
			System.out.println(diG(result));
		
		}
	}

class TestMethodOverloading{
	//����ֵ���ܹ��ɷ���������
	public void sum(){
		int a = 789;
		int b = 89;
		int sum = a + b;
		System.out.println(sum);
	}
//	public void sum(){}
	public int sum(int a , int b){
		return a + b;
	}
	public float sum(float a, float b){
		return a + b;
	}
}

class TestMethod{
	//��ʽ������ռλ���ţ����α������ֲ�����
	public int sum(int a, int b){
		return a+b;
	}
	public void sayHello(String name){
		System.out.println("Hello��" + name);
	}
	private void m1(){
		//return;//�������أ����ص����õĵط�
		System.out.println("private m1 ...");
	}
	private void m2(){
		System.out.println("private m2 ...");
	}
	public int m4(){
		return 1000;
	}
	public int max(int a, int b){
		if(a > b){
			return a;
		}else {
			return b;
		}
	}
}