package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side od square:");
		int s = sc.nextInt();
		Square sq = new Square(s);
		System.out.println("perimeter :"+ sq.perimeter());
		System.out.println("area :"+sq.area());
		System.out.println("enter the radius of circle :");
		int r = sc.nextInt();
		Circle ci = new Circle(r);
		System.out.println("perimeter :" + ci.perimeter());
		System.out.println("area:" + ci.area());
		
		System.out.println("enter the side1 pf triangle:");
		int s1 = sc.nextInt();
		System.out.println("enter the side2 of triangle:");
		int s2 =sc.nextInt();
		System.out.println("enter the side3 of triangle:");
		int s3 = sc.nextInt();
		Triangle tr = new Triangle(s1,s2,s3);
		System.out.println("perimeter :"+ tr.perimeter());
		System.out.println("area:"+tr.area());
		
	}

}
