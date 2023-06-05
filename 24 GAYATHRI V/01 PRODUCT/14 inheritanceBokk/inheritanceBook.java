package gayathri;
class publisher{
	String publisher;
	Book () {}
	publisher (String publi){
		this.publisher=publi;}}
class Book{
	String name;
	publisher publisher;
	Book (){}
	public Book (String name, publisher publisher) {
		this.name=name;
		this.publisher=publisher;}}
class literature extends Book{
	String Lit_type="Literature";
	literature (String name,publisher publisher){
		super(name,publisher);
	
	}
	void display() {
		System.out.println("name:"+super.name);
		System.out.println("type: "+this .Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);
		}
}
class fiction extends Book {
	String Lit_type="fiction";
	fiction (String name , publisher publisher ){
		super (name,publisher);
	}
	void display () {
		System.out.println("name:super.name");
		System.out.println("type: "+this .Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);
	}
}
public class inheritanceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publisher ip=new publisher("s.chand");
		literature l=new literature("as you like it",ip);
		l.display();
		publisher fp=new publisher ("tata mcgrraw hill");
		fiction f=new fiction ("tempset",fp);
		f.display();
		

	}

}
