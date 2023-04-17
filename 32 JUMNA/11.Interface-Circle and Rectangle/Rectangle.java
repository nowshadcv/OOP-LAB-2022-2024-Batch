package packB;

import java.util.Scanner;

public class Rectangle implements AP {
	int l=0,b=0;
	double area,perimeter;

	@Override
	public void input() {
		Scanner r = new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();

	}

	@Override
	public void area() {
		area=l * b;
		System.out.println("area of rectangle :"+area );
		

	}

	@Override
	public void perimeter() {
		perimeter= 2 * (l+b);
		System.out.println("perimeter of rectangle :"+perimeter );

	}

}
