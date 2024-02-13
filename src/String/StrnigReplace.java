package String;
import java.util.Scanner;

public class StrnigReplace {

	public static void main(String[] args) {
		String line;
		String replace;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		line=sc.nextLine();
		replace=line.replace("android", "java");
		System.out.println(replace);
		sc.close();
	}

}
