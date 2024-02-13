package HomeWork;
import java.util.Scanner;

class Employee{
	int empID;
	String empName;
	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}
	
}

class PermenantEmployee extends Employee{
	String des;
	String dep;
	final float salary=1000;
	public PermenantEmployee(int empID, String empName, String des, String dep) {
		super(empID, empName);
		this.des = des;
		this.dep = dep;
	}
	
	
	public void printDetails() {
		System.out.println("empID:"+empID+"\tname:"+empName+"\tdesignation:"+des+"\tdepartment:"+dep+"\tsalary:"+salary);
	}
}
class PartTimeEmployee extends Employee{
	int workingDays;
	final int salaryPartTime=750;
	public PartTimeEmployee(int empID, String empName, int workingDays) {
		super(empID, empName);
		this.workingDays = workingDays;
	}
	public void printDetailWithSalary() {
		System.out.println("empID:"+empID+"\tname:"+empName+"\tworkingdays:"+workingDays+"\tSalary:"+salaryPartTime);
	}
}

public class EmployeeHwConstructor {

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
		PermenantEmployee pr=new PermenantEmployee(id,name,designation,department);
		pr.printDetails();
		
		System.out.println("enter part time employee id:");
		int id1=sc.nextInt();
		System.out.println("enter part time employee name:");
		String name1=sc.next();
		System.out.println("enter permanent employee working days:");
		int wd=sc.nextInt();
		PartTimeEmployee pt=new PartTimeEmployee(id1,name1,wd);
		pt.printDetailWithSalary();
	}

}
