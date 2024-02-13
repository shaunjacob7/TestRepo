package ThreadPack;

class Table{
	void printTable(int n) {
		synchronized (this) {
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
}	
class MyThreadOne extends Thread{
	Table obj;
	
}

public class ThreadSyncThis{

	public static void main(String[] args) {
		Table t1=new Table();
		Table t2=new Table();
		

	}

}