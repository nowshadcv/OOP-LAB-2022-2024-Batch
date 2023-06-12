package program12;
import java.util.Scanner;

public class Teacher extends Employee{
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



