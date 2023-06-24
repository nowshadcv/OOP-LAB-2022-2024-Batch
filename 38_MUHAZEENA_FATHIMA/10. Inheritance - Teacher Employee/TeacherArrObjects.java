package packA;

import java.util.Scanner;

class EmployeeT{
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){
	}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
}
class Teacher extends EmployeeT{
	String department ,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display() {
		System.out.println("Teacher id : " +empid);
		System.out.println("Teacher name : " +name);
		System.out.println("Teacher salary : " +salary);
		System.out.println("Teacher address : " +address);
		System.out.println("Teacher department : " +department);
		System.out.println("Teacher subject : " +subject);
	}
}
public class TeacherArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter Number of Teachers : ");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teacher Details One by One .. ");
		Teacher teacher[]=new Teacher[n];
		Scanner sct =new Scanner (System.in);
		int tid; String name;float salary;String address;
		String department ;
		String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter " +i+ " Teacher details.. " );
			System.out.println("Enter Teacher id (integer) : " );
			tid=sct.nextInt();
			System.out.println("Enter Teacher name (String) : " );
			name=sct.next();
			System.out.println("Enter Teacher salary (float) : " );
			salary=sct.nextFloat();
			System.out.println("Enter Teacher address (String) : " );
			address=sct.next();
			System.out.println("Enter Teacher Department (String) : " );
			department=sct.next();
			System.out.println("Enter Teacher Subject (String) : " );
			subject=sct.next();
			Teacher t = new Teacher (tid,name,salary,address,department,subject);
			teacher[i]=t;
		}
		System.out.println("Teacher are : \n " );
		for(Teacher x : teacher) {
			x.display();
			System.out.println("\n " );
		}

	}

}