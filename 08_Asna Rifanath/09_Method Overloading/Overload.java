package PackAsna;


class OverloadDemo {
	void area(float x) {
		System.out.println("The area of the square is "+Math.pow(x,2)+" sq units");}
	void area(float x,float y) {
		System.out.println("The area of rectangle is "+x*y+" sq units");}
	void area(double x) {
		double z = 3.14 * x * x;
		System.out.println("The are of the circle is "+z+" sq units"); }}

 class Overload {

	public static void main(String[] args) {
		OverloadDemo ob= new OverloadDemo();
		ob.area(5);
		ob.area(11,12);
		ob.area(2,5); }
		// TODO Auto-generated method stub

	}