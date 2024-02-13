package String;

public class StringReverse {

	public static void main(String[] args) {
		String str="luminar";
		char ch;
		String reverse="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse=ch+reverse;
		}
		System.out.println(reverse);
	}

}
