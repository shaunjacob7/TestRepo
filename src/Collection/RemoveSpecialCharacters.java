package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String words=new String("The string,class is immutable:The String;is a final class.");
		StringTokenizer st=new StringTokenizer(words," ,.;:\"");
		
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}	
		
		System.out.println("REMOVE DUPICATES----------");
		
		List<String> wordList=new ArrayList<String>();
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken().toLowerCase();
			if(!wordList.contains(temp)) {
				wordList.add(temp);
			}
		}
		
		Collections.sort(wordList);
		for(String st1 : wordList) {
			System.out.println(st1);
		}

	}

}
