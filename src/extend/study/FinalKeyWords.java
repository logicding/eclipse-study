package extend.study;

public class FinalKeyWords {
/*
 * 1.ʹ��final����һ������
 * 2.���εķ������ܱ�����
 * 3.�ŵ���ǰ����ֹ���̳�
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Const.DOWN);
	}

}
/*final*/ class Abc{
	int i = 1;
	final int b =2;//��������
	public void test(){
		i = 2;
//		b = 3;
	}
	public final void showMsg(){//��ֹ����������
		
	}
}

class BC extends Abc{
//	public void showMsg(){}
}