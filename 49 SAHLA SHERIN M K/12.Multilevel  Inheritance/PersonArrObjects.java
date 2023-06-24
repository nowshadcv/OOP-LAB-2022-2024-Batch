package program12;

import java.util.Scanner;
import program12.Teachers;

public class PersonArrObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one...");
		Teachers teacher []=new Teachers[n];
		Scanner scT=new Scanner(System.in);
		String name;String gender;String address;int age;String empid;String company_name;String qualification;float salary;String subject;String department;String teacherid;
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" teacher details...");
			System.out.println("enter teacher name(String):");
			name=scT.next();
			System.out.println("enter teacher gender(String):");
			gender=scT.next();
			
			System.out.println("enter teacher address(String):");
			address=scT.next();
			System.out.println("enter teacher age(integer):");
			age=scT.nextInt();
			System.out.println("enter empid(integer):");
			empid=scT.next();
			System.out.println("enter company name(String):");
			company_name=scT.next();
			System.out.println("enter qualification(String):");
			qualification=scT.next();
			System.out.println("enter teacher salary(float):");
			salary=scT.nextFloat();
			System.out.println("enter teacher subject(String):");
	        subject =scT.next();
			System.out.println("enter teacher department(String):");
			department=scT.next();
			System.out.println("enter teacherid(integer):");
			teacherid=scT.next();
			Teachers t=new Teachers(name,gender,address,age,empid,company_name,qualification,salary,subject,department,teacherid);		
			teacher [i] = t;} 
			System.out.println("Teachers are: \n"); 
			for (Teachers x : teacher ){ 
			x.display(); System.out.println("\n");}}}
	

