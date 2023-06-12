package Inheritance;

public class InheritanceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publisher lp=new Publisher( "S.Chand");
		Literature l=new Literature("As you like it" , lp);
		l.display();
		Publisher fp=new Publisher("Take McGraw Hill");
		Fiction f = new Fiction("Tempest" , fp);
		f.display();
	}

}
