package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPost {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		List<String> lst=new ArrayList<>();
		
		lst.add("shaun");
		lst.add("shaunj");
		
		System.out.println(lst);
		Iterator<String> i=lst.iterator();
		while(i.hasNext()) {
			//String str=(String)i.next(); TYPE CASTING
			String str=i.next();
			System.out.println(str);
		}
		for(String elment:lst) {
			System.out.println(elment);
		}
	}

}
