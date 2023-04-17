package programe9;

class OverLoadDemo{
	void area(float x) {
		System.out.println("The Area of the Square is "+Math.pow(x,2)+" sq Units");
	}
	void area(float x,float y) {
		System.out.println("The Area of the Rectangle is "+x*y+" sq Units");
	}
	void area (double x) {
		double z=3.14*x*x;
		System.out.println("The Area of the Circle is "+z+" sq Units");
	}
}


