package phtread;

public class TestCreateThread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new MyThread());
//		t.run();//这个只是单线程了
		t.start();
		
		while(true){
			System.out.println("--------------");
		}
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				boolean flag = true;
//				int i = 0;
//				while (flag) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+" i= " + i++);
//				}
//			}
//		}).start();
		
		
		//内部类的方式
//		new Thread(){
//			boolean flag = true;
//			int i = 1;
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				while (flag) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+" i= " + i++);
//				}
//			}
//		}.start();
	}

}

class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = true;
		int i = 0;
		while (flag) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" i= " + i++);
		}
	}
}
