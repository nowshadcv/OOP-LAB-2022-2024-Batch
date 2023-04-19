package packA;
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
		r=c.nextInt();}
	public void area() {
		area = pi*r*r;
		System.out.println("area of the circle:"+area);}
	
public void perimeter() {
	perimeter =2*pi*r;
	System.out.println("perimeter of the circle:"+perimeter);}}
    


class Rectangle implements AP {
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();}
	public void area() {
		area = l*b;
		System.out.println("area of the reactangle:"+area);}
	
public void perimeter() {
	perimeter =2*(l+b);
	System.out.println("perimeter of the reactangle:"+perimeter);}}


class Square implements AP {
	int a=0;
	double area,perimeter;
	public void input() {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		}
	public void area() {
		area = a*a;
		System.out.println("area of the square :"+area);}
	
public void perimeter() {
	perimeter =4*a;
	System.out.println("perimeter of the square :"+perimeter);}}
    

public class IFaceDemo{
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1: Area of Circle");
		System.out.println("2: Area of Rectangle");
		System.out.println("3: Area of square");
		System.out.println("4: perimeter of Circle");
		System.out.println("5: perimeter of rectangle");
		System.out.println("6: Area of square");
		System.out.println("7: program termination");
		
		
		
lp:while(true) {
	System.out.println("Make your choice: ");
	ch=sc.nextInt();
	switch (ch) {
	case 1:
		System.out.println("Enter the radius of the circle \n");
		c.input();
		c.area();
		break;
		
		
	case 2:
		System.out.println("Enter the length and breadth of the Rectangle \n");
		r.input();
		r.area();
		break;
		
	case 3:
		System.out.println("Enter the side of the square \n");
		s.input();
		s.area();
		break;
	case 4:
		System.out.println("Enter the side of the circle \n");
		c.input();
		c.perimeter();
		break;
		
	case 5:
		System.out.println("Enter the length and breadth of the rectangle \n");
		r.input();
		r.perimeter();
		break;
		
	case 6:
		System.out.println("Enter the side of the square \n");
		s.input();
		s.perimeter();
		break;
	case 7:
		break lp;
default:
			System.out.println(" Invalid choice! Please make a valid choice..");}}}}
