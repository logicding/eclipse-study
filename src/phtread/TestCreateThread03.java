package phtread;

public class TestCreateThread03 {
/*
 * �̵߳�״̬
 * NEW RUNABLE BLOCKED WAITING TIMED_WAITING TREMINATED
 * jstack�����������в鿴�����е��߳�״̬  jstck -l PID
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
		System.out.println(t.getState());//�������߳����ϻ�ȡ״̬
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getState());//˯��һ��󣬿��߳̾ͽ�����
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
		System.out.println(t.getState());//new״̬
	}

}
