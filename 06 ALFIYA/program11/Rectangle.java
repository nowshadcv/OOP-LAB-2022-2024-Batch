package program11;

import java.util.Scanner;

public class Rectangle {
	int l=0,b=0;
	double area,perimeter;
	public void input(){
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();}public void area(){
			area=l*b;
			System.out.println("perimeter of rectangle:"+perimeter);
	}
}


