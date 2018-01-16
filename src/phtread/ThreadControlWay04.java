package phtread;

public class ThreadControlWay04 {
/*
 * 1.线程的名称
 * 2.如果没有声明任何线程，java会有一个主线程在运行，名称是main，可以通过
 *   Thread.currentThread().getName()获取
 *   
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t = new Thread("my thread");
//		Thread t = new Thread();
//		System.out.println(Thread.currentThread().getName());
		//设置名称
//		Thread t = new Thread();
//		t.setName("my thread");
//		System.out.println(t.getName());
		//设置优先级,不可靠，最后还是依赖操作系统
//		Thread t = new Thread();
//		t.setPriority(Thread.MAX_PRIORITY);
//		t.setPriority(Thread.MIN_PRIORITY);
		//sleep
//		new Thread(){
//			public void run() {
//				for(int i = 0; i < 100; i++){
//					System.out.println(i);
//					try {
//						Thread.sleep(1000);//sleep过程中时，状态属于blocked runable
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					if(i > 5){
//						Thread.interrupted();
//					}
//				}
//			
//			};
//	}.start();
		//join 合并线程
		/*main 线程和my thread的合并
		 * 
		 * */
		Thread t = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);// sleep过程中时，状态属于blocked runable
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		//线程是否还活着
		System.out.println(t.currentThread().isAlive());
//		try {
//			t.join(10000);//join有等待时间
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);// sleep过程中时，状态属于blocked runable
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
