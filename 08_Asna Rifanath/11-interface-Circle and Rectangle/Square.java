
package co2;
import java.util.Scanner;

public class Square implements AP {
	int s1 = 0;
	double area=0,perimeter=0;
	public void input() {
		Scanner s = new Scanner(System.in);
		s1 = s.nextInt();
		}
	public void area() {
		area = s1 * s1;
		System.out.println("Area of square: " + area);}
	public void perimeter() {
		perimeter = 4 * (s1);
		System.out.println("perimeter of square: " + perimeter);}}
