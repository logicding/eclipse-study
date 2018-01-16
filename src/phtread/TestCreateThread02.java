package phtread;

public class TestCreateThread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.启动一个线程调用start方法，而不是run方法，如果调用run方法就是一个单线程
		//2.停止一个线程通过设置一个flag ，run方法返回线程正常结束
		  // terrrunpt
		Thread t = new Thread(new MyThread());
//		t.run();//这个只是单线程了
		t.start();
//		t.stop();被废弃了
//		while(true){
//			System.out.println("--------------");
//		}
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
			if(i > 5){
//				Thread.currentThread().interrupt();//会导致sleep抛出异常
				flag = false;//停止线程的正确方法
			}
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
