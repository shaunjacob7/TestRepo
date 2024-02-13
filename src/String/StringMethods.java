package String;

public class StringMethods {

	public static void main(String[] args) {
	String s="Luminar technolabs";
	System.out.println(s.substring(7));
	System.out.println(s.substring(0, 7));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.trim());
	System.out.println(s.startsWith("lu"));
	System.out.println(s.endsWith("bs"));
	System.out.println(s.charAt(0));
	System.out.println(s.length());
	String replaceString=s.replace("ar", "art");
	System.out.println(replaceString);
	

	}

}
