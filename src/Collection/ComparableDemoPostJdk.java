package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int rollNo;
	int age;
	String name;

	public Student(int rollNo, int age, String name) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student st) {
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

public class ComparableDemoPostJdk {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(3,24,"shaun"));
		students.add(new Student(1,28,"jacob"));
		students.add(new Student(2,26,"shony"));
		
		for(Student s:students) {
			System.out.println(s);
		}
		Collections.sort(students);
		for(Student s:students) {
			System.out.println(s);
		}
	}

}
