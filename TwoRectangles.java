package c3;

/* Exercise 3.28 page 115
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first.
 * Test your program to cover all cases
 * (a) A rectangle is inside another one. (b) A rectangle overlaps another one.
 */
import java.util.Scanner;

public class TwoRectangles {
 public static void main(String[] args) { 
	 // Create Scanner
	 Scanner input = new Scanner(System.in);
	 
	 // Users enters dimensions of rectangle 1
	 System.out.print("Enter x-coordinates of rectangle 1:");
	 double rectangle1x = input.nextDouble();
	 System.out.print("Enter y-coordinates of rectangle 1:");
	 double rectangle1y = input.nextDouble();
	 System.out.print("Enter width of rectangle 1:");
	 double rectangle1w = input.nextDouble();
	 System.out.print("Enter height of rectangle 1:");
	 double rectangle1h = input.nextDouble();
	 
	 // Users enters dimensions of rectangle 2
	 System.out.print("Enter x-coordinates of rectangle 2:");
	 double rectangle2x = input.nextDouble();
	 System.out.print("Enter y-coordinates of rectangle 2:");
	 double rectangle2y = input.nextDouble();
	 System.out.print("Enter width of rectangle 2:");
	 double rectangle2w = input.nextDouble();
	 System.out.print("Enter height of rectangle 2:");
	 double rectangle2h = input.nextDouble();
	 
	 // Calculate rectangles and display results
	 if ((Math.pow(Math.pow(rectangle2x - rectangle1x), .05) + rectangle2w / 2) <= rectangle1w / 2) &&
	 (Math.pow(Math.pow(rectangle2y -rectangle1y), .05) + rectangle1h /2 <= rectangle1w / 2) &&
	 (rectangle1h / 2 + rectangle2h /2 <= rectangle1h) &&
	 (rectangle1w / 2 + rectangle2w /2 <= rectangle1w);
	 else if ((rectangle1x + rectangle1w /2 >  rectangle2x + rectangle2w) || (rectangle1y + rectangle1h / 2> rectangle2y + rectangle2h))
		 System.out.print("Rectangle 2 is inside rectangle 1");
	 else
		 System.out.print("Rectangle 2 is not inside rectangle 1");
 }

}

