package phtread;

import java.util.Timer;
import java.util.TimerTask;

public class TreadGaoJiTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemindTimer(5);
		for(int i = 5;i>=1;i--){
			try {
				System.out.println("time " + i + " s");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
//����
class MindTask extends TimerTask{
	Timer timer;
	MindTask (Timer timer){
		this.timer = timer;
	}
	
	public void run(){//���run��Thread�е�run��ͬŶ�����run�Ǽ̳���Runnable�е�
		System.out.println("�����ˣ��������ϰ�ȥ��...");
		timer.cancel();
	}
}

//��ʱ��
class RemindTimer{
	
	Timer timer;
	public RemindTimer(int second) {
		// TODO Auto-generated constructor stub
		timer = new Timer();
		timer.schedule(new MindTask(timer), 1000*second);
	}
}



















