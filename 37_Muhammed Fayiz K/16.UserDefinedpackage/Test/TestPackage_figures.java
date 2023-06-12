package Test;
import Figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side of square:");
		int s = sc.nextInt();
		Square sq= new Square(s);
		System.out.println("perimeter: " +sq.perimeter());
		System.out.println("area: " +sq.area());
		System.out.println("Enter the radius of circle:");
		int r=sc.nextInt();
		Circle ci=new Circle(r);
		System.out.println("Perimeter : "+ci.perimeter());
		System.out.println("Area : "+ci.area());
		System.out.println("Enter the side1 of triangle:");
		int s1=sc.nextInt();
		System.out.println("Enter the side2 of triangle:");
		int s2=sc.nextInt();
		System.out.println("Enter the side3 of triangle:");
		int s3=sc.nextInt();
		
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("Perimeter : "+tr.perimeter());
		System.out.println("Area : "+tr.area());
		System.out.println("enter the length of rectangle");
		int l=sc.nextInt();
		System.out.println("enter the width of rectangle");
		int w=sc.nextInt();
		Rectangle rt=new Rectangle(l,w);
		System.out.println("perimeter:"+rt.perimeter());
		System.out.println("area:"+rt.area());
	}

}
