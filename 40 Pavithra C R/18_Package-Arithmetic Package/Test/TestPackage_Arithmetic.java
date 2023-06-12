package Test;
import Arithmetic.*;
import java.util.Scanner;
public class TestPackage_Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int n2 = sc.nextInt();
		Addition add = new Addition(n1,n2);
		System.out.println("Sum is"+add.addition());
		
		Subtraction sub = new Subtraction(n1,n2);
		System.out.println("Difference is"+sub.subtraction());
		
		Multiplication mul = new Multiplication(n1,n2);
		System.out.println("Product is"+mul.multiplication());
		
		Division div = new Division(n1,n2);
		System.out.println("Result is"+div.division());
		



	}

}
