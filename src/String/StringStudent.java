package String;

class Student{
	String name;
	int roll;
	public Student(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return (roll+"\t"+name);
	}
	public void display() {
		System.out.println(roll+"\t"+name);
	}
	
}

public class StringStudent {

	public static void main(String[] args) {
		Student s=new Student("shaun",20);
		System.out.println(s);
		Student s2=new Student("shauny",27);
		s2.display();
		Student s3=new Student("shauny",35);
		System.out.println(s3.roll+"\t"+s3.name);

	}

}
