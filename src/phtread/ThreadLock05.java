package phtread;

public class ThreadLock05 {
//����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadLock my =  new MyThreadLock();
//		my.start();
	}

}


class Tom{
	/*
	 * synchronized �ؼ��֣����������������,�൱�ڲ�����һ���̣߳������߳�A����
	 * ���е��������ʱ,
	 * ��Ҫ�����û�������߳�B������C�� D�ȣ��������������(���߸��������ͬ������)��
	 * �еĻ�Ҫ������ʹ��synchronized�������߳�B������C ��D����������������������д��߳�A,
	 * û�еĻ�,
	 * ����������,
	 * Ȼ��ֱ�����С������������÷���synchronized ������ synchronized �顣
	 * 
	 * */
	synchronized public void lend(Kite k){
		System.out.println("���Tom�ѿ��ӽ��kite����ôkite�Ϳ��ԳԷ���...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.eat();
	}

	synchronized public void eat() {
		System.out.println("tom ���ԳԷ���");
	}
}
class Kite{
	synchronized public void lend(Tom t){
		System.out.println("���kite�ѿ��ӽ��tom����ôkite�Ϳ��ԳԷ���...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.eat();
	}
	synchronized public void eat(){
		System.out.println("kite ���ԳԷ���");
	}
}


class MyThreadLock extends Thread{
	Tom t = new Tom();
	Kite k = new Kite();
	public MyThreadLock(){
		this.start();
		k.lend(t);//ͨ��������ʵ�synchronized������ʱ�򣬻�ȡ���Ƕ�����
	}
	@Override
	public void run() {
		super.run();
		t.lend(k);
	}
}