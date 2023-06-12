package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		
		System.out.println("Enter the radius of the circle:");
		int r = sc.nextInt();
		Circle ci = new Circle(r);
		System.out.println("Perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		
		System.out.println("Enter the side of triangle:");
		int s1 = sc.nextInt();
		System.out.println("Enter the side of triangle:");
		int s2 = sc.nextInt();
		System.out.println("Enter the side of triangle:");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("Perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());
		
		System.out.println("Enter the breadth of the Rectangle:");
		int b = sc.nextInt();
		System.out.println("Enter the length of the Rectangle:");
		int l = sc.nextInt();
		Reactangle re = new Reactangle(l,b);
		System.out.println("Perimeter:"+re.perimeter());
		System.out.println("Area:"+re.area());


	}

}
