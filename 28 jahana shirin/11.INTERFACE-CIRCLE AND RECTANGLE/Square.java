package program11;
import java.util.Scanner;

public class Square implements AP {
	int a=0;
	double area = 0, perimeter = 0;
	public void input() {
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
	}
	public void area () {
		area = a*a;
		System.out.println("Area of Square : "+area);
	}
	public void perimeter() {
		perimeter=4*a;
		System.out.println("Perimeter of Square : "+perimeter);
	}
}


