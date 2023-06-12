package fidha;

public class Person {
	String name;
	String gender;
	String address;
	int age;
	Person(){}
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employee extends Person{
	int empid,salary;
	String companyname,qualification;
	Employee(){}
	Employee(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification){
		super(name,gender,address,age);
		this.empid=empid;
		this.salary=salary;
		this.companyname=companyname;
		this.qualification=qualification;
	}
}
class TeacherT extends Employee{
	int teacherid;
	String department,subject;
	TeacherT(){}
	TeacherT(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification,int teacherid,String department,String subject){
		super(name,gender,address,age,empid,salary,companyname,qualification);
		this.teacherid=teacherid;
		this.department=department;
		this.subject=subject;
		
	}
	
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher companyname:"+companyname);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher id:"+teacherid);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher department:"+department);
		System.out.println("Teacher subject:"+subject);
	}
}



