package packA;

public class Employee {
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo=no;
		eSalary=sal;
		eName=name;
	}
	public void showData() {
		System.out.println("EmpId="+ eNo +""+" Name=" + eName +""+ "salary=" +eSalary);
		System.out.println();
	}
	

}
