package ArithTest;
import java.util.Scanner;

import Arithmetic.*;
import Figures.Square;
public class TestPackage_Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the num1");
	    int a = sc.nextInt();
	    System.out.println("Enter the num2");
	    int b = sc.nextInt();
	    Addition ad=new Addition(a,b);
	    System.out.println("Sum of two numbers:"+ad.add());
	    
	   
	    System.out.println("Enter the num1");
	    int c = sc.nextInt();
	    System.out.println("Enter the num2");
	    int d = sc.nextInt();
	    Subtraction sb=new Subtraction(c,d);
	    System.out.println("sub of two numbers:"+sb.sub());
	    
	    System.out.println("Enter the num1");
	    int e = sc.nextInt();
	    System.out.println("Enter the num2");
	    int f = sc.nextInt();
	   Multiplication mu=new Multiplication(e,f);
	    System.out.println("mul of two numbers:"+mu.mul());
	    
	    System.out.println("Enter the num1");
	    int g = sc.nextInt();
	    System.out.println("Enter the num2");
	    int h = sc.nextInt();
	    Division dv=new Division(g,h);
	    System.out.println("div of two numbers:"+dv.div());
	    
	}

}