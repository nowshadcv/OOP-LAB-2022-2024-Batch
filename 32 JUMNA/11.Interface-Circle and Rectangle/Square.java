package packB;

import java.util.Scanner;

public class Square implements AP {
	int a=0;
	double area,perimeter;

	@Override
	public void input() {
		Scanner sq = new Scanner(System.in);
		a=sq.nextInt();

	}

	@Override
	public void area() {
		area=a * a;
		System.out.println("area of square :"+area );

	}

	@Override
	public void perimeter() {
		perimeter= 4 * a;
		System.out.println("perimeter of square :"+perimeter );

	}

}
