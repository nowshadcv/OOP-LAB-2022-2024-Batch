package Optest;


import java.util.Scanner;

import operatons.Add;
import operatons.Minus;
import operatons.Product;
import operatons.Quotient;

public class TestPckage_Operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to add:");
		int no=sc.nextInt();
		int nt=sc.nextInt();
		Add ad=new Add(no,nt);
		System.out.println("Sum:"+ad.add());
		System.out.println("Enter two numbers to substract:");
		int sno=sc.nextInt();
		int snt=sc.nextInt();
		Minus mn=new Minus(sno,snt);
		System.out.println("Difference:"+mn.substraction());
		System.out.println("Enter two numbers to multiply:");
		int mno=sc.nextInt();
		int mnt=sc.nextInt();
		Product pd=new Product(mno,mnt);
		System.out.println("Product:"+pd.multiplication());
		System.out.println("Enter two numbers to divide:");
		int dno=sc.nextInt();
		int dnt=sc.nextInt();
		Quotient qt=new Quotient(dno,dnt);
		System.out.println("Quotient:"+qt.division());
	}

}
