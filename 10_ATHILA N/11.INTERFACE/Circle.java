package pgm11;

import java.util.Scanner;

class Circle implements AP{
	int r = 0;
	double pi = 3.14,area = 0,perimeter = 0;
	public void input() {
		Scanner c = new Scanner(System.in);
		r = c.nextInt();
	}
	public void area() {
		area = pi * r * r;
		System.out.println("area of circle is: " + area);
	}
	public void perimeter() {
		perimeter = 2 *pi*r;
		System.out.println("perimeter of circle is: " + perimeter);
	}
}