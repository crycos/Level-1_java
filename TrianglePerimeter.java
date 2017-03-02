/* Exercise 3.19 page 111
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
* a triangle and computes the perimeter if the input is valid. Otherwise, display that
* the input is invalid. The input is valid if the sum of every pair of two edges is
* greater than the remaining edge.
*/

import java.util.Scanner;

public class TrianglePerimeter  {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 // Users enters triangle edges
	 System.out.print("Enter the first edge of the triangle:");
	 double edge1 = input.nextDouble();
	 System.out.print("Enter the second edge of the triangle:");
	 double edge2 = input.nextDouble();
	 System.out.print("Enter the third edge of the triangle:");
	 double edge3 = input.nextDouble();
	 
	 // Calcaulte edges and display results
	 if (edge1 > edge2 + edge3 || edge2 > edge1 + edge3 || edge3 > edge1 + edge2) {
		 System.out.print("The input is invalid");
	 } 
		 else
			 System.out.println("The input is valid, perimeter is " + (edge1 + edge2 + edge3));
	 }
	 }