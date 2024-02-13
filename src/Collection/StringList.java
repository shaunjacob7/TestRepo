package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("hello");
		list.add("bye");
		System.out.println(list);
		Collections.addAll(list,"hi","howdy");
		System.out.println(list);
		String[] arr= {"angular","python"};
		Collections.addAll(list, arr);
		System.out.println(list);
		for(String element:list) {
			System.out.println(element);
		}

	}

}
