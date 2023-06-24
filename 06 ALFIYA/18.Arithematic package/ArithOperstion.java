import arithematicOperationdoubl.*;
import java.util.Scanner;

public class ArithOperstion {
	public static void main(String[]args){
		int nOne;
		int nTwo;
		System.out.println("Enter first number");
		Scanner s=new Scanner(System.in);
		nOne=s.nextInt();
		System.out.println("Enter second number");
		nTwo=s.nextInt();
		AriOp a=new AriOp(nOne,nTwo);
		System.out.println("Sum is"+a.add());
		System.out.println("Division is"+a.div());
		System.out.println("Multiplication is"+ a.mult());
		System.out.println("Division is"+a.div());
		
	}

}
