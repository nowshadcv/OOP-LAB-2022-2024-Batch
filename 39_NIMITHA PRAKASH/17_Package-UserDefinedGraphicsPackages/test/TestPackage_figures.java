package Test;
import figures.*;
import java.util.Scanner;
public class TestPackage_figures {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of square:");
		int s=sc.nextInt();
		Square sq=new Square(s);
		System.out.println("Perimeter:"+sq.perimeter());
		System.out.println("Area:"+sq.area());
		System.out.println("enter the radius of circle:");
		int r=sc.nextInt();
		Circle ci=new Circle(r);
		System.out.println("Perimeter:"+ci.perimeter());
		System.out.println("Area:"+ci.area());
	    
		



	}

}
