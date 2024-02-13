package ThreadPack;

public class ThreadSleep extends Thread {
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadSleep t=new ThreadSleep();
		t.start();
		ThreadSleep t2=new ThreadSleep();
		t2.start();

	}

}
