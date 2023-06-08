package packA;
import java.util.Scanner;

public class TeacherArrObjects1 {

	public static void main(String[] args) {
		 System.out.println("Enter Number of Teachers : ");
	        Scanner sc = new Scanner (System.in);
	        int n=sc.nextInt();
	        System.out.println("Enter Teacher Details One by One .. ");
	        Teacher1 teacher[]=new Teacher1[n];
	        Scanner sct =new Scanner (System.in);
	        int tid,age,empid; String name,company_name,qualification,gender;float salary;String address;
	        String department ;
	        String subject;
	        for(int i=0;i<n;i++)
	        {
	            System.out.println("Enter details of Teacher  " +(i+1) );
	            System.out.println("Enter Teacher id (integer) : " );
	            tid=sct.nextInt();
	            System.out.println("Enter Employee id of Teacher "+(i+1)+" (integer) : " );
	            empid=sct.nextInt();
	            System.out.println("Enter Teacher name (String) : " );
	            name=sct.next();
	            System.out.println("Enter Teacher gender (String) : " );
	            gender=sct.next();
	            System.out.println("Enter Teacher address (String) : " );
	            address=sct.next();
	            System.out.println("Enter Teacher age (integer) : " );
	            age=sct.nextInt();
	            System.out.println("Enter Teacher company name (String) : " );
	            company_name=sct.next();
	            System.out.println("Enter Teacher department (String) : " );
	            department=sct.next();
	            System.out.println("Enter Teacher qualification (String) : " );
	            qualification=sct.next();
	            System.out.println("Enter Teacher Subject (String) : " );
	            subject=sct.next();
	            System.out.println("Enter Teacher salary (float) : " );
	            salary=sct.nextFloat();
	            Teacher1 t = new Teacher1(name,gender,address,age,empid,company_name,qualification,salary,subject,department,teacherid);
	            teacher[i]=t;}
	        System.out.println("Teacher are : \n " );
	        for(Teacher1 x : teacher) {
	            x.display();
	            System.out.println("\n " );}}}

	   
		
		


