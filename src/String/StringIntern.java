package String;

public class StringIntern {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="hello";
		String s3="hello";
		
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1==s2"+(s2==s3));
		s1=s1.intern();
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1==s2"+(s2==s3));
		
		String s4="abc";
		String s5="abc";
		String s6="abc".intern();
		String s7=new String("abc");
		System.out.println("s5==s6"+(s5==s6));
		System.out.println("s6==s7"+(s6==s7));
		System.out.println("s4==s7"+(s6==s7));
	}

}
