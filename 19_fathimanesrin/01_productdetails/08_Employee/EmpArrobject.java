package packA;
import java.util.Scanner;
public class EmpArrobject {

	public static void main(String[] args) {
		System.out.println( "enter no.of employees:");
		Scanner sc = new Scanner (System . in);
		int n = sc.nextInt();
		System.out.println("enter employee details one by one..");
		employee employees[ ] = new employee [ n ];
		Scanner scemp=new Scanner(System.in);
				int eid , esal;
		String ename;
		for (int i=0;i<n;i++) {
			System.out.println("enter "+i+"employee details ");
			System.out.println("enter employee id (integer):");
			eid=scemp.nextInt();
			System.out.println("enter employee name (String):");
			String name=scemp.next();
			ename=new String (name);
			System.out.println("enter employee salary(integer):");
			esal=scemp.nextInt();
			employee emp = new employee(eid , esal , ename);
			employees [i]=emp;}
		System.out.println("employees are:\n");
		for(employee y : employees)
			y.showData();
		System.out.println("enter employee number to search:");
		int semp=sc.nextInt();
		boolean found = false;
		for (employee e : employees) {
			if (semp == e. eNo) {
				found = true ;
				System.out.println("employee found");
				e. showData();
				break;
			}}
		if (!found)
			System.out.println("employee not found");
		
			}
		
		

	}
