package packSurumy;
import java.util.Scanner;
class Person{
	String pname;
	String pgender;
	String paddress;
	int page;
	Person(){}
		Person(String pname,String pgender,String paddress,int page){
			this.pname=pname;
			this.pgender=pgender;
			this.paddress=paddress;
			this.page=page;
			
		}
		
	}
	
class EmployeeE extends Person{
	int empid;
	String companyname;
	String qualification;
	float salary;
	EmployeeE(){}

	EmployeeE(String pname,String pgender,String paddress,int page,int empid,String companyname,String qualifiation,float salary){
		super(pname,pgender,paddress,page);
		this.empid=empid;
		this.companyname=companyname;
		
		this.qualification=qualification;
		this.salary=salary;}
	
		
		
	}
	
class TeacherT extends EmployeeE{
	String subject;
	String department;
	int teacherid;
	TeacherT(){}
	TeacherT(String pname,String pgender,String paddress,int page,int empid,String companyname,String qualifiation,float salary,String subject,String department,int teacherid){
		super(pname,pgender,paddress,page,empid,companyname,qualifiation,salary);
		this.subject=subject;
		this.department=department;
		this.teacherid=teacherid;}
	public void display() {
		System.out.println("Name is:"+pname);
		System.out.println("Gender is:"+pgender);
		System.out.println("Addrress is:"+paddress);
		System.out.println("Age is"+page);
		System.out.println("Id is:"+empid);
		System.out.println("Company is"+companyname);
		System.out.println("Qualification is"+qualification);
		System.out.println("Salary is"+salary);
		System.out.println("Subject is"+subject);
		System.out.println("Department is"+department);
		System.out.println("Teacher id is"+teacherid);
	}
public class PersonArrayObject {
	public static void main(String[] args) {
		System.out.println("Enter the number of teacher");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter the  details on by one..");
		TeacherT teacher[]=new TeacherT[n];
		Scanner scT= new Scanner (System.in);
		String name,gender,address,company,quali,sub,dept;
		int age,id,teaid;
		float salary;
		int i;
		for(i=0;i<n;i++){
			System.out.println("Enter"+i+" details..");
			System.out.println("Enter  name:");
			name=scT.next();
			System.out.println("Enter  gender:");
			gender=scT.next();
			System.out.println("Enter  addresss:");
			address=scT.next();
			System.out.println("Enter  company name):");
			company=scT.next();
			System.out.println("Enter  qualification):");
			quali=scT.next();
			System.out.println("Enter  subject:");
			sub=scT.next();
			System.out.println("Enter department:");
			dept=scT.next();
			System.out.println("Enter age :");
			age=scT.nextInt();
			System.out.println("Enter emplopyee id of teacher :");
			id=scT.nextInt();
			System.out.println("Enter teacherid :");
			teaid=scT.nextInt();
			System.out.println("Enter teacher salary:");
			salary=scT.nextFloat();
			TeacherT t =new TeacherT (name,gender,address,age,id,company,quali,salary,sub,dept,teaid);
			teacher[i]=t;}
		System.out.println("details:\n");
		for(TeacherT x:teacher) {
			x.display();
			System.out.println("\n");
		}
	}
}

}





