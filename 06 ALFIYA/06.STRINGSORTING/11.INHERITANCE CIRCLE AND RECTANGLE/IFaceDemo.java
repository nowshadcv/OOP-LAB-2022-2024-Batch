package program11;

import java.util.Scanner;

public class IFaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner (System.in);
		System.out.println("1:Area of circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Area of circle");
		System.out.println("4:Area of Recatngle");
		System.out.println("5:program termination");
lp:while(true){
	System.out.print("make your choice");
	ch=sc.nextInt();
	switch(ch){
	case 1:
		System.out.print("Enter the radius of the circle \n");
		c.input();
		c.area();
		break;
	
	case 2:
		System.out.print("Enter the length and breadth of the rectangle \n");
		r.input();
		r.area();
		break;
	case 3:
		System.out.print("Enter the radius of the circle \n");
		c.input();
		c.perimeter();
		break;
	case 5:
		
		break lp;

default:
	System.out.println("Invalid choice! please make a valid choice..");}}}}
	
