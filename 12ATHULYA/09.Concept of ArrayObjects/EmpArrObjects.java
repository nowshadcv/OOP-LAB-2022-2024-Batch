package program8;

import java.util.Scanner;

public class EmpArrObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of employees : ");
		Scanner sc =new Scanner (System.in);
		int n= sc.nextInt();
		System.out.println("Enter the Employee details one by one....");
		Employee employees [ ]= new Employee [n];
		Scanner scemp=new Scanner(System.in);
		int eid,esalary;
		String ename;
		for(int i =0;i<n;i++){
			System.out.println("Enter "+i +"employee details......");
			System.out.println("Enter employee id ( Integer ) :");
			eid=scemp.nextInt();
			System.out.println("Enter the employee name ( string ) :");
			String name=scemp.next();
			ename=new String (name);
			System.out.println("Enter the employee salary ( integer ) :");
			esalary=scemp.nextInt();
			Employee emp =new Employee (eid,esalary,ename);
			employees [i] =emp;
		}
		System.out.println("Employees are : \n ");
		for( Employee y : employees)
			y.showData();
		System.out.println("Enter the employee number  to search ");
		int semp=sc.nextInt();
		boolean found=false;
		for (Employee e : employees){
			if(semp == e.eNo){
				found=true;
				System.out.println("Employee  found....");
				e.showData();
				break;
			}
		}
		if(!found)
			System.out.println("Employee not found");
				}

}
