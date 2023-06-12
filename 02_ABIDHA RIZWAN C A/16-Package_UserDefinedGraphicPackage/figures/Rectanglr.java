package figures;

public class Rectanglr implements FigureRe {
	private double length,breadth;
	public Rectanglr(double l,double b) {
		length=l; breadth=b;}
	public double perimeter() {return(2*(length+breadth));}
	public double area() {return(length*breadth);}
}
