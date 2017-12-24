package phtread;

public class ThreadLock05 {
//死锁
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadLock my =  new MyThreadLock();
//		my.start();
	}

}


class Tom{
	/*
	 * synchronized 关键字，代表这个方法加锁,相当于不管哪一个线程（例如线程A），
	 * 运行到这个方法时,
	 * 都要检查有没有其它线程B（或者C、 D等）正在用这个方法(或者该类的其他同步方法)，
	 * 有的话要等正在使用synchronized方法的线程B（或者C 、D）运行完这个方法后再运行此线程A,
	 * 没有的话,
	 * 锁定调用者,
	 * 然后直接运行。它包括两种用法：synchronized 方法和 synchronized 块。
	 * 
	 * */
	synchronized public void lend(Kite k){
		System.out.println("如果Tom把筷子借给kite，那么kite就可以吃饭啦...");
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
		System.out.println("tom 可以吃饭了");
	}
}
class Kite{
	synchronized public void lend(Tom t){
		System.out.println("如果kite把筷子借给tom，那么tom就可以吃饭啦...");
	
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
		System.out.println("kite 可以吃饭了");
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