import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Circle c= new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Square");
		System.out.println("4.Perimeter of Circle");
		System.out.println("5.perimeter of Rectangle");
		System.out.println("6.perimeter of Square");
		System.out.println("7.Program termination");
		
		lp : while(true) {
			System.out.print("Make yoour choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the radius of circle");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the l and b of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the side");
				s.input();
				s.area();
				break;
			case 4:
				System.out.println("Enter the radius of the circle\n");
				c.input();
				c.perimeter();
				break;
			case 5:
				System.out.println("Enter the length and breadth of rectangle");
				r.input();
				r.perimeter();
				break;
			case 6:
				System.out.println("Enter the length of the square");
				s.input();
				s.perimeter();
				break;
			case 7:
				break lp;
				
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
