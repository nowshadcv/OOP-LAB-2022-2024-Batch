package fidha;

import java.util.Scanner;

public class TeacherArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter no of teachers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teacher deatils onr by one..");
		TeacherT teacher[]=new TeacherT[n];
		Scanner scT=new Scanner(System.in);
		int empid;int age;String gender;String name;int salary;String address;String companyname;String qualification;
		int teacherid;String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" teacher details...");
			System.out.println("Enter employee id(integer):");
			
			empid=scT.nextInt();
			System.out.println("Enter teacher name(String):");
			name=scT.next();
			System.out.println("Enter teacher age:");
			age=scT.nextInt();
			System.out.println("Enter teacher gender(String):");
			gender=scT.next();
			System.out.println("enter teacher salary(int):");
			salary=scT.nextInt();
			System.out.println("enter teacher address(string):");
			address=scT.next();
			System.out.println("Enter teacher company name(String):");
			companyname=scT.next();
			System.out.println("Enter teacher qualification(String):");
			qualification=scT.next();
			System.out.println("Enter teacher id:");
			teacherid=scT.nextInt();
			System.out.println("enter teacher department(string):");
			department=scT.next();
			System.out.println("enter teacher subject(string):");
			subject=scT.next();
			TeacherT t=new TeacherT(name,gender,address,age,empid,salary,companyname,qualification,teacherid,department,subject);
			teacher[i]=t;

	}
System.out.println("Teachers are:\n");
for(TeacherT x:teacher) {
	x.display();System.out.println("\n");
}
}

		// TODO Auto-generated method stub

	}

