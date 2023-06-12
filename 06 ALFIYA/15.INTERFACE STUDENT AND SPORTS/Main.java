package alfiya;
import java.util.*;
import java.io.*;

interface Sports{
	public void sports_dispData();
	public void sports_getData();
}

class Student{
	String name;
	int roll_no;
	float mark1,mark2;
	
	Student(String n,int r,float m1,float m2){
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
void display() {
	System.out.println("Student Details");
	System.out.println("Name of Student" +name);
	System.out.println("Roll No of Student" +roll_no);
	System.out.println("Marks of Subject 1:" +mark1);
	System.out.println("Marks of subject 2:" +mark2);
}
	
}
class Result extends Student implements Sports{
	int r;
	String item;
	Scanner sc=new Scanner (System.in);
	
	Result(String n,int r,float m1,float m2) {
		super(n,r,m1,m2);
	}
	public void academic() {
		float total = (mark1 + mark2);
		System.out.println("__Academic Info__");
		
	}
	public void sports_getData() {
		System.out.println("Enter the sports item which student participated:");
		item=sc.nextLine();
		System.out.print("Enter the rank position that the obtained:");
		r=sc.nextInt();
	}
	public void sports_disData() {
		System.out.println("__sports Info__");
		System.out.println("Item:"+item);
		System.out.println("Rank:"+r);
	}
	@Override
	public void sports_dispData() {
		// TODO Auto-generated method stub
		
	}
}

	

public class Main {

	public static void main(String[] args)throws IOException {
		
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter the name:");
		String n=br.readLine();
		System.out.print("Enter roll no:");
		int roll=Integer.parseInt(br.readLine());
		System.out.print("Enter mark in first subject:");
		float m1=Float.parseFloat(br.readLine());
		System.out.print("Enter mark in second subject:");
		float m2=Float.parseFloat(br.readLine());
		Result re=new Result(n,roll,m1,m2);
		re.sports_getData();
		re.display();
		re.academic();
		re.sports_disData();
	}

		

	}


