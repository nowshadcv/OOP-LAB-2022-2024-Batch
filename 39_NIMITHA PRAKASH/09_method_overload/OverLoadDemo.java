package packA;

class OverLoadDemo {
	void area(float x) {
		System.out.println("the area of square is:" +Math.pow(x, 2)+" sq units");
	}
	void area(float x, float y) {
		System.out.println("the area of rectangle is:"+x*y+" sq units");
	}
	void area(double x ) {
		double z = 3.14*x*x;
		System.out.println("the area of circle is:"+z+" sq units");
	}
}

