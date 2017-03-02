/* Exercise 9.9
 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides 
 * have the same length and all angles have the same degree (i.e., the polygon is
 * both equilateral and equiangular). Design a class named RegularPolygon that
 * contains:
 * - A private int data field named n that defines the number of sides in the polygon with default value 3
 * - A private double data field named side that stores the length of the side with default value 1 .
 * - A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0 .
 * - A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0 .
 * - A no-arg constructor that creates a regular polygon with default values.
 * - A constructor that creates a regular polygon with the specified number of sides and length of side, centered at ( 0 , 0 ).
 * - A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
 * - The accessor and mutator methods for all data fields.
 * - The method getPerimeter() that returns the perimeter of the polygon.
 * - The method getArea() that returns the area of the polygo  
 * 
 * Write a test program that creates three RegularPolygon objects, created using the no-arg
 * constructor, using RegularPolygon(6, 4) , and using RegularPolygon(10, 4, 5.6, 7.8) . 
 * For each object, display its perimeter and area.
 */
public class NPolygonTest {
	public static void main(String[] args) {
	RegularPolygon polygon1 = new RegularPolygon(6, 4);
	System.out.println("RegularPolygon 1 with " + polygon1.getN() + " sides of length " + polygon1.getSide() + 
			" has an area of " + polygon1.getArea() + " and a perimeter of " + polygon1.getPerimeter());
	
	RegularPolygon polygon2 = new RegularPolygon(10,4, 5.6, 7.8);
	System.out.println("RegularPolygon 2 with " + polygon2.getN() + " sides of length " + polygon2.getSide() + 
			", X-coordinate of " + polygon2.getX() + ", and Y-coordinates of " + polygon2.getY() +
			", has an area of " + polygon2.getArea() + " and a perimeter of " + polygon2.getPerimeter());
	}
}

class RegularPolygon {
	// A private int data field named n that defines the number of sides in the polygon with default value 3
	private int n;
	
	// A private double data field named side that stores the length of the side with default value 1 .
	private double side;
	
	// 	A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0 
	private double x;
	
	// A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0 .
	private double y;
	
	// A no-arg constructor that creates a regular polygon with default values.
	RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	// A constructor that creates a regular polygon with the specified number of sides and length of side, centered at ( 0 , 0 ).
	RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		x = 0;
		y = 0;
	}
	
	// A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
	public RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	// The accessor and mutator methods for all data fields.
	public void setN(int newN) {		
		n = newN;
	}
	public void setSide(double newSide) {
		side = newSide;
	}
	public void setX(double newX) {
		x = newX;
	}
	public void setY(double newY) {
		y = newY;
	}
	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	// The method getPerimeter() that returns the perimeter of the polygon.
	public double getPerimeter() {
		return n * side;
	}
	
	// The method getArea() that returns the area of the polygo
	public double getArea() {
		return (n * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI / n));
	}
}