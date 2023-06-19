package program12;



class Person {
	String Name;
	String Gender;
	String Address;
	int Age;
	Person(){}
	Person(String Name,String Gender,String Address,int Age){
		this.Name=Name;
		this.Gender=Gender;
		this.Address=Address;
		this.Age=Age;
	}

}
class Employee extends Person{
	int Empid;
	String Company_name;
	String Qualification;
	float Salary;
	Employee(){}
	Employee(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,float Salary){
		super(Name,Gender,Address,Age);
		this.Empid=Empid;
		this.Company_name=Company_name;
		this.Qualification=Qualification;
		this.Salary=Salary;
	}
}
class Teacher extends Employee{
	int Teacherid;
	String Subject;
	String Department;
	Teacher(){}
	Teacher(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,float Salary,int Teacherid,String Subject,String Department){
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary);
		this.Teacherid=Teacherid;
		this.Subject=Subject;
		this.Department=Department;
	}
	public void display(){
		System.out.println("Teacher id : " + Teacherid);
		System.out.println("employee id : " + Empid);
		System.out.println("Teacher name : " + Name);
		System.out.println("Teacher Gender : " +Gender);
		System.out.println("Teacher age : " + Age);
		System.out.println("Teacher company name : " + Company_name);
		System.out.println("Teacher qualification : " + Qualification);
		System.out.println("Teacher salary : " + Salary);
		System.out.println("Teacher address : " + Address);
		System.out.println("Teacher department : " + Department);
		System.out.println("Teacher subject : " + Subject);
}
}


