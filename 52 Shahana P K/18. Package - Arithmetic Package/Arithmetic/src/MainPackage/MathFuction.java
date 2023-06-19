package MainPackage;
import java.util.*;

import ArithmeticPackage.*;

public class MathFuction {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter First Number : ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		int b=sc.nextInt();
		Add A =new Add(a,b);
		Div D =new Div(a,b);
		Mul M=new Mul(a,b);
		Sub S=new Sub(a,b);
		System.out.println("________Arithamatic Operations_________");
		System.out.println("Sum of "+a+" and "+b+" : "+A.sum());
		System.out.println("Difference of "+a+" and "+b+" : "+S.sub());
		System.out.println("Product of "+a+" and "+b+" : "+M.mul());
		System.out.println("Division of "+a+" and "+b+" : "+D.div());
		System.out.println("__________________END__________________");

	}

}
