package MainPackage;
import ArithamaticPackage.*;
import java.util.Scanner;

public class Mathfunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first number:");
		int a=sc.nextInt();
		System.out.println("Enter the  second number:");
		int b= sc.nextInt();
		Add A=new Add(a,b);
		Sub B=new Sub(a,b);
		Div D=new Div(a,b);
		Mul M=new Mul(a,b);
		System.out.println("____________Arithamatic Operations____________");
		System.out.println("Sum of "+a+" and "+b+" : "+A.sum());
		System.out.println("Difference of "+a+" and " +b+" : "+B.sub());
		System.out.println("Product of "+a+" and "+b+" : "+M.mul());
		System.out.println("division of "+a+" and "+b+" : "+D.div());
		
		
		
		

	}

}
