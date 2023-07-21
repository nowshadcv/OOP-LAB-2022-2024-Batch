package Arith_test;

import java.util.Scanner;

import Arithmetic.*;


public class TestPackage_Arithmetic {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b= sc.nextInt();
		Addition add=new Addition(a,b);
		System.out.println("Addition"+add.add());
		System.out.println("Enter the first number:");
		int c = sc.nextInt();
		System.out.println("Enter the second number:");
		int d= sc.nextInt();
		Substraction sub=new Substraction( c, d);
		System.out.println("Subtraction"+sub.sub());
		System.out.println("Enter the first number:");
		int m = sc.nextInt();
		System.out.println("Enter the second number:");
		int n= sc.nextInt();
		Multiplication mul=new Multiplication(m,n);
		System.out.println("Multiplication"+mul.mul());
		System.out.println("Enter the first number:");
		int x = sc.nextInt();
		System.out.println("Enter the second number:");
		int y= sc.nextInt();
		Division div=new Division(x,y);
		System.out.println("Addition"+div.div());

	}



	}


