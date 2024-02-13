package ThreadPack;

class ThreadWelcome extends Thread{
	public void run() {
		System.out.println("welcome");
	}
}

class ThreadKochi1 extends Thread{
	public void run() {
		System.out.println("kochi");
	}
}

class ThreadLuminar1 extends Thread{
	public void run() {
		System.out.println("Luminar");
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		ThreadWelcome t1=new ThreadWelcome();
		ThreadKochi1 t2=new ThreadKochi1();
		ThreadLuminar1 t3=new ThreadLuminar1();
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(5);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(10);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}

}
