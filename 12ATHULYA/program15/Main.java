package program15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.print("Enter the name :");
		String n =br.readLine();
		System.out.print("Enter Roll No : ");
		int roll=Integer.parseInt(br.readLine());
		System.out.print("Enter mark in first subject :");
		float m1=Float.parseFloat(br.readLine());
		System.out.print("Enter mark in second Subject :");
		float m2=Float.parseFloat(br.readLine());
		Result re=new Result(n,roll,m1,m2);
		re.sports_getData();
		re.display();
		re.academic();
		re.sports_dispData();
	}

}
