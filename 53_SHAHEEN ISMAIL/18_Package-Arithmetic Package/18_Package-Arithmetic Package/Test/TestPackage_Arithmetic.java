package Test;
import java.util.Scanner;

import Arithmetic.*;
import figures.Square;

public class TestPackage_Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		Addition add = new Addition(n1,n2);
		System.out.println("Sum: "+add.addition());
		
		Subtraction sub = new Subtraction(n1,n2);
		System.out.println("Difference: "+sub.subtraction());
		
		Multiplication mul = new Multiplication(n1,n2);
		System.out.println("Product: "+mul.multiplication());
		
		Division div = new Division(n1,n2);
		System.out.println("Result: "+div.division());
		
		
		
		

	}

}
