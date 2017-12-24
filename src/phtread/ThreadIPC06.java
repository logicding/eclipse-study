package phtread;

public class ThreadIPC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
	/*	Prodecer p =*/ new Prodecer(b).start();
		/*Customer c =*/ new Customer(b).start();
		
//		p.start();
//		c.start();
	}

}


class Box{
	private int content = -1;
	private boolean a = false;
	synchronized public int getContent() {
		while(a == false){//等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
		content--;
		notify();//通知去放
		a = false;
		return content;
	}

	synchronized public int setContent(int content) {
		while(a == true){//等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		this.content = content;
		notify();
		a = true;
//		try {
////			Thread.sleep(1000000);如果这里一直等待，那么另外一个线程执行不了getContent
		//说明对象中共用一个锁？
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return this.content;
	}
}

class Prodecer extends Thread{
	Box box;
	public Prodecer(Box box){
		this.box = box;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		super.run();
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			box.setContent(++i);
			
		}
	}
}

class Customer extends Thread{
	Box box;
	public Customer(Box box){
		this.box = box;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("取。。。" + "i = " + box.getContent());
			
		}
	} 
}