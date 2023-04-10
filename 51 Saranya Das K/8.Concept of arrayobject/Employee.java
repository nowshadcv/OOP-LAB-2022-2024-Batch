package packB;

public class Employee {

	int eno,esalary;
	String ename;
	public Employee()
	{
		
	}
	public Employee(int no,int salary,String name)
	{
		eno=no;
		esalary=salary;
		ename=name;
		
	}
	public void showData()
	{
		System.out.println("Employee id="+eno+" "+"Name:"+ename+" "+"Salary:"+esalary);
		System.out.println();
		
	}
}
