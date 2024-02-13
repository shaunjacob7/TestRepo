package String;

public class StringPoolDemo {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3=new String("java");
		
		if(s1==s2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(s1==s3) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(s2==s3) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String s="luminar";
		s.concat("technolab");
		System.out.println(s);
		
		s=s.concat("technolab");
		System.out.println(s);
		

	}

}
