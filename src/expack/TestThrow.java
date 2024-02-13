package expack;

public class TestThrow {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligble to vote");
		}else {
			System.out.println("person is eligble to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(13);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
