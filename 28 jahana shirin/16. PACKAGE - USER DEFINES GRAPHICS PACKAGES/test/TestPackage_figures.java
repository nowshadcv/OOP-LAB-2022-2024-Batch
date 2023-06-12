package test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of Square: ");
		int s = sc.nextInt();
		Square Sq = new Square(s);
		System.out.println("perimeter : " + Sq.perimeter());
		System.out.println("area : " + Sq.area());
		
		System.out.println("enter the radius of Circle: ");
		int r = sc.nextInt();
		Circle Ci = new Circle(r);
		System.out.println("perimeter : " + Ci.perimeter());
		System.out.println("area : " + Ci.area());
		
		System.out.println("enter the side1 of Triangle: ");
		int s1 = sc.nextInt();
		System.out.println("enter the side2 of Triangle: ");
		int s2 = sc.nextInt();
		System.out.println("enter the side3 of Triangle: ");
		int s3 = sc.nextInt();
		Triangle Tr = new Triangle(s1, s2, s3);
		System.out.println("perimeter : " + Tr.perimeter());
		System.out.println("area : " + Tr.area());
		
		
		
		
	}

}
