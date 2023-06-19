package packA;

public class employee {
	int eNo,eSalary;
	String eName;
	public employee() {}
	public employee(int no ,int sal, String name) {
		eNo =no;
		eSalary=sal;
		eName=name;}
	public void showData() {
		System.out.println("EmpId="+eNo+""+"Name="+eName+""+"Salary="+eSalary);
		System.out.println();
	}
	}
