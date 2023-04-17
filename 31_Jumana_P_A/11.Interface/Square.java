package Interface;

import java.util.Scanner;

class Square implements AP{
	int l=0;
	double area,perimeter;
	public void input() {
		Scanner r = new Scanner(System.in);
		l=r.nextInt();
	}
	public void area(){
		area = l*l;
		System.out.println("area of square: " +area);
	}
	public void perimeter(){
		perimeter = 4*l;
		System.out.println("Perimeter of square: " +perimeter);
	}
}
