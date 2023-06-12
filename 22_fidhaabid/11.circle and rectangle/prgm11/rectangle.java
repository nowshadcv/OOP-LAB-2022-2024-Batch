package prgm11;

import java.util.Scanner;
 class rectangle implements AP {
	 int l = 0, b = 0;
	 double area,perimeter;
	 public void input(){
		 Scanner r = new Scanner(System.in);
		 l = r.nextInt();
		 b = r.nextInt();}
	 public void area(){
		 area = l * b;
		 System.out.println("area of rectangle:" + area);}
	 public void perimeter(){
		 perimeter = 2 * (l+b);
		 System.out.println("perimeter of rectangle:" + perimeter);
				 
		 
		 
	 }

}
