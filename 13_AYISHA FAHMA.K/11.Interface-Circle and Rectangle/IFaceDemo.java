package packB;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square sq=new Square();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1: area of circle");
		System.out.println("2: area of rectangle ");
		System.out.println("3: perimeter of circle");
		System.out.println("4: perimeter of rectangle");
		System.out.println("5: area of square ");
		System.out.println("6: perimeter of square");
		System.out.println("7: program termination");
		
	lp : while(true) {
			System.out.println("make your choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("enter the radius of the circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("enter the length and breadth of the rectangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("enter the radius of the circle \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("enter the length and breadth of the rectangle \\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				System.out.print("enter the side of square \n");
				sq.input();
				sq.area();
				break;
			case 6:
				System.out.println("enter the side of square \n");
				sq.input();
				sq.perimeter();
				break;	
			case 7:
				break lp;
				
	   default:
		   System.out.println("invalid choice! please make a valid choice");
		   
			}
		}

	}

}
