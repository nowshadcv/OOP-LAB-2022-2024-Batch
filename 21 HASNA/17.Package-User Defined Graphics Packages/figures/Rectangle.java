package figures;

public class Rectangle implements FigureRe {
	private int length,width ;
	public Rectangle(int l,int w) {length = l;width = w;}
	public int perimeter() {return (2*length+2*width);}
	public double area() { return (length*width);}}

