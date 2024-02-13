package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Studentz implements Comparable {
	int rollNo;
	int age;
	String name;

	public Studentz(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Object obj) {
		Studentz st=(Studentz)obj;
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	public String toString() {
		return rollNo+" "+age+" "+name;
	}

}

public class ComparableDemoPreJdk5 {

	public static void main(String[] args) {
		List student=new ArrayList();
		student.add(new Studentz(3,24,"shaun"));
		student.add(new Studentz(1,28,"jacob"));
		student.add(new Studentz(2,26,"shony"));
		
	
		Collections.sort(student);
		
		Iterator it=student.iterator();
		while(it.hasNext()) {
			Studentz s=(Studentz)it.next();
			System.out.println(s);
		}
	}

}

