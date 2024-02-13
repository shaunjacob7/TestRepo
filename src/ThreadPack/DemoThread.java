package ThreadPack;

public class DemoThread extends Thread {
	public DemoThread(String name) {
		super(name);
	}
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"is Daemon thread");
		}else {
			System.out.println(getName()+"is User thread");
		}
	}
	public static void main(String[] args) {
		DemoThread thread1=new DemoThread("a");
		DemoThread thread2=new DemoThread("b");
		thread1.setDaemon(true);
		
		thread1.start();
		thread2.start();
	}

}
