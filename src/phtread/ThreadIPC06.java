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
		while(a == false){//�ȴ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
		content--;
		notify();//֪ͨȥ��
		a = false;
		return content;
	}

	synchronized public int setContent(int content) {
		while(a == true){//�ȴ�
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
////			Thread.sleep(1000000);�������һֱ�ȴ�����ô����һ���߳�ִ�в���getContent
		//˵�������й���һ������
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
			System.out.println("ȡ������" + "i = " + box.getContent());
			
		}
	} 
}