package ThreadPack;
class ThreadLuminar extends Thread{
	public void run() {
		while(true) {
			System.out.println("luminar");
		}
	}
}

class ThreadKochi extends Thread{
	public void run() {
		while(true) {
			System.out.println("kochi");
		}
	}
}

public final class inarKochiThreadTest {

	public static void main(String[] args) {
		ThreadLuminar t1=new ThreadLuminar();
		ThreadKochi t2=new ThreadKochi();
		t1.start();
		t2.start();

	}

}
