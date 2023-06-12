package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter the side of Square:");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("perimeter:" +sq.perimeter());
		System.out.println("Area:" +sq.area());
		
		System.out .println("Enter the radius of Circle:");
		int r = sc.nextInt();
		Circle ci = new Circle(r);
		System.out.println("perimeter:" +ci.perimeter());
		System.out.println("Area:" +ci.area());
	
		System.out .println("Enter the side1 of Triangle:");
		int s1 = sc.nextInt();
		System.out .println("Enter the side2 of Triangle:");
		int s2 = sc.nextInt();
		System.out .println("Enter the side3 of Triangle:");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("perimeter:" +sq.perimeter());
		System.out.println("Area:" +tr.area());
		
		System.out .println("Enter the length of Rectangle:");
		int l = sc.nextInt();
		System.out.println("Enter the width of Rectangle");
		int w = sc.nextInt();
		Rectangle re = new Rectangle(l,w);
		System.out.println("perimeter:" +re.perimeter());
		System.out.println("Area:" +re.area());
	}
	}


