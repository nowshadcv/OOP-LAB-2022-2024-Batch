package program14;

public class InheritanceBook {

	public static void main(String[] args) {
			Publisher lp=new Publisher("S . Chand");
			Literature l=new Literature ("As you like it ",lp);
			l.display();
			Publisher fp=new Publisher(" Tata McGraw Hill");
			Fiction f = new Fiction (" Tempest" ,fp);
			f.display();
}
}
