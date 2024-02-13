package ThreadPack;

class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class MyThreadOne extends Thread{
	Table obj;
	public void run() {
		obj.printTable(20);
	}
}

class MyThreadTwo extends Thread{
	Table obj;
	public void run() {
		obj.printTable(20);
	}
}


public class ThreadSync {

	public static void main(String[] args) {
		MyThreadOne t1=new MyThreadOne();
		MyThreadTwo t2=new MyThreadTwo();
		t1.start();
		t2.start();
		

	}

}
