package Test;
import java.util.Scanner;
import figures.*;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("Enter radius of circle");
		int r=sc.nextInt();
		Circle ci=new Circle(r);
		System.out.println("Perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
		System.out.println("Enter 3 sides of triangle");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("Perimeter:"+tr.perimeter());
		System.out.println("Area:"+tr.area());
		System.out.println("Enter length of rectangle");
		int l=sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b=sc.nextInt();
		Rectangle re=new Rectangle(l,b);
		System.out.println("Perimeter:"+re.perimeter());
		System.out.println("Area:"+re.area());
	}

}
