package ArithTest;
import Arithmetic.*;

import java.util.Scanner;

public class TestPackage_Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the num1 to Add:");
		 int n1=sc.nextInt();
		 System.out.println("Enter the num2 to Add:");
		 int n2=sc.nextInt();
		 Addition ad=new Addition(n1,n2);
		 System.out.println("Addition:" +ad.add());
		 
		 
		 System.out.println("Enter the num1 to subtract:");
		 int a=sc.nextInt();
		 System.out.println("Enter the num2 to subtract:");
		 int b=sc.nextInt();
		 Subtraction su=new Subtraction(a,b);
		 System.out.println("Subtraction:" +su.sub());
		 
		 
		 System.out.println("Enter the num1 to multiply:");
		 int c=sc.nextInt();
		 System.out.println("Enter the num2 to multiply:");
		 int d=sc.nextInt();
		 Multiplication mu=new Multiplication(c,d);
		 System.out.println("Multiplication:" +mu.mul());
		 
		 
		 System.out.println("Enter the num1 to Division:");
		 int e=sc.nextInt();
		 System.out.println("Enter the num2 to Division:");
		 int f=sc.nextInt();
		 Division di=new Division(e,f);
		 System.out.println("Division:" +di.div());
		

	}

}
