package packSurumy;
import java.util.*;
interface BillGen {
int calculate();
}
class ProductB implements BillGen{
String name;
int prod_id,quantity,unit_price,total;
ProductB(){}
ProductB(String n,int p,int q,int u){
name = n; prod_id = p;
quantity = q; unit_price = u;
}
public int calculate() {
total = quantity * unit_price;
return total;
}

}
public class Bill {
public static void main(String[] args) {
ProductB[][] order;
System.out.println("Enter no of orders :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
order=new ProductB[n][];
for(int i=0;i<n;i++) {
System.out.println("enter no of products:");
int m=sc.nextInt();
order[i]=new ProductB[m];
for(int j=0;j<m;j++) {
System.out.println("enter product" + j + "Name:");
String a=sc.next();
System.out.println("enter product id:");
int b=sc.nextInt();
System.out.println("enter product quantity:");
int c=sc.nextInt();
System.out.println("ENTER PRODUCT UNIT_PRICE:");
int d=sc.nextInt();
ProductB pq=new ProductB(a,b,c,d);
order[i][j]=pq;
order[i][j].total=order[i][j].calculate();
}
}
for(int i=0; i<n; i++) {
int sum=0;
System.out.println("order no:" +(i+1));
Date date=Calendar.getInstance().getTime();
System.out.println(date);
System.out.println("--------------------------------------------------");
System.out.printf("%5s,%20s,%25s,%10s,%10s","prod_id","Name","Quantity","Unit_price","Total");
System.out.println();
System.out.println("---------------------------------------------------");
for(int j=0;j<order[i].length;j++) {
System.out.printf("%5s %20s %25s %10s %10s",order[i][j].prod_id, order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total);
System.out.println();
}
System.out.println("----------------------------------------------------");
for( int k=0;k<order[i].length;k++) {
sum=sum+order[i][k].total;
System.out.println("net amount:" +sum);
System.out.println("----------------------------------------------------");

}

}
}
}
