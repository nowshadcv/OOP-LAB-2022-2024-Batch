package PackA;

class Teacher extends EmployeeT {
	String department,subject;
	Teacher(int empid, String name, float salary, String address,String department, String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display() {
		System.out.println("teaher id: " +empid);
		System.out.println("teaher name: " +name);
		System.out.println("teaher salary: " +salary);
		System.out.println("teaher address: " +address);
		System.out.println("teaher department: " +department);
		System.out.println("teaher subject: " +subject);
	}
}
