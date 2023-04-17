import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: Area of Circle");
		System.out.println("2: Area of Rectangle");
		System.out.println("3: Area of Square");
		System.out.println("4: Perimeter of Circle");
		System.out.println("5: Perimeter of Rectangle");
		System.out.println("6: Perimeter of Square");
		System.out.println("7: Program of termination");
lp : while(true) {
			System.out.println("Make your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the radius of the circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the length and breadth of the Reactangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the length of the square \n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the radius of the circle \n");
				c.input();
				c.perimeter();
				break;
			case 5:
				System.out.println("Enter the length and breadth of the Reactangle \n");
				r.input();
				r.perimeter();
				break;
			case 6:
				System.out.println("Enter the length of the square \n");
				s.input();
				s.perimeter();
				break;
			case 7:
				break lp;
	default:
		System.out.println("Invalid choice! Please make a valid choice..");
				
			}
}
	}

}
