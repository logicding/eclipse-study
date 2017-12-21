package phtread;

public class TestCreatePthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		boolean flag = true;
		new Thread(){//匿名类的方式启动线程
			public void run() {
				while(true){
					try {
						Thread.sleep(1000);//毫秒级单位
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("I am new thread");
				}
			};
		}.start();
		while(flag){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i= " +i);
		}
		System.out.println("-----------");
		int j = 0;
		while(true){
			System.out.println("j= " + j);
		}
	}

}
