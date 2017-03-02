/*Exercise 9.1
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
-Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height .
- A no-arg constructor that creates a default rectangle.
- A constructor that creates a rectangle with the specified width and height .
- A method named getArea() that returns the area of this rectangle.
- A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9 . Display the width, height, area,
and perimeter of each rectangle in this order
 */
// import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		// Rectangle objects—one with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("Rectangle 1 with width " + rectangle1.width + " and height " + rectangle1.height + 
				" has an area of " + rectangle1.getArea() + " and a perimeter of " + rectangle1.getPerimeter());
		
		// Rectangle objects—two with width 3.5 and height 35.
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle 2 with width " + rectangle2.width + " and height " + rectangle2.height + 
				" has an area of " + rectangle2.getArea() + " and a perimeter of " + rectangle2.getPerimeter());
	}
}

// The Rectangle clas
class Rectangle {
	double width;
	double height;
	// A no-arg constructor that creates a default rectangle.
	Rectangle() {
	width = 1;
	height = 1;
	}
	
	// A constructor that creates a rectangle with the specified width and height .
	Rectangle (double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
		
	// A method named getArea() that returns the area of this rectangle.
	double getArea() {
		return width * height;
	}
	
	// A method named getPerimeter() that returns the perimeter.
	double getPerimeter() {
		return width + +height + width + height;
	}
}

