package program15;
import java.util.*;
import java.io.*;

public class Student {
		String name;
		int roll_no;
		float mark1,mark2;
		Student(String n, int r,float m1,float m2){
			name=n;
			roll_no=r;
			mark1=m1;
			mark2=m2;
			
		}
		void display() {
			System.out.println("_____Student Details_____");
			System.out.println("Name of Student: "+name);
			System.out.println("Roll No.of Student 1:"+roll_no);
			System.out.println("Marks of Subject 1:"+mark1);
			System.out.println("Marks of Subject 2:"+mark2);
		}
	}


