package PACKA;

public class employee {
	int eNO , eSalary ;
	String eName;
	public employee() {}
	public employee (int no,int sal,String name) {
		eNO = no;
		eSalary = sal;
		eName = name;
	}
	public void showdata() {
		System.out.print("Empid = "+eNO +""+"Name = "+ eName +""+"salary="+eSalary);
		System.out.println();}

	}
	

