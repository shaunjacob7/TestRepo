package ThreadPack;

class StaticTable{
	synchronized static void printTable(int n) {
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1400);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class MyThreadOne1 extends Thread{
	public void run() {
		StaticTable.printTable(25);
	}
}

class MyThreadTwo1 extends Thread{
	public void run() {
		StaticTable.printTable(6);
	}
}

class MyThreadThree extends Thread{
	public void run() {
		StaticTable.printTable(8);
	}
}

class MyThreadFour extends Thread{
	public void run() {
		StaticTable.printTable(10);
	}
}


public class StaticSync {

	public static void main(String[] args) {
		MyThreadOne1 t1=new MyThreadOne1();
		MyThreadTwo1 t2=new MyThreadTwo1();
		MyThreadThree t3=new MyThreadThree();
		MyThreadFour t4=new MyThreadFour();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}