package aiswarya;

import java.io.*;
import java.util.Scanner;

interface Sports
{
	public void sports_getData();
	public void sports_dispData();
}
class Student
{
	String name;
	int roll_no;
	float mark1,mark2;
	Student(String n,int r,float m1,float m2)
	{
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
	void display()
	{
		System.out.println("Student Details:");
		System.out.println("Name of Student:"+name);
		System.out.println("Roll no of student:"+roll_no);
		System.out.println("Marks of subject 1:"+mark1);
		System.out.println("Marks of subject 2:"+mark2);
	}
}
class Result extends Student implements Sports
{
	int r;
	String item;
	Scanner sc=new Scanner(System.in);
	Result(String n,int r,float m1,float m2)
	{
		super(n,r,m1,m2);
	}
	public void academic()
	{
		float total=(mark1+mark2);
		System.out.println("____Academic info____");
	}
	public void sports_getData()
	{
		System.out.println("Enter the sports item which student participated:");
		item=sc.nextLine();
		System.out.println("Enter the rank position that the obtained:");
		r=sc.nextInt();
	}
	public void sports_dispData()
	{
		System.out.println("___sports info___");
		System.out.println("Item:"+item);
		System.out.println("rank:"+r);
	}
}
public class Main
{

	public static void main(String[] args)throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the name:");
		String n=br.readLine();
		System.out.println("Enter roll no:");
		int roll=Integer.parseInt(br.readLine());
		System.out.println("Enter mark in first subject:");
		float m1=Float.parseFloat(br.readLine());
		System.out.println("Enter mark in second subject:");
		float m2=Float.parseFloat(br.readLine());
		Result re=new Result(n,roll,m1,m2);
		re.sports_getData();
		re.display();
		re.academic();
		re.sports_dispData();
	}
	
}


