package how.todefine_class01;

public class Test {
//1.���������
	/*
	1.���ʿ��ƣ�public private protected (defaultʲô����д)
	2.class:�ؼ��ֱ�ʾ����һ����
	3.�����ƣ�����ĸҪ��д�����ʷָ��дCustimerOrder
	4.extends implements
	5.{}����body
	6.{
		��ĳ�Աmember,���ԣ��������ͷ���
		���췽��
		�ڲ���
		�����
		...
	}
	7.ͬһ�����ļ��� ��������࣬public ������ֻ����һ��
	 */
	//2.��β���һ������
	//3.�������Ա ��� (.)�����
	//4.һ������Դ������ɸ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------01");
		//�������͵�����
		int i ;
		Person p1;
		p1 = new Person();
		//new Person();����
		//p1 ����������ã���ָ�룩�������һ��ʵ��
		p1.age = 20;
		p1.name = "tom";
		p1.eat();
		p1.work();
		p1.showMsg();
		Circle ci = new Circle();
		/*
		 * ��һ������������붼��ͬһ�����еĻ���
		 *  �ǲ���ʹ��import��������õġ� ����ֱ��ʹ����һ�����࣬
		 *  ͨ���½�����ķ�ʽʹ����ķ����ȵȡ�
		       �ڶ�������������벻��ͬһ�����У�
		       ����ʹ��"import ����.����"����ʽ��������һ�����࣬
		       Ȼ����ͨ���½�����ķ�ʽʹ������ķ�����
		 * */
		ci.r = 100;
		System.out.println(ci.getMianji());
		System.out.println(ci.getZhouchang());
	}
}

//��ҵ
//����һ��ԲCircle ��PI �Ͱ뾶 r��Ա�����������������ܳ��Ͱ뾶


class Person{
	//��Ա����->ʵ�������������
	public int age;
	public String name;
	//��Ա����
	public void showMsg(){
		System.out.println(age+name);
	}
	public void eat(){
		System.out.println("eat ������");
	}
	public void work(){
		System.out.println("work ������");
	}
	//���췽��
}

class Myclass{
	
}
