package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the side of square");
	    int s = sc.nextInt();
	    Square sq=new Square(s);
	    System.out.println("perimeter :"+sq.perimeter());
	    System.out.println("Area:"+sq.area());
	    System.out.println("enter the radius of Circle:");
	    int r =sc.nextInt();
	    Circle ci=new Circle(r);
	    System.out.println("perimeter :"+ci.perimeter());
	    System.out.println("Area:"+ci.area());
	
	    System.out.println("Enter the side1 of Triangle:");
	    int s1=sc.nextInt();
	    System.out.println("Enter the side2 of Triangle:");
	    int s2=sc.nextInt();
	    System.out.println("Enter the side3 of Triangle:");
	    int s3=sc.nextInt();
	    Triangle tr=new Triangle(s1,s2,s3);
	    System.out.println("perimeter :"+tr.perimeter());
	    System.out.println("Area:"+tr.area());
	    
	
	    System.out.println("Enter the length of Rectangle:");
	    double l=sc.nextInt();
	    System.out.println("Enter the breadth of Rectangle:");
	    double b=sc.nextInt();
	    Rectangle Re=new Rectangle(l,b);
	    System.out.println("perimeter :"+Re.perimeter());
	    System.out.println("Area:"+Re.area());
	    
	}}
	
	
	
