package packHusna;

import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP {
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
		Scanner c=new Scanner(System.in);
		r=c.nextInt();
	}
	public void area() {
		area=pi*r*r;
		System.out.println("area of circle:"+area);
	}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("perimeter of circle:"+perimeter);
	}
}
class Rectangle implements AP {
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area() {
		area=l*b;
		System.out.println("area of rectangle:"+area);
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("perimeter of rectangle:"+perimeter);
	}
}
class Square implements AP {
	int x=0;
	double area,perimeter;
	public void input() {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
	}
	public void area() {
		area=x*x;
		System.out.println("area of the square:"+area);
	}
	public void perimeter() {
		perimeter=4*x;
		System.out.println("perimeter of square:"+perimeter);
	}
}

public class IFaceDemo {

	public static void main(String[] args) {
		int ch;
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Square s = new Square();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.area of circle");
		System.out.println("2.area of rectangle");
		System.out.println("3.area of square");
		System.out.println("4.perimeter of circle");
		System.out.println("5.perimeter of rectangle");
		System.out.println("6.perimeter of square");
		System.out.println("7.program termination");
lp:while(true) {
	System.out.println("make your choice:");
	ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter the radius of the circle \n");
		c.input();
		c.area();
		break;
	case 2:
		System.out.println("enter the length and breadth of the rectangle \n");
		r.input();
		r.area();
		break;
	case 3:
		System.out.println("enter the side of square \n");
		s.input();
		s.area();
		break;
	case 4:
		System.out.println("enter the radius of the circle \n");
		c.input();
		c.perimeter();
		break;
	case 5:
		System.out.println("enter the length and breadth of the rectangle \n");
		r.input();
		r.perimeter();
		break;
	case 6:
		System.out.println("enter the side of square \n");
		s.input();
		s.perimeter();
		break;
	case 7:
		break lp;
 default:
	 System.out.println("invalid choice.please make a valid choice");
	 
	}
}
	}
}





