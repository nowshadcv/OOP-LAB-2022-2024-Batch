package Test;
import Figures.*;
import java.util.Scanner;

public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of square:");
		int s = sc.nextInt();
		square sq = new square(s);
		System.out.println("Perimeter:" +sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("Enter the radius of the circle:");
		int r = sc.nextInt();
		Circle ci = new Circle(r);
		System.out.println("Perimeter is:"+ci.perimeter());
		System.out.println("Area is:"+ci.area());
		System.out.println("Enter the side1 of the Triangle:");
		int s1 = sc.nextInt();
		System.out.println("Enter the side2 of the Triangle:");
		int s2 = sc.nextInt();
		System.out.println("Enter the side3 of the Triangle:");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("Perimeter is:"+tr.perimeter());
		System.out.println("Perimeter is:"+tr.area());
		System.out.println("enter the length of the rectangle:");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int b = sc.nextInt();
		Rectangle rg = new Rectangle(l,b);
		System.out.println("perimeter is:" +rg.perimeter());
		System.out.println("area is:" +rg.area());


	}

}
