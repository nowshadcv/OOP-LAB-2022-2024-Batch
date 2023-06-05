package packB;
import java.util.*;

interface  BillGen{
	int calculate();
}

class productB implements  BillGen{
	String name;
	int prod_id,quantity,unit_price,total;
	productB(){
		
	}
	productB(String n,int p,int q,int u){
		name=n;
		prod_id=p;
		quantity=q;
		unit_price=u;
		
		
	}
	public int calculate()
	{
		total=quantity*unit_price;
		return total;
	}
}

public class Bill {

	public static void main(String[] args) {
	
		productB[][] order;
		System.out.println("Enter no of orders:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		order=new productB[n][];
		for(int i=0;i<n;i++) {
			System.out.println("Enter no of products.");
			int m=sc.nextInt();
			order[i]=new productB[m];
			for(int j=0;j<m;j++) {
				System.out.println("Enter product "+j+"Name:");
				String a=sc.next();
				System.out.println("enter product Id:");
				int b=sc.nextInt();
				System.out.println("Enter product Quantity:");
				int  c=sc.nextInt();
				System.out.println("Enter the product unit_price:");
				int d=sc.nextInt();
				productB pb=new productB (a,b,c,d);
				order[i][j]=pb;
				order[i][j].total=order[i][j].calculate();
				
				
			}
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
			System.out.println("order NO:"+(i+1));
			Date date=java.util.Calendar.getInstance().getTime();
			System.out.println(date);
			System.out.println("-------------------------------------------------------------------------------");
			System.out.printf("%5s %20s %25s %10s %10s","prod_id","Name","Quantity","unit_price","Total");
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			for(int j=0;j<order[i].length;j++)
			{
				System.out.printf("%5s %20s %25s %10s %10s",order[i][j].prod_id,order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total);
				System.out.println();
				
			}
			System.out.println("--------------------------------------------------------------------------------");
			for(int k=0;k<order[i].length;k++)
			{
				sum=sum+order[i][k].total;
				}
				System.out.println("Net Amount:"+sum);
				System.out.println("-----------------------------------------------------------------------------");
			
		}
	}

}