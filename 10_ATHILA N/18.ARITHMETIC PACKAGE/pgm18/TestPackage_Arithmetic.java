package pgm18;

import java.util.Scanner;
import operations.*;
public class TestPackage_Arithmetic {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1=sc.nextInt();
		System.out.println("Enter number 2:");
		int n2=sc.nextInt();
		Add ad = new Add(n1,n2);
		System.out.println("Addition : " + ad.sum());
		Subtraction sub = new Subtraction(n1,n2);
		System.out.println("Subtraction : " + sub.sub());
		Multiplication mul = new Multiplication(n1,n2);
		System.out.println("Multiplication : " + mul.mul());
		Division div = new Division(n1,n2);
		System.out.println("Division : " + div.div());
		
		
		
		
		
	}		


	}

