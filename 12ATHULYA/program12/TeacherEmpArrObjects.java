package program12;

import java.util.Scanner;


public class TeacherEmpArrObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter the number of Teachers : ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(" Enter Teacher details one by one ..");
		Teacher teacher [] = new Teacher [n];
		Scanner scT = new Scanner(System.in);
		String Name;
		String Gender;
		String Address;
		int Age;
		int Empid;
		String Company_name;
		String Qualification;
		float Salary;
		int Teacherid;
		String Subject;
		String Department;
		for( int i=0;i<n;i++)
		{
			System.out.println(" Enter " + i + "teacher dtails ....");
			System.out.println("Teacher id : ");
			Teacherid=scT.nextInt();
			System.out.println("employee id : ");
			Empid=scT.nextInt();
			System.out.println("Teacher name : ");
			Name=scT.next();
			System.out.println("Teacher Gender : ");
			Gender=scT.next();
			System.out.println("Teacher age : ");
			Age=scT.nextInt();
			System.out.println("Teacher company name : ");
			Company_name=scT.next();
			System.out.println("Teacher qualification : ");
			Qualification=scT.next();
			System.out.println("Teacher salary : ");
			Salary=scT.nextFloat();
			System.out.println("Teacher address : ");
			Address=scT.next();
			System.out.println("Teacher department : ");
			Department=scT.next();
			System.out.println("Teacher subject : ");
			Subject=scT.next();
			Teacher t = new Teacher(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary,Teacherid,Subject,Department);
			teacher [i] =t;
	}
		System.out.println("Teachers are : \n ");
		for(Teacher x : teacher){
			x.display();
			System.out.println("\n");
		}



	}

}
