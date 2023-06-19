package packB;
import java.util.Scanner;

public class EmpArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter Number of Employees : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Employee Details one by one .. ");
		Employee employees []= new Employee [n];
		Scanner scemp = new Scanner(System.in);
		int eid , esal;
		String enam;
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" Employee Details..");
			System.out.println("Enter employee id (integer) : ");
			eid=scemp.nextInt();
			System.out.println("Enter employee name (String) : ");
			String nam=scemp.next();
			enam=new String(nam);
			System.out.println("Enter employee salary (integer) : ");
			esal=scemp.nextInt();
			Employee emp=new Employee (eid ,esal,enam);
			employees[i]=emp;
		}
		System.out.println("Employees are : \n ");
		for (Employee y : employees)
			y.showdata();
		System.out.println("Enter emploayee number to search : ");
		int semp=sc.nextInt();
		boolean found =false;
		for (Employee e :employees)
		{
			if(semp==e.eno)
			{
				found=true;
				System.out.println("Employee found . ");
				e.showdata();
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found..");
		}

	}

}
