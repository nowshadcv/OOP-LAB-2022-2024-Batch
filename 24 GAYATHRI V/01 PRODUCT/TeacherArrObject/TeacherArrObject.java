package gayathri;

import java.util.Scanner;
class EmployeeT{
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}
class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		
	
	super(empid,name,salary,address);
	this.department=department;
	this.subject=subject;
}
public void display() {
	System.out.println("teacher id: "+empid);
	System.out.println("teacher name: "+name);
	System.out.println("teacher salary: "+salary);
	System.out.println("teacher address: "+address);
	System.out.println("teacher department: "+department);
	System.out.println("teacher subject: "+subject);




}
	
}
public class TeacherArrObject {

	public static void main(String[] args) {
		System.out.println("enter number of teachers : ");
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one....");
		
		Teacher teacher []	= new Teacher[n];
		Scanner scT= new Scanner(System.in);
		int tid; String name; float salary;String address;
		String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter"+i+"teacher details..");
			System.out.println("enter teacher id(integer):");
			tid=scT.nextInt();
			System.out.println("enter teacher name(string):");
			name=scT.next();
			System.out.println("enter teacher salary(float):");
			salary=scT.nextFloat();
			System.out.println("enter teacher address(string):");
			address=scT.next();
			System.out.println("enter teacher department(string)");
			department=sc.next();
			System.out.println("enter teacher subject(string):");
			subject =scT.next();
			Teacher t =new Teacher (tid,name,salary,address,department,subject);
			teacher [i]=t;}
		System.out.println("Teacher are :\n");
		for(Teacher x:teacher) {
			x.display();System.out.println("\n");
		}

	}
}

