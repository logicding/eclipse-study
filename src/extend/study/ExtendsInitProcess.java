package extend.study;

public class ExtendsInitProcess {
//�̳й�ϵ�еĳ�ʼ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����˳��
		 * ����ľ�̬�����
		    ����ķǾ�̬�����
		    ����Ĺ��캯��*/
//		SuperClassOne superone = new SuperClassOne();
		/*����˳��
		 * ����ľ�̬�����
		����ľ�̬�����
		����ķǾ�̬�����
		����Ĺ��캯��
		������ķǾ�̬�����
		����Ĺ��캯��
*/
		/* 1.�ȸ��������
		 * 2.�ȴ������췽��
		 * 3.�Ⱦ�̬ ��Ǿ�̬
		 * */
		SubClassOne subone = new SubClassOne();
	}

}
class SuperClassOne{
	static {
		System.out.println("����ľ�̬�����");
	}
	{
		System.out.println("����ķǾ�̬�����");
	}
	public SuperClassOne(){
		System.out.println("����Ĺ��캯��");
	}
}
class SubClassOne extends SuperClassOne{
	static {
		System.out.println("����ľ�̬�����");
	}
	{
		System.out.println("������ķǾ�̬�����");
	}
	public SubClassOne(){
		System.out.println("����Ĺ��캯��");
	}
}