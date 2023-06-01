package programe11;

import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();
}


public class Iface {

	public static void main(String[] args) {
		int ch;
		Circle c= new Circle();
		Rectangle r = new Rectangle();
		Square s =new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: Area of Circle");
		System.out.println("2: Area of Rectangle");
		System.out.println("3: Perimeter of Circle");
		System.out.println("4: Perimeter of Rectangle");
		System.out.println("5: Area of Square");
		System.out.println("6: Perimeter of Square");
		System.out.println("7: Program Termination");
		lp : while (true) {
			System.out.println("Make Your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the Circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the length and breadth of the Rectangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the radius of the Circle \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the length and breadth of the Rectangle \n ");
				r.input();
				r.perimeter();
				break;
			case 5:
				System.out.println("Enter The Side of Square \n ");
				s.input();
				s.area();
				break;
			case 6:
				System.out.println("Enter The Side of Square \n ");
				s.input();
				s.perimeter();
				break;
			case 7:
				break lp;
				default :
					System.out.println("Invalied Choice ! Please make a valid choice..");
			}
		}
	}

}
