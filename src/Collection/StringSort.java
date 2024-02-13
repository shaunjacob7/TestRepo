package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> course=new ArrayList<>();
		course.add("c");
		course.add("angular");
		course.add("java");
		course.add("android");
		
		
		Iterator<String> it=course.iterator();
		while(it.hasNext()) {
		System.out.println(it.next()); 
		}
		 
		for(String element:course) {
			System.out.println(element);
		}
		Collections.sort(course);
		System.out.println("after sorting---------");
		for(String element:course) {
			System.out.println(element);
		}
		System.out.println("Integer sort---------");
		List<Integer> list=new ArrayList<>();
		list.add(new Integer(5));
		list.add(3);
		list.add(10);
		list.add(6);
		Collections.sort(list);
		for(Integer element:list) {
			System.out.println(element);
		}
	}

}
