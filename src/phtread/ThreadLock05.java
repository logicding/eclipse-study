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
		System.out.println("---tom lend " + Thread.currentThread().getName());
		k.eatFood();
	}

	synchronized public void eat() {
		System.out.println("tom ���ԳԷ���");
	}
}
class Kite{
	synchronized public void lend(Tom t){
		System.out.println("���kite�ѿ��ӽ��tom����ôtom�Ϳ��ԳԷ���...");
	
		try {
			Thread.sleep(1000);
		}
	 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("kite lend  " + Thread.currentThread().getName());
		t.eat();
	}
	synchronized public void eatFood(){
		System.out.println("kite ���ԳԷ���");
	}
}


class MyThreadLock extends Thread{
	Tom t = new Tom();
	Kite k = new Kite();
	public MyThreadLock(){
		System.out.println(Thread.currentThread().getName());
		this.start();
		k.lend(t);
	}
	@Override
	public void run() {
		super.run();
		t.lend(k);
	}
}