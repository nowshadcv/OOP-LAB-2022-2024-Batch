package packA;

import java.util.Scanner;

public class Square implements AP{
	int x=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();}
	public void area() {
		area=x*x;
		System.out.println("Area of square: "+area);}
	public void perimeter() {
		perimeter=4*x;
		System.out.println("Peimeter of square: "+perimeter);}}
