package expack;

public class ArrayTryCatchExample {

	public static void main(String[] args) {
		try {	
			int[] arr=new int[6];
			arr[14]=43;
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
			
			System.out.println("rest of the code");
	}
}
