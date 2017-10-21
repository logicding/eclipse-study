package ExceptionsStudy;

public class Exceptions05 {
/*
 * �����try catch finally�÷������ǵ���
 * try{
 * 		���ܻ��׳��쳣�Ĵ���
 * }catch (xxx���͵��쳣�� e){
 * 		e.print...
 * }finally{
 * 		
 * }
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			test();
		}catch (MyException e){
			e.printStackTrace();
		}
		Pan pan = new Pan(6);
		try {
			pan.use();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void test() throws MyException{
		int a = -1;
		if(a < 0){
			throw new MyException("�쳣������");//�쳣������ʱ����Ҫ��ӡ����Ϣ
		}else{
			System.out.println("û���쳣");
		}
	}
}

class Pan{
	int p;
	public Pan(int p){
		this.p = p;
	}
	
	public void use() throws MyException{//����ʹ�õĹؼ�����throws
		if(p > 500){
			throw new MyException("ѹ������");//����ʹ�õĹؼ�����throw
		}else {
			System.out.println("ѹ������");
		}
	}
}


//�Զ�����쳣�࣬��Ҫʹ��super���츸��
class MyException extends Exception{
	public MyException(String str){
		super(str);
	}
}