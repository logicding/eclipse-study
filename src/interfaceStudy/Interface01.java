package interfaceStudy;

public class Interface01 {
	public static void main(String[] args) {
		/*
		 * 1.�ӿڵĶ���
		 * 1.1 �﷨ �������η���public�� interface {�������߷���������}
		 * */
		Mobile m = new Mobile();
		Computer co = new Computer();
		m.read();
		co.write();
	}
}

interface USB{
	public void read();
	public void write();//�����з����� 
	public static final int TYPE = 2;
}

class Computer implements USB{//ʵ��һ���ӿ������ʵ�������еķ���
							  //�ͳ�����һ������Ҫʵ�����еĳ��󷽷�
							 //���ǳ������еķ�����Ҫ��abstract����

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#read()
	 */
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read from computer");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#write()
	 */
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write to computer");
	}
	
}


class Mobile implements USB{

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#read()
	 */
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read from mobile");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#write()
	 */
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write to mobile");
	}
	
}