/* Exercise 3.1 page 131
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax 2 + bx + c = 0 can be obtained using the following formula:
 * r 1 = -b + 2b 2 - 4ac 2a
 * and r 2 = -b - 2b 2 - 4ac 2a
* b 2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
* equation has two real roots. If it is zero, the equation has one root. If it is negative,
* the equation has no real roots.
* Write a program that prompts the user to enter values for a, b, and c and displays
* the result based on the discriminant. If the discriminant is positive, display two
* roots. If the discriminant is 0 , display one root. Otherwise, display “The equation
* has no real roots”.
* Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
* sample runs
 */
import java.util.Scanner;

public class Discriminant {
	public static void main(String[] args) {	
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// User enters for a
		System.out.print("Enter value of a: ");
		double a = input.nextDouble();
		
		// User enters value for b
		System.out.print("Enter value of b: ");
		double b = input.nextDouble();
		
		// User enters value for c
		System.out.print("Enter value of c: ");
		double c = input.nextDouble();
	
		// Calculate descriminant
		double descriminant = Math.pow(b,2) -4 * a * c;
		
		// Calculate roots
		System.out.print("The equation has ");
		if (descriminant > 0) {
			double root1 = (-b + Math.pow(descriminant, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(descriminant, 0.5)) / (2 * a);
			System.out.println("two roots: " + root1 + "and " + root2);
		}
		else if (descriminant == 0) {
			double root1 = (-b + Math.pow(descriminant, 0.5)) / (2 * a);
			System.out.println("only one root " + root1);
			}
		else 
			System.out.println("no real roots");
	}
}
