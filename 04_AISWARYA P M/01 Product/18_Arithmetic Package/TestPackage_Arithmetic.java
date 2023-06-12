package ArithTest;
import Arithmetic.*;
import java.util.Scanner;


public class TestPackage_Arithmetic 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int a=sc.nextInt();
		System.out.println("Enter the number 2:");
		int b=sc.nextInt();
		Addition ad=new Addition(a,b);
		System.out.println("Addition of two numbers:"+ad.add());
		
		
		System.out.println("Enter the number 1:");
		int c=sc.nextInt();
		System.out.println("Enter the number 2:");
		int d=sc.nextInt();
		Subtraction sb=new Subtraction(c,d);
		System.out.println("subtraction of two numbers:"+sb.sub());
		
		
		System.out.println("Enter the number 1:");
		int e=sc.nextInt();
		System.out.println("Enter the number 2:");
		int f=sc.nextInt();
		Multiplication ml=new Multiplication(e,f);
		System.out.println("Multiplication of two numbers:"+ml.mul());
		
		
		System.out.println("Enter the number 1:");
		int g=sc.nextInt();
		System.out.println("Enter the number 2:");
		int h=sc.nextInt();
		Division dv=new Division(g,h);
		System.out.println("Division of two numbers:"+dv.div());
	}

}
