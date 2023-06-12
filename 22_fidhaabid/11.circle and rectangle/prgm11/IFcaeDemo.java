package prgm11;

import java.util.Scanner;

public class IFcaeDemo {
	public static void main(String[] args) {
		int ch;
		circle c = new circle();
		rectangle r = new rectangle();
		square s = new square();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 : Area of circle");
		System.out.println("2 : Area of rectangle");
		System.out.println("3 : Area of square");
		System.out.println("4 : perimeter of circle");
		System.out.println("5 : perimeter of rectangle");
		System.out.println("6 : perimeter of square");
		System.out.println("7 : program termination");
lp : while(true) {
			System.out.print("make your choice:");
				ch = sc.nextInt();
			switch (ch){
			case 1 :
				System.out.print("enter the radius of the circle \n");
				c.input();
				c.area();
				break;  
			case 2 :
				System.out.print("enter the lenght and breadth of the rectangle \n");
				r.input();
				r.area();
				break;  
			case 3 :
				System.out.print("enter the radius of the circle \n");
				c.input();
				c.perimeter();
				break;  
			case 4 :
				System.out.print("enter the length and breadth of the rectangle  \n");
				r.input();
				r.perimeter();
				break;  
			case 5:
				break lp;
				default :
					System.out.println("invalid choice ! please make a valid choice");}}}}

			
		
		
	


