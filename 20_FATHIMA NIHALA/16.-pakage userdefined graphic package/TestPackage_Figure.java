package Test;
import Figures.*;
import java.util.Scanner;
public class TestPackage_Figure {
	public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the side of Square:");
		int s =sc.nextInt();
		Square sq=new Square(s);
		System.out.println("perimeter : " + sq.perimeter());
		System.out.println("area : " + sq.area());
		
		System.out.println("enter the radius od cirle:");
		int r=sc.nextInt();
		Circle Ci =new Circle(r);
		System.out.println("perimeter : " + Ci.perimeter());
		System.out.println("area : " + Ci.area());
		
		System.out.println("enter the side1 of Triangle:");
		int s1 =sc.nextInt();
		
		System.out.println("enter the side2 of Triangle:");
		int s2 =sc.nextInt();
		
		System.out.println("enter the side3 of Triangle:");
		int s3 =sc.nextInt();
      Triangle tr =new Triangle(s1 ,s2, s3);
      System.out.println("perimeter :"+ tr.perimeter());
      System.out.println("area :"+ tr.area());
      System.out.println("Enter the length   of Rectangle  :");
      int l=sc.nextInt();
      System.out.println("Enter the lenhgth and breadth oh Rectangle:");
      int b=sc.nextInt();
      Rectangle re =new  Rectangle (l,b);
      System.out.println("perimeter:" +re.perimeter());
      System.out.println("area:" + re.area());
      
	}

}
