package packalfiya;

public abstract class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product();
		p1.pcode="car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1:");
		p1.display();
		product p2=new product("jaguar","car426",25000);
		System.out.println("Displaying p2:");
		p2.display();
		product p3=new product("Maruthi","car426",25000);
		System.out.println("Displaying p3:");
		p3.display();
		product p=p3.getprice() < (p1.price < p2.price ? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\n Displaying product with lowest price:");
		p.display();
		
		

	}

}
