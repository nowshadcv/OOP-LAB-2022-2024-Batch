package progarm1;

public abstract class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product p1=new product();
		p1.pcode="Car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1:");
		p1.display();
		product p2=new product("Jaquar","car426",25999);
		System.out.println("Displaying p2:");
		p2.display();
		product p3=new product("Maruti","car800",50000);
		System.out.println("Displaying p3:");
		p3.display();
		product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:");
		p.display();			
	}

}
