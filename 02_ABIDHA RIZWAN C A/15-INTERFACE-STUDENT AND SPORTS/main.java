package packA;
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
	
	Student(String n,int r,float m1,float m2){
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
		
	}
	
	void display() {
		System.out.println("_____ student details___");
		System.out.println("name of student :"+name);
		System.out.println("roll no. of student :"+roll_no);
		System.out.println("mark of subject1 :"+mark1);
		System.out.println("mark of subject2 :"+mark2);
		
	}	
	}
    class Result extends Student implements Sports{
    	int r;
    	String item;
    	Scanner sc=new Scanner(System.in);
    	Result(String n,int r,float m1,float m2){
    		super(n,r,m1,m2);
    	}
    	public void academic() {
    		float total=(mark1+mark2);
    		System.out.println("___academic info___");
    		
    	}

 public void sports_getData() {
	 System.out.println("enter the sports item which student participated");
	 item = sc.nextLine();
	 System.out.println("enter the rank position obtained");
	 r=sc.nextInt();
 }



 public void sports_dispData() {
	System.out.println("_____ sports info___");
	System.out.println("item:"+item);
	System.out.println("rank:"+r);
}
}
    public class main {

    	public static void main(String[] args) throws IOException {
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br= new BufferedReader(isr);
    		System.out.print("enter the name");
    		String n = br.readLine();
    		System.out.print("enetr roll no:");
    		int roll=Integer.parseInt(br.readLine());
    		System.out.print("enter mark in first subject:");
    		float m1=Float.parseFloat(br.readLine());
    		System.out.print("enter mark in second subject:");
    		float m2=Float.parseFloat(br.readLine());
    		Result re=new Result(n,roll,m1,m2);
    		re.sports_getData();
    		re.display();
    		re.academic();
    		re.sports_dispData();
    	}

    }




