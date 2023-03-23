package PackAsna;

public class Cars {

	public static void main(String[] args) {
		product p1=new product();
		p1.pcode="Cars123";
		p1.pname="Benz";
		p1.price=100000;
		System.out.println("Displaying p1:");
		p1.display();
		product p2=new product("Jaguar","car426",250000);
		System.out.println("Displaying p1:");
		p2.display();
		product p3=new product("Maruthi","car805",50000);
		p3.display();
		product p =p3.getPrize()<(p1.price<p2.price?p1.price:p2.price)?
				p3:(p1.price<p2.price?p1:p2);
		System.out.println("Displaying product with lowest price:");
		p.display();
        // TODO Auto-generated method stub
}

}
