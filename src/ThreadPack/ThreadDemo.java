package ThreadPack;

public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("my thread is running");
	}

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
		System.out.println("outside thread");

	}

}
