package phtread;

public class TestCreateThread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����һ���̵߳���start������������run�������������run��������һ�����߳�
		//2.ֹͣһ���߳�ͨ������һ��flag ��run���������߳���������
		  // terrrunpt
		Thread t = new Thread(new MyThread());
//		t.run();//���ֻ�ǵ��߳���
		t.start();
//		t.stop();��������
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
		
		
		//�ڲ���ķ�ʽ
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
//				Thread.currentThread().interrupt();//�ᵼ��sleep�׳��쳣
				flag = false;//ֹͣ�̵߳���ȷ����
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
