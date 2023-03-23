package packF;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.pcode="car123";
		p1.pname="benz";
	    p1.price=10000;
        System.out.println("displaying PI:");
        p1.display();
    Product P2=new Product("jaguar","car426",25000);
    System.out.println("displaying P2:");
    P2.display();
    Product P3=new Product("maruthi","car800",50000);
    System.out.println("displaying P3:");
    P3.display();
    Product p=P3 .getprice()<(p1.price<P2.price?p1.price:P2.price)?P3:(p1.price<P2.price?p1:P2);
    System.out.println("\n Displaying product with lowest price:");
    p.display();}}
	


