package figures;

public class Rectangle implements FigureRec {
	private double length;
	private double width;
	public Rectangle(double l,double w) {
		length=l;
		width=w;
	}
	public double perimeter() {
		return (2*(length+width));
	}
	public double area() {
		return (length*width);
	}
	
}

