package PACKA;
import java.util.Scanner;
public class employeedetails {

	public static void main(String[] args) {
		System.out.println("Enter the number of employee:");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
				System.out.println("Enter your deyails one by one..");
		        employee employees []=new employee [n];
		        Scanner scemp = new Scanner (System.in);
		        int eid,esal;
		        String ename;
		        for (int i=0;i<n;i++) {
		        	System.out.println("enter"+1+"employee details..");
		        	System.out.println("enter employee id (integer):");
		        	eid=scemp.nextInt();
		        	
		            System.out.println("enter the employee name (String):");
		        	String name = scemp.next();
		        	ename = new String(name);
		        	System.out.println("enter the employee salary (integer):");
		            esal = scemp.nextInt();
		            employee emp = new employee (eid,esal,ename);
		            employees [i] =emp;
		        }
		            System.out.println("Employees are:\n");
		            for(employee y :employees)
		            	y.showdata();
		            System.out.println("enter the employee number to search:");
		            int semp=sc.nextInt();
		            boolean found = false;
		            for(employee e :employees) {
		            	if(semp == e.eNO) {
		            		found = true;
		            		System.out.println("employee found");
		            		e.showdata();
		            		break;
		            	}}
		            if(! found)
		            	System.out.println("Employee not found..");
		            
		            	}
		            }
				

	


