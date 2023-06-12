package program12;
import java.util.Scanner;

public class Employee extends person{
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


