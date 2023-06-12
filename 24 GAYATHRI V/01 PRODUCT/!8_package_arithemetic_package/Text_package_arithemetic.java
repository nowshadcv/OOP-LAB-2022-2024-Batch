package arithematicPackage;
import Arithematic.*;
import java.util.Scanner;

public class Text_package_arithemetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 for addition:");
		int a=sc.nextInt();
		System.out.println("Enter the num2 for addition:");
		int b=sc.nextInt();
		Addition add= new Addition(a,b);
		System.out.println("Addition:"+add.add());
		
		System.out.println("Enter the num1 for substraction:");
		int c=sc.nextInt();
		System.out.println("Enter the num2 for substraction:");
		int d=sc.nextInt();
		Substraction sub= new Substraction(c,d);
		System.out.println("Substraction:"+sub.Sub());
		
		
		System.out.println("Enter the num1 for multiplication:");
		int e=sc.nextInt();
		System.out.println("Enter the num2 for muliplication:");
		int f=sc.nextInt();
		Multipication mul= new Multipication(e,f);
		System.out.println("Multiplication:"+mul.mul());
		
		
		System.out.println("Enter the num1 for division:");
		int g=sc.nextInt();
		System.out.println("Enter the num2 for division:");
		int h=sc.nextInt();
		Division div= new Division(g,h);
		System.out.println("division:"+div.div());
		
		
		


	}

}
