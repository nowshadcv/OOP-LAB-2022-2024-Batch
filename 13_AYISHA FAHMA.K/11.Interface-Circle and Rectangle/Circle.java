package packB;

import java.util.Scanner;

public class Circle implements AP {
	int r=0;
	double pi=3.14,area=0,perimeter=0;

	@Override
	public void input() {
		Scanner c=new Scanner(System.in);
		r=c.nextInt();

	}

	@Override
	public void area() {
		area=pi * r * r;
		System.out.println("area of the circle is :"+area);
		

	}

	@Override
	public void perimeter() {
		perimeter=2 * pi * r;
		System.out.println("perimeter of circle is: "+perimeter);

	}

}
