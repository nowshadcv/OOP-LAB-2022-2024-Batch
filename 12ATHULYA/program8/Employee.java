package program8;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee (){}
	public Employee (int no, int salary , String name){
		eNo = no;
		eSalary = salary;
		eName = name;}
		public void showData()
		{
			System.out.println("EmpID= "+eNo +"   " + "Name= "+ eName + "   "+"Salary ="+eSalary);
			System.out.println();
		}}

