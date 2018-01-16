package phtread;

public class TestCreateThread03 {
/*
 * 线程的状态
 * NEW RUNABLE BLOCKED WAITING TIMED_WAITING TREMINATED
 * jstack可以在命令行查看进程中的线程状态  jstck -l PID
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testNew();
//		testRunnable();
		testTerminated();
		/*
		 * 
		 1.NEW->RUNNABLE->TERMINATED
		 2.BLOCKED
		 3.WAITING
		 4.TIMED_WAITING
		 * 
		 * */
	}

	private static void testTerminated() {
	// TODO Auto-generated method stub
		Thread t = new Thread();
		t.start();
		System.out.println(t.getState());//刚启动线程马上获取状态
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getState());//睡眠一秒后，空线程就结束了
	}

	private static void testRunnable() {
	// TODO Auto-generated method stub
		Thread t = new Thread(){
			public void run() {
				for(int i = 0; i < Integer.MAX_VALUE;i++){
					System.out.println(i);
				}
			}; 
		};
		t.start();
		System.out.println(t.getState());
	
	}

	private static void testNew() {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println(t.getState());//new状态
	}

}
