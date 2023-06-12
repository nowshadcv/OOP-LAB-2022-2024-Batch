package Test;
import figures.*;
import java.util.Scanner;

public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("perimeter:"+sq.perimeter());
		System.out.println("area:"+sq.area());
		
		System.out.println("Enter the radius of circle :");
		int r=sc.nextInt();
		Circle ci=new Circle(r);
		System.out.println("perimeter:"+ci.perimeter());
		System.out.println("area:"+ci.area());
		
		System.out.println("Enter the side1 of triangle :");
		int s1=sc.nextInt();
		System.out.println("Enter the side2 of triangle :");
		int s2=sc.nextInt();
		System.out.println("Enter the side3 of triangle :");
		int s3=sc.nextInt();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("perimeter:"+tr.perimeter());
		System.out.println("area:"+tr.area());
		
		System.out.println("Enter the length of rectangle:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		int b=sc.nextInt();
		Rectangle re=new Rectangle(l,b);
		System.out.println("perimeter:"+re.perimeter());
		System.out.println("area:"+re.area());
		

	}}
