package program15;
import java.util.*;
import java.io.*;

public class Result extends Student implements Sports{
	int r;
	String item;
	Scanner sc=new Scanner(System.in);
	Result(String n, int r,float m1, float m2){
		super(n,r,m1,m2);
	}
	public void academic() {
		float total=(mark1+mark2);
		System.out.println("_____Academic Info_____");
		System.out.println("Total Mark : "+total);
	}
	public void sports_getData() {
		System.out.print("Enter the Sports item which student participated: ");
		item=sc.nextLine();
		System.out.println("Enter the rank position that the obtained: ");
		r=sc.nextInt();
		
	}
	public void sports_dispData() {
		System.out.println("_____sports info_____");
		System.out.println("item: "+item);
		System.out.println("Rank: "+r);
	}
}


