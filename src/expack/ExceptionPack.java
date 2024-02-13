package expack;

public class ExceptionPack {

	public static void main(String[] args) {
		try {	int a=10;
			int data=a/0;
			System.out.println(data);
		}
		catch(Exception ai) {
			ai.printStackTrace();
		}
			
			System.out.println("rest of the code");
	}
}
