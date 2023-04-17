package packA;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square a = new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1: Area of Circle ");
		System.out.println(" 2: Area of Rectangle ");
		System.out.println(" 3: Area of square ");
		System.out.println("4: perimeter of Circle");
		System.out.println(" 5: perimeter of Square ");
		System.out.println(" 6.perimeter of Rectangle");
		System.out.println("7.program termination");
		lp: while(true) {
			System.out.print("Make your choice: ");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1:
				System.out.print("Enter the radius of the circle:\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of the rectangle:\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("enter the side of the square:\n");
				a.input();
				a.area();
				break;
			case 4:
				System.out.print("Enter the radius of the circle:\n");
				c.input();
				c.perimeter();
				break;
			case 5:
				System.out.print("Enter the length&breadth of square:\n");
				a.input();
				a.perimeter();
			case 6:
				System.out.print("Enter the length and breadth of the Rectangle:\n");
				r.input();
				r.perimeter();
				break;
			case 7:
				break lp;
				default:
					System.out.println("\n Invalid choice!! please make a valid choice....");				
				
			}
		}
		

	}

}
