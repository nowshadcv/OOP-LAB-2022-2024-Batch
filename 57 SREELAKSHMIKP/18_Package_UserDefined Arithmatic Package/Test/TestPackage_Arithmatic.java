package Test;
import Arithmatic.*;
import java.util.Scanner;
public class TestPackage_Arithmatic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		Addition ad=new Addition(n1,n2);
		System.out.println("sum:"+ad.addition());
		
		Subtraction sb=new Subtraction(n1,n2);
		System.out.println("difference:"+sb.Subtraction());
		
		Multiplication mul=new Multiplication(n1,n2);
		System.out.println("product:"+mul.multiplication());
		
		Division div=new Division(n1,n2);
		System.out.println("quotient:"+div.division());
		}}

