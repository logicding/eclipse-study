package interfaceStudy;

public class YinYongLeiXing11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Deer d = new Deer();
		Horse h = (Horse)d;*/
		
		Deer d = new Deer();
		Animal06 amimal = d;//��������ת�������Զ�ת������������ת����up casting
		
		Animal06 ani = new Deer();
		
		Deer deer = (Deer)ani;//��������ת��,��Ҫǿ������ת�������ܻ��������ת���쳣�������ڣ�
		
		Cat06 cat = new Cat06();
		
		Pet06 p = (Pet06)cat;//��������ת��
		
		System.out.println("end");
		
	}

}


//1.ָ¹Ϊ��   �����ڼ�ͻᱨ��
//2.�̳й�ϵ
//3.�ӿ�ʵ�ֹ�ϵ

class Cat06 implements Pet06{
	
}

interface Pet06{
	
}


class Deer extends Animal06{
	
}
class Horse extends Animal06{
	
}

class Animal06{
	
}