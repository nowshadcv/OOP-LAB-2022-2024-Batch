package packA;

import java.util.Scanner;

public class empArrObjects {

	public static void main(String[] args) {
		System.out.println("enter no.of employees : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter employee details one by one");
		Employee employees[]=new Employee[n];
		Scanner scemp=new Scanner(System.in);
		int eid,esal;
		String ename;
		for(int i=0;i<n;i++) {
			System.out.println("enter " +i + "employee details ");
			System.out.println("enter employee id(integer): ");
			eid= scemp.nextInt();
			System.out.println("enter employee name(String): ");
			String nam= scemp.next();
			ename = new String(nam);
			System.out.println("enter employee salary(integer): ");
			esal = scemp.nextInt();
			Employee emp = new Employee(eid,esal,ename);
			employees[i]=emp;		}
		System.out.println("Employees are : \n");
		for(Employee y : employees)y.showData();
		System.out.println("enter employee number to search: ");
		int semp = sc.nextInt();
		boolean found = false;
		for(Employee e : employees) {
			if(semp == e.eNo) {
				found=true;
				System.out.println("Employee found  ");
				e.showData();
				break;
				
			}
		}
		if(! found)
			System.out.println("Employee not found ");
		

	}

}
