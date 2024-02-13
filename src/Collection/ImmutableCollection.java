package Collection;

import java.util.ArrayList;
import java.util.List;

public class ImmutableCollection {

	public static void main(String[] args) {
	List<String> course=new ArrayList<String>();
	
	course.add("java");
	course.add("dotnet");
	course.add("bigdata");
	course.add("mern stack");
	
	for(String str:course) {
		str+="kochi";
		
	}
	for(String str:course) {
		System.out.println(str);
	}
	

	}

}
