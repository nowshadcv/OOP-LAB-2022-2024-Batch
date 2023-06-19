package progrm12;

import java.util.Scanner;

public class TeacherEmpArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter number of Teachers:");
		Scanner sc=new Scanner (System.in);
		int  n=sc.nextInt();
		System.out.println("Enter Teacher details one by one...");
		Teacher teacher []=new Teacher[n];
		Scanner scT=new Scanner (System.in);
		int tid; 
		String name;
		String gender;
		String address;
		int age;
		int empid;
		String company_name;
		String qualification;
		float salary;
		String subject;
		String department;
		int teacherid;
		for(int i=0;i<n;i++){
			System.out.println("Enter"+(i+1)+"Teacher details...");
			System.out.println("Enter teacher id(integer):");
			teacherid=scT.nextInt();
			System.out.println("Enter employee id of Teacher"+(i+1)+"(integer):");
			empid=scT.nextInt();
			System.out.println("Enter teacher name(String):");
			name=scT.next();
			System.out.println("Enter teacher gender(string):");
			gender=scT.next();
			System.out.println("Enter teacher age(integer):");
			age=scT.nextInt();
			System.out.println("Enter teacher company name(string):");
			company_name=scT.next();
			System.out.println("Enter teacher qualification(String):");
			qualification=scT.next();
			System.out.println("Enter teacher salary(float):");
			salary=scT.nextFloat();
			System.out.println("Enter teacher address(String):");
			address=scT.next();
			System.out.println("Enter teacher department(String):");
			department=scT.next();
			System.out.println("Enter teacher subject(String):");
			subject=scT.next();
			Teacher t= new Teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,teacherid);
			teacher [i]=t;}
		System.out.println("Teachers are:\n");
		for(Teacher x:teacher){
			x.display();System.out.println("\n");
		
		

	}

}
}