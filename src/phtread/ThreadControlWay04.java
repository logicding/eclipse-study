package phtread;

public class ThreadControlWay04 {
/*
 * 1.�̵߳�����
 * 2.���û�������κ��̣߳�java����һ�����߳������У�������main������ͨ��
 *   Thread.currentThread().getName()��ȡ
 *   
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t = new Thread("my thread");
//		Thread t = new Thread();
//		System.out.println(Thread.currentThread().getName());
		//��������
//		Thread t = new Thread();
//		t.setName("my thread");
//		System.out.println(t.getName());
		//�������ȼ�,���ɿ����������������ϵͳ
//		Thread t = new Thread();
//		t.setPriority(Thread.MAX_PRIORITY);
//		t.setPriority(Thread.MIN_PRIORITY);
		//sleep
//		new Thread(){
//			public void run() {
//				for(int i = 0; i < 100; i++){
//					System.out.println(i);
//					try {
//						Thread.sleep(1000);//sleep������ʱ��״̬����blocked runable
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
		//join �ϲ��߳�
		/*main �̺߳�my thread�ĺϲ�
		 * 
		 * */
		Thread t = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);// sleep������ʱ��״̬����blocked runable
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
		//�߳��Ƿ񻹻���
		System.out.println(t.currentThread().isAlive());
//		try {
//			t.join(10000);//join�еȴ�ʱ��
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);// sleep������ʱ��״̬����blocked runable
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
