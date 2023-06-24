package packB;

public class Employee {
	int eno , esalary;
	String ename;
	public Employee(){}
	public Employee (int no,int sal, String name)
	{
		eno=no;
		esalary=sal;
		ename=name;
	}
	public void showdata()
	{
		System.out.print("EmpId = "+eno+" "+"Name = "+ename+" "+"Salary = "+esalary);
		System.out.println();
	}

}
