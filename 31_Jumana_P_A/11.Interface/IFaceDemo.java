package Interface;
import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Circle c = new Circle();
		Rectangle r= new Rectangle();
		Square s = new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:area of circle:");
		System.out.println("2:area of rectangle:");
		System.out.println("3:are of square:");
		System.out.println("4:perimeter of circle:");
		System.out.println("5:perimeter of rectangle:");
		System.out.println("6:perimeter of square:");
		System.out.println("7:program termination");
		
lp : while(true) {
			System.out.println("Make your choice: ");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter the radius of the circle:\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("enter the length and breadth of the rectangle:\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("enter the length of the square:\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("enter the radius of the circle:\n");
				c.input();
				c.perimeter();
				break;
			case 5:
				System.out.println("enter the length and breadth of the rectangle:\n");
				r.input();
				r.area();
				break;
			case 6:
				System.out.println("enter the length of the square:\n");
				s.input();
				s.perimeter();
				break;
			case 7:
				break lp;
	default:
		System.out.println("invalid choice! please make a valid choice..");
			}		
}
}
}
