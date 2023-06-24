package packB;
import java.util.Scanner;

class Person {
	String name , gender , address ;
	int age;
	Person(){
	}
	Person (String name, String gender , String address , int age ){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employee extends Person{
	int empid;
	String company_name;
	float salary;
	String qualification;
	Employee(String name, String gender , String address , int age,int empid,String company_name,String qualification,float salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}
}
class Teacher extends Employee{
	String department ,subject;
	int teacher_id;
	Teacher(String name, String gender , String address , int age,int empid,String company_name,String qualification,float salary,String subject,String department,int teacher_id){
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.department=department;
		this.subject=subject;
	}
	public void display() {
		System.out.println("Teacher teacher_id : " +teacher_id);
		System.out.println("Teacher id : " +empid);
		System.out.println("Teacher name : " +name);
		System.out.println("Teacher gender : " +gender);
		System.out.println("Teacher address : " +address);
		System.out.println("Teacher age : " +age);
		System.out.println("Teacher company_name : " +company_name);
		System.out.println("Teacher department : " +department);
		System.out.println("Teacher qualification : " +qualification);
		System.out.println("Teacher subject : " +subject);
		System.out.println("Teacher salary : " +salary);
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
		int tid,age,empid; String name,company_name,qualification,gender;float salary;String address;
		String department ;
		String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of Teacher  " +(i+1) );
			System.out.println("Enter Teacher id (integer) : " );
			tid=sct.nextInt();
			System.out.println("Enter Employee id of Teacher "+(i+1)+" (integer) : " );
			empid=sct.nextInt();
			System.out.println("Enter Teacher name (String) : " );
			name=sct.next();
			System.out.println("Enter Teacher gender (String) : " );
			gender=sct.next();
			System.out.println("Enter Teacher address (String) : " );
			address=sct.next();
			System.out.println("Enter Teacher age (integer) : " );
			age=sct.nextInt();
			System.out.println("Enter Teacher company name (String) : " );
			company_name=sct.next();
			System.out.println("Enter Teacher department (String) : " );
			department=sct.next();
			System.out.println("Enter Teacher qualification (String) : " );
			qualification=sct.next();
			System.out.println("Enter Teacher Subject (String) : " );
			subject=sct.next();
			System.out.println("Enter Teacher salary (float) : " );
			salary=sct.nextFloat();
			Teacher t = new Teacher(name,gender ,address ,age,empid,company_name,qualification,salary,subject,department,tid);
			teacher[i]=t;
		}
		System.out.println("Teacher are : \n " );
		for(Teacher x : teacher) {
			x.display();
			System.out.println("\n " );

	}

}
}
