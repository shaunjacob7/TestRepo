package String;

public class TestStringComparison {

	public static void main(String[] args) {
		String s1="luminar";
		String s2="luminar";
		String s3=new String("Oracle");
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}

}
