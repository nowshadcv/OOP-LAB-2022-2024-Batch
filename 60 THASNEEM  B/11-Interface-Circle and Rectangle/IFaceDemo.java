package packA;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of rectangle");
		System.out.println("3.perimeter of Circle");
		System.out.println("4.perimeter of Rectangle");
		System.out.println("5.area of square");
		System.out.println("6.perimeter of square");
		System.out.println("7.program Termination");
		lp : while(true) {
			        System.out.print("make your choice:");
			        ch = sc.nextInt();
			        switch(ch) {
			        case 1:
			        	System.out.println("enter the radius of the circle \n");
			        	c.input();
			        	c.area();
			        	break;
			        case 2:
			        	System.out.print("enter the length and breadth of the Rectangle \n");
			        	r.input();
			        	r.area();
			        	break;
			        case 3:
			        	System.out.print("enter the radius of the circle \n");
			        	c.input();
			        	c.perimeter();
			        	break;
			        case 4:
			        	System.out.print("enter the length and breadth of the Rectangle \n");
			        	r.input();
			        	r.perimeter();
			        	break;
			        case 5:
			        	System.out.print("enter the side of the Square \n");
			        	s.input();
			        	s.area();
			        	break;
			        case 6:
			        	System.out.print("enter the side of the square \n");
			        	s.input();
			            s.perimeter();
			        	break;
			        case 7:
			        	break lp;
			  default:
				  System.out.print("invalid choice! please make a valid choice..");}
			        }
		}
		
}

