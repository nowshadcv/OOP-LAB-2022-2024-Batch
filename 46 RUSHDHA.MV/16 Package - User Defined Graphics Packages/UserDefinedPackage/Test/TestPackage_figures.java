package Test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of Square:");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
	    System.out.println("Enter the radius of the circle:");
	    int r=sc.nextInt();
	    Circle ci=new Circle(r);
	    System.out.println("perimeter:"+ci.perimeter());
	    System.out.println("Area:"+ci.area());
	    System.out.println("Enter the 3 side of the rectangle:");
	    int s1=sc.nextInt();
	    int s2=sc.nextInt();
	    int s3=sc.nextInt();
	    Triangle tr=new Triangle(s1,s2,s3);
	    System.out.println("perimeter:"+tr.perimeter());
	    System.out.println("Area:"+tr.area());
	    System.out.println("Enter the length of Rectangle:");
		int len=sc.nextInt();
		 System.out.println("Enter the breadth of Rectangle:");
			int bred=sc.nextInt();
		Rectangle rt=new Rectangle(len,bred);
		System.out.println("Perimeter:"+rt.perimeter());
		System.out.println("Area:"+rt.area());
	}

}
