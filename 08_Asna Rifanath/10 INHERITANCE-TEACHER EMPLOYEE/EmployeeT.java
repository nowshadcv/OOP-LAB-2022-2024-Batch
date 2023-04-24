package PackAsna;


public class EmployeeT {
	int empid;
	String name;
	float Salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid = empid;
		this.name = name;
		this.Salary = salary;
		this.address = address; }
	}

class Teacher extends EmployeeT{
	String department, subject;
	Teacher(int empid, String name, float salary, String address, String department, String subject){
		super(empid, name, salary, address);
		this.department= department;
		this.subject= subject;
	}
	public void display() {
		System.out.println("Teacher id: " + empid);
		System.out.println("Teacher name: " + name);
		System.out.println("Teacher salary: " + Salary);
		System.out.println("Teacher address: " + address);
		System.out.println("Teacher department: " + department);
		System.out.println("Teacher subject: " + subject);
	}
}