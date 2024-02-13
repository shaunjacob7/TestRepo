package ThreadPack;

class Customer{
	int balance=10000;
	
	synchronized void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("less balance,waiting deposit");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance=amount;
		System.out.println("withdraw completed...");
	}
	synchronized void depoist(int amount) {
		System.out.println("goin to depo");
		balance+=amount;
		System.out.println("deposit completed");
		notify();
	}
}

public class Bank {

	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw(10000);
			}
		}.start();
	}

}
