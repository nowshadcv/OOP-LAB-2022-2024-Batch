package pgm15;


import java.util.*;
import java.io.*;

interface Sports{
	public void sports_getData();
	public void sports_dispData();
}
class Student{
	String name;
	int roll_no;
	float mark1,mark2;
	Student(String n, int r,float m1,float m2){
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
		
	}
	void display() {
		System.out.println("_____Student Details_____");
		System.out.println("Name of Student: "+name);
		System.out.println("Roll No.of Student 1:"+roll_no);
		System.out.println("Marks of Subject 1:"+mark1);
		System.out.println("Marks of Subject 2:"+mark2);
	}
}
class Result extends Student implements Sports{
	int r;
	String item;
	Scanner sc=new Scanner(System.in);
	Result(String n, int r,float m1, float m2){
		super(n,r,m1,m2);
	}
	public void academic() {
		float total=(mark1+mark2);
		System.out.println("_____Academic Info_____");
		System.out.println("Total Mark : "+total);
	}
	public void sports_getData() {
		System.out.print("Enter the Sports item which student participated: ");
		item=sc.nextLine();
		System.out.println("Enter the rank position that the obtained: ");
		r=sc.nextInt();
		
	}
	public void sports_dispData() {
		System.out.println("_____sports info_____");
		System.out.println("item: "+item);
		System.out.println("Rank: "+r);
	}
}
class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.print("Enter the name :");
		String n =br.readLine();
		System.out.print("Enter Roll No : ");
		int roll=Integer.parseInt(br.readLine());
		System.out.print("Enter mark in first subject :");
		float m1=Float.parseFloat(br.readLine());
		System.out.print("Enter mark in second Subject :");
		float m2=Float.parseFloat(br.readLine());
		Result re=new Result(n,roll,m1,m2);
		re.sports_getData();
		re.display();
		re.academic();
		re.sports_dispData();
	}

}
