package packhasnaco2;

public class InheritanceBook {

	public static void main(String[] args) {	
			    Publisher lp = new Publisher ("S . Chand" ) ;
				Literature l = new Literature ( "as you like it " ,lp );
				l . display ();
				Publisher fp = new Publisher ( "Tata mcGraw Hill " );
				Fiction f = new Fiction ("Tempest " , fp ) ;
				f . display (); }

	}

