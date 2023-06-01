package program12;

class Person {
	String name;
	String gender;
	String address;
	int age;
	Person(){}
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age; }}
class EmployeeE extends Person{
	int empid;
	String company_name;
	String qualification;
	float salary;
	EmployeeE(){}
		EmployeeE(String name,String gender,String address,int age,int empid,String company_name,String qualification,float salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary; 
	}}
class Teacher extends EmployeeE{
	String subject;
	String department;
	int teacherid;
	Teacher(){}
	Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary,String subject,String department,int teacherid) {
		super(name,gender,address,age,empid,company_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacherid=teacherid;
	}
public void display() {
	System.out.println("Teacher name:" +name);
	System.out.println("Teacher gender:" +gender);
	System.out.println("Teacher address:" +address);
	System.out.println("Teacher age:" +age);
	System.out.println("Teacher empid:" +empid);
	System.out.println("company_name:" +company_name);
	System.out.println("Teacher qualification:" +qualification);
	System.out.println("Teacher salary:" +salary);
	System.out.println("Teacher subject:" +subject);
    System.out.println("Teacher department: " +department);
    System.out.println("Teacherid: " +teacherid); 
}
}



