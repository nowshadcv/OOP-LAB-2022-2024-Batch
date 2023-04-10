package packB;
import java.util.Scanner;

public class EmpArrobjects {

	public static void main(String[] args) {
		System.out.println("enter the number of employees:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the employee one by one...");
		Employee employees [] = new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String enam;
		for( int i=0;i<n;i++)
		{
			System.out.println("enter"+i +"employee details...");
			System.out.println("Enter the employee id:");
			eid=scemp.nextInt();
			System.out.println("enter the employee name:");
			 String nam=scemp.next();
			 enam=new String(nam);
			System.out.println("Enter the employee salary:");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;
		}
		System.out.println("Employees are:\n");
		for(Employee y : employees)
			y.showData();
		System.out.println("Enter the employee no to search:");
		int semp =sc.nextInt();
		boolean found = false;
		for ( Employee e : employees)
		{
			if ( semp == e.eno) {
				found=true;
			System.out.println("Employees found");
			e.showData();
			break;
		}

	}
	if(!found)
		System.out.println("Employee not found...");

}}
