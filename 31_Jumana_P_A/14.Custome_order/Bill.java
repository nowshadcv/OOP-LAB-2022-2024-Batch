package Bill;

import java.util.Date;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductB[][] order;
		System.out.println("Enter no. 0f orders: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		order = new ProductB[n][];
		for(int i =0; i<n; i++) {
			System.out.println("Enter no. 0f Products: ");
			int m = sc.nextInt();
			order[i]= new ProductB[m];
			for(int j =0; j<n; j++) {
			System.out.println("Enter product " +j + "name: ");
			String a = sc.next();
			System.out.println("Enter product id: ");
			int b = sc.nextInt();
			System.out.println("Enter product quantity: ");
			int c = sc.nextInt();
			System.out.println("Enter product unit_price: ");
			int d = sc.nextInt();
			ProductB pb = new ProductB(a,b,c,d);
			order[i][j]=pb;
			order[i][j].total= order[i][j].calculate();
			}
		}
		for(int i=0;i<n;i++) 
		{
			int sum=0;
			System.out.println("orderno:"+(i+1));
			Date date=java.util.Calendar.getInstance().getTime();
			System.out.println(date);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%5s %20s %25s %10s %10s","prod_Id","Name","quantity","unit_price","Total");
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		for(int j=0;j<order[i].length;j++) 
		{
			System.out.printf("%5s %20s %25s %10s %10s",order[i][j].prod_id,order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total);
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------");
		}
		for(int k=0;k<order[i].length;k++)
		
			sum=sum+order[i][k].total;
		System.out.println("Net Amount:"+sum);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
					
		
	}

		}
	}