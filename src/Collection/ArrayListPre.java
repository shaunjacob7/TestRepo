package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		List lst=new ArrayList();
		
		lst.add("shaun");
		lst.add("shaunj");
		
		System.out.println(lst);
		Iterator i=lst.iterator();
		while(i.hasNext()) {
			String str=(String)i.next();
			System.out.println(str);	
		}
		
	}

}
