package packS;

class OverloadDemo {
	void area(float x){
		System.out.println("The area of square is "+Math.pow(x,2)+" sq units");}
	void area(float x,float y){
	System.out.println("The area of rectangle is "+x*y+" sq units");}
    void area(double x){
    	double z=3.14*x*x;
    	System.out.println("The area of the circle is "+z+" sq units");
    
	}

}
