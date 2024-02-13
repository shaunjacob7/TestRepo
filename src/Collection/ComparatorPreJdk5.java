package Collection;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employees{
	int empno;
	String name;
	int age;
	public Employees(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
	
}

class AgeComparator implements Comparator{
	public int compare(Object o1,Object o2){
		
		Employees e1=(Employees)o1;
		Employees e2=(Employees)o2;
		if(e1.age==e2.age) 
			return 0;
		else if(e1.age > e2.age) 
			return 1;
		else(e1.age < e2.age) 
			return -1;
		
	}
}

class NameComparator implements Comparator{
	public int compare(Object o1,Employees o2) {
		Employees e1=(Employees)o1;
		Employees e2=(Employees)o2;
		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorPreJdk5{

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(new Employees(114,"shaun",24));
		li.add(new Employees(118,"jacob",24));
		li.add(new Employees(116,"aslr",24));
		
		System.out.println(li);
		System.out.println("sorting by name-------");
		Collections.sort(li,new NameComparator());
		System.out.println(li);
		
		System.out.println("sorting by age-------");
		Collections.sort(li,new AgeComparator());
		System.out.println(li);
		

	}

}
