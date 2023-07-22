package figures;

public class Rectangle implements FigureRc {
private int length, width;
public Rectangle(int l, int w) {length = l;width =w;}
public int perimeter() {return(length+width)*2;}
public int area() {return(length*width);}
}
