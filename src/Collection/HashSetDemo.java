package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public abstract class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("shaun");
		set.add("shaun");
		set.add("shaun");
		set.add("jacob");
		set.add("tttt");
		
		System.out.println(set);
		
		Enumeration<String> e = Collections.enumeration(set);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
