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
//任务
class MindTask extends TimerTask{
	Timer timer;
	MindTask (Timer timer){
		this.timer = timer;
	}
	
	public void run(){//这个run跟Thread中的run不同哦，这个run是继承了Runnable中的
		System.out.println("到点了，该起床了上班去了...");
		timer.cancel();
	}
}

//计时器
class RemindTimer{
	
	Timer timer;
	public RemindTimer(int second) {
		// TODO Auto-generated constructor stub
		timer = new Timer();
		timer.schedule(new MindTask(timer), 1000*second);
	}
}



















