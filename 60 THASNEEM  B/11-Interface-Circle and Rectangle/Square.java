package packA;

import java.util.Scanner;

class Square implements AP{
		int a = 0;
		double area, perimeter;
		public void input() {
			Scanner s = new Scanner(System.in);
			 a = s.nextInt();}
		public void area() {
			area = a * a;
			System.out.println("area of square: " +area);}
		public void perimeter() {
			perimeter = 4 * a;
			System.out.println("perimeter of rectangle: "+perimeter); 
}
}
