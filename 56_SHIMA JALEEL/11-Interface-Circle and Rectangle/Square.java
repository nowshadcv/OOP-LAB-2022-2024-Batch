package packA;

import java.util.Scanner;

public class Square implements AP { 
	int x=0;
	double area, perimeter;
	public void input() {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();}
	public void area() {
		area=x*x;
		System.out.println("Area of Square:" +area);}
	public void perimeter() {
		perimeter=4*x;
		System.out.println("Perimeter of Square:" +perimeter);}}
	
	
	


