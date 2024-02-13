package Collection;

import java.util.ArrayList;
import java.util.List;

public class MutableColl {

	public static void main(String[] args) {
		List<StringBuilder> course=new ArrayList<StringBuilder>();
		
		course.add(new StringBuilder("java"));
		course.add(new StringBuilder("C"));
		course.add(new StringBuilder("dotnet"));
	
		
		for(StringBuilder str:course) {
			str.append("kochi");
			
		}
		for(StringBuilder str:course) {
			System.out.println(str);
		}
		

	}

}
