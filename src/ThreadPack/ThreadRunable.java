package ThreadPack;

public class ThreadRunable implements Runnable {

	public void run() {
		System.out.println("thread running");
	}
	public static void main(String[] args) {
		ThreadRunable obj=new ThreadRunable();
		Thread t=new Thread(obj);
		t.start();
		System.out.println("after thread running");
		

	}

}
