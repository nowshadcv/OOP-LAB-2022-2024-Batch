package Test;
import java.util.Scanner;
import Arithmetic.*;
public class TestPackage_Arithmetic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1=sc.nextInt();
		System.out.println("Enter number 2:");
		int n2=sc.nextInt();
		Addition ad = new Addition(n1,n2);
		System.out.println("Addition : " + ad.addition());
		Subtraction sub = new Subtraction(n1,n2);
		System.out.println("Subtraction : " + sub.subtraction());
		Multiplication mul = new Multiplication(n1,n2);
		System.out.println("Multiplication : " + mul.multiplication());
		Division div = new Division(n1,n2);
		System.out.println("Division : " + div.division());
		
		
		
		
		
	}		
}
