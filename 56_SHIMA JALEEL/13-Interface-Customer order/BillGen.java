package packA;                           
interface BillGen1{
	int calculate();}
class Product1B implements BillGen1{ 
	String name; 
	int prod_id, quantity, unit_price, total;
	 Product1B(){}
	 Product1B(String n, int p, int q, int u){
		 name = n; 
		 prod_id = p; 
		 quantity = q;
		 unit_price =u;
	 }
	 public int calculate(){
		 total = quantity* unit_price;
		 return total;}}