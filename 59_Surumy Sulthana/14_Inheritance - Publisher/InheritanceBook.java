package packSurumy;
import java.util.Scanner;
class Publisher{
	String publisher;
	Publisher(String publi){
		this .publisher=publi;
	}
}
class Book{
	String name;
	Publisher publisher;
	Book(){}
	public Book(String name,Publisher publisher) {
		this.name=name;
		this.publisher=publisher;
	}
}
class Literature extends Book{
	String Lit_type="Literature";
	Literature (String name,Publisher Publisher){
		super(name,Publisher);}
	void display() {
		System.out.println("Name:"+super.name);
		System.out.println("Type:"+this.Lit_type);
		System.out.println("Publisher:"+this.publisher.publisher);
		
	}
}
class Fiction extends Book{
	String Lit_type="fiction";
	Fiction(String name,Publisher Publisher){
		super(name,Publisher);}
	
		void display() {
			System.out.println("Name:"+super.name);
			System.out.println("Type:"+this.Lit_type);
			System.out.println("Publisher:"+this.publisher.publisher);
	}
		
	}
public class InheritanceBook {
	public static void main(String [] args) {
		Publisher lp=new Publisher("S.Shand");
		Literature l=new Literature("as you likeit",lp);	
		l.display();
		Publisher fp=new Publisher("Tata Mc Graw Hill");
		Fiction f=new Fiction("Tempest" , fp);
		f.display();}}
		


