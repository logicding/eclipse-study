package exception;

public class exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try catch finally
		//ע�����1.�������ؼ��־����ܵ���ʹ��
		//      2.try catch | try catch finnaly����ã� | try finnaly
		//      ����������϶�����
		///		3.�����������
		//      4.ƥ���쳣�Ǵ��ϵ��µģ������һ���쳣�����ˣ�������쳣�Ͳ��Ჶ����
		try{
			int[] a = {1,2,3};
			
			//int x = a[3];
			
			String s = null;
			
			//s.length();
			
			int c = 10, d = 0;
			int e = c/d;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ��");
		}catch(NullPointerException e){
			System.out.println("��ָ��");
		}catch(ArithmeticException e){
			System.out.println("�����쳣");
		}finally{
			System.out.println("�϶���ִ��");
		}
		
		System.out.println("shifou ....");//���������쳣������������Żᱻִ�е�
		
	}

}
