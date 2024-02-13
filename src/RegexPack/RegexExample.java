package RegexPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("xs");
		boolean b=m.matches();
		System.out.println(b);
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
		
		String content="this is shaun from infopark";
		String pattern=".*park.*";
		boolean isMatch=Pattern.matches(pattern, content);
		System.out.println(isMatch);
		
		System.out.println(Pattern.matches("\\d","abc" ));
		System.out.println(Pattern.matches("\\d","4" ));
		System.out.println(Pattern.matches("\\d","456" ));
		
		System.out.println(Pattern.matches("\\D","a" ));
		System.out.println(Pattern.matches("\\D","456" ));
		System.out.println(Pattern.matches("\\D","abc" ));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32" ));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun" ));
		

	}

}
