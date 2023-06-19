package packB;
import java.util.Scanner;
class person
{
	String name;
	String address;
	String gender;
	int age;
	person(){
		
	}
	public person(String name,String address,String gender,int age)
	{
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.age=age;
	}
	
}
class Employee extends person{
	int empid;
	String companyname;
	String qualification;
	float salary;
	Employee()
	{
		
	}
	public Employee(String name,String address, String gender,int age,int empid,String companyname,String qualification,float salary)
	{
		super(name,address,gender,age);
		this.empid=empid;
		this.companyname=companyname;
		this.qualification=qualification;
		this.salary=salary;
		
	}
	
}
class Teacher extends Employee{
	String subject;
	String Department;
	int teacherid;
	Teacher()
	{
		
	}
	public Teacher(String name,String address, String gender,int age,int empid,String companyname,String qualification,float salary,String subject,String Department,int teacherid)
	{
		super(name,address,gender,age,empid,companyname,qualification,salary);
		this.subject=subject;
		this.Department=Department;
		this.teacherid=teacherid;
	}
	public void display()
	{
		System.out.println("teacher id:"+empid);
		System.out.println("teacher name:"+name);
		System.out.println("teacher gender"+gender);
		System.out.println("teacher address"+address);
		System.out.println("teacher age"+age);
		System.out.println("teacher teacherid"+teacherid);
		System.out.println("teacher Companyname:"+companyname);
		System.out.println("teacher Department:"+Department);
		System.out.println("teacher subject:"+subject);
		System.out.println("teacher qualification:"+qualification);
		System.out.println("teacher salary:"+salary);
	}
}


public class Teacherm {

	public static void main(String[] args) {
	System.out.println("Enter the no of teachers:");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	Teacher teacher[]=new Teacher[n];
	int empid;
	String name;
	String gender;
	String address;
	int age;
	int teacherid;
	String companyname;
	String Department;
	String subject;
	String qualification;
	float salary;
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter"+i+" "+" teacher details");
		System.out.println("Enter teacher's employeeid:");
		empid=sc.nextInt();
		System.out.println("Enter teacher's name:");
		name=sc.next();
		System.out.println("Enter teacher's gender:");
		gender=sc.next();
		System.out.println("Enter teacher's address:");
		address=sc.next();
		System.out.println("Enter teacher's age:");
		age=sc.nextInt();
		System.out.println("Enter teacher's teacherid:");
		teacherid=sc.nextInt();
		System.out.println("Teacher's companyname:");
		companyname=sc.next();
		System.out.println("Teacher's qualification:");
		qualification=sc.next();
		System.out.println("Enter teacher's Department:");
		Department=sc.next();
		System.out.println("enter teacher's subject:");
		subject=sc.next();
		System.out.println("Enter teacher's salary:");
		salary=sc.nextFloat();
		Teacher t=new Teacher(name,address,gender,age,empid,companyname,qualification,salary,subject,Department,teacherid);
		teacher[i]=t;
	}
	System.out.println("teachers are:");
	for(Teacher x:teacher) {
		x.display();
		System.out.println("\n");;
	}
	
	}

}
