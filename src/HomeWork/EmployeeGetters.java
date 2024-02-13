package HomeWork;
import java.util.Scanner;

class Employee1{
	int empID;
	String empName;	
}

class PermenantEmployee1 extends Employee{
	public PermenantEmployee1(int empID, String empName) {
		super(empID, empName);
	}


	private String des;
	private String dep;
	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	
	final float salary=1000;
		
	public void printDetails() {
		System.out.println("empID:"+empID+"\tname:"+empName+"\tdesignation:"+getDes()+"\tdepartment:"+getDep()+"\tsalary:"+salary);
	}
}
class PartTimeEmployee1 extends Employee{
	public PartTimeEmployee1(int empID, String empName) {
		super(empID, empName);
	}

	private int workingDays;
	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	final int salaryPartTime=750;
	
	public void printDetailWithSalary() {
		System.out.println("empID:"+empID+"\tname:"+empName+"\tworkingdays:"+getWorkingDays()+"\tSalary:"+salaryPartTime);
	}
}

public class EmployeeGetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter permanent employee id:");
		int id=sc.nextInt();
		System.out.println("enter permanent employee name:");
		String name=sc.next();
		System.out.println("enter permanent employee designation:");
		String designation=sc.next();
		System.out.println("enter permanent employee department:");
		String department=sc.next();
		
		PermenantEmployee1 perEmp=new PermenantEmployee1(id, name);
		perEmp.setDep(department);
		perEmp.setDes(designation);
		perEmp.printDetails();
		
		System.out.println("enter part time employee id:");
		int id2=sc.nextInt();
		System.out.println("enter part time employee name:");
		String name2=sc.next();
		System.out.println("enter part time employee working days:");
		int work=sc.nextInt();
		PartTimeEmployee1 partEmp=new PartTimeEmployee1(id2, name2);
		partEmp.setWorkingDays(work);
		partEmp.printDetailWithSalary();
		
		
	}

}

