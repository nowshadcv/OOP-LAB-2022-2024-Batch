package packA;

import java.util.Scanner;

public class Square implements AP {
	int a = 0;
	double area,perimeter;
	public void input() {
		Scanner c = new Scanner(System.in);
		a = c.nextInt();
	}
	public void area() {
		area = a * a ;
		System.out.println("area of the circle is:" +area);
	}
	public void perimeter() {
		perimeter = 4 * a;
		System.out.println("Perimeter  of the square is" +perimeter);
	}

}
