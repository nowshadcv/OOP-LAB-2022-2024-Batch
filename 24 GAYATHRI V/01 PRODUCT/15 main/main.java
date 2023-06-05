package gayathri;
import java.util.*;
import java.io.*;
interface sports{
	
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
			System.out.println("student details");
			System.out.println("name of the student:"+name);
			System.out.println("roll no.of student:"+roll_no);
			System.out.println("marks of subject1"+mark1);
			System.out.println("mark of subject2:"+mark2);
			
		}
	}
	

class Result extends Student implements sports{
	int r;
	String item;
	Scanner sc=new Scanner(System.in);
	Result(String n,int r,float m1,float m2){
		super(n,r,m1,m2);
	}
public void academic () {
	float total=(mark1 +mark2);
	System.out.println("------------academic info--------");
}
public void sports_getData() {
	System.out.println("enter the sports item which student participated:");
	item=sc.nextLine();
	System.out.print("enter rank position that the obtained:");
		r=sc.nextInt();
}
public void sports_display() {
	System.out.println("---------sports info--------");
	
	System.out.println("item:"+item);
	System.out.println("rank:"+r);
}
@Override
public void sports_dispData() {
	// TODO Auto-generated method stub
	
}
}
public class main {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("enter the name");
		String n=br.readLine();
		System.out.print("enter rollno");
		int roll=Integer.parseInt(br.readLine());
		System.out.print("enter mark in first subject");
		float m1= Float.parseFloat(br.readLine());
		System.out.print("enter mark in second subject");
		float m2=Float.parseFloat(br.readLine());
		Result re =new Result(n,roll,m1,m2);
		re.sports_getData();
		re.sports_display();
		re.academic();
		re.sports_dispData();
		
	}

}
