package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSort {

	public static void main(String[] args) {
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
