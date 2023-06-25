package Test;
import java.util.Scanner;

import Arithematic.*;
public class TestingPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("------1.ADDITION------");
		System.out.println("Enter number 1:");
		int n1=sc.nextInt();
		System.out.println("Enter number 2:");
		int n2=sc.nextInt();
		Addition ad=new Addition(n1,n2);
		System.out.println("Result:"+ad.sum());
		
		
		
		System.out.println("------2.SUBTRACTION------");
		System.out.println("Enter number 1:");
		int A=sc.nextInt();
		System.out.println("Enter number 2:");
		int B=sc.nextInt();
		Subtraction sb=new Subtraction(A,B);
		System.out.println("Result:"+sb.sub());
		
		System.out.println("------3.MULTIPLICATION------");
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();
		Multiplication ml=new Multiplication(a,b);
		System.out.println("Result:"+ml.mul());
		
		System.out.println("------4.DIVISION------");
		System.out.println("Enter number 1:");
		int x=sc.nextInt();
		System.out.println("Enter number 2:");
		int y=sc.nextInt();
		Division dv=new Division(x,y);
		System.out.println("Result:"+dv.div());
		
		
		

	}

}
