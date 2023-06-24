package packA;

public class Cars {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.pcode="car123";
		p1.pname="benz";
		p1.price=10000;
		System.out.println("Display P1 : ");
		p1.display();
		Product p2=new Product("Jaguar","car426",25000);
		System.out.println("Display P2 : ");
		p2.display();
		Product p3 =new Product("Maruthi","car800",50000);
		System.out.println("Display P3 : ");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price : ");
		p.display();

	}

}
