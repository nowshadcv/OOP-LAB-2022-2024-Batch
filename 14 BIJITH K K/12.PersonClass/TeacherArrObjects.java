package PersonClass;
import java.util.Scanner;
public class TeacherArrObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of Teachers : ");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Enter Teacher Details One by One .. ");
        Teacher teacher[]=new Teacher[n];
        Scanner sct =new Scanner (System.in);
        int age; String name,company_name,qualification,gender;float salary;String address,teacherid,empid;
        String department ;
        String subject;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details of Teacher  " +(i+1) );
            System.out.println("Enter Teacher id (integer) : " );
            teacherid=sct.next();
            System.out.println("Enter Employee id of Teacher "+(i+1)+" (integer) : " );
            empid=sct.next();
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
            Teacher t = new Teacher(name,gender ,address ,age,empid,company_name,qualification,salary,subject,department,teacherid);
            teacher[i]=t;
        }
        System.out.println("Teacher are : \n " );
        for(Teacher x : teacher) {
            x.display();
            System.out.println("\n " );

    }
	}

}
