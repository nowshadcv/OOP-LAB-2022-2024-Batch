package packB;

import java.util.Scanner;

public class TeacherArrObjects {

	public static void main(String[] args) {
		System.out.println(" enter no.of Teacher :" );
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter Teacher details one by one:" );
		Teacher teacher[]=new Teacher[n];
		Scanner scT=new Scanner(System.in);
		int tid;
		String name;
		float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ i +" Teacher details " );
			System.out.println("Enter Teacher id(integer):" );
			tid = scT.nextInt();
			System.out.println("Enter Teacher name(String):" );
			name=scT.next();
			System.out.println("Enter Teacher salary(float):" );
			salary=scT.nextFloat();
			System.out.println("Enter Teacher address(String):" );
			address=scT.next();
			System.out.println("Enter Teacher department(String):" );
			department=scT.next();
			System.out.println("Enter Teacher subject(String):" );
			subject=scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;
			
		}
		System.out.println("Teachers are  : \n ");
		for(Teacher x : teacher) {
			x.display();
			System.out.println("\n");
		}
		
		

	}

}
