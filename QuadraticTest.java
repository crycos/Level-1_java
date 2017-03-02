/* Exercise 9.10
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for 
 * a quadratic equation ax^2 + bx + x = 0. The class contains:
 * - Private data fields a , b , and c that represent three coefficients.
 * - A constructor for the arguments for a , b , and c .
 * - Three getter methods for a , b , and c .
 * - A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac.
 * - The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * r1 = (-b + sqrt(b^2 -4ac))/ 2a
 * r2 = (-b - sqrt(b^2 -4ac))/ 2a
 * These methods are useful only if the discriminant is nonnegative. Let these methods 
 * return 0 if the discriminant is negative.
 *  Write a test program that prompts the user to enter values for a, b, and c and displays the result
 *  based on the discriminant. If the discriminant is positive, display the two roots. If
 *  the discriminant is 0, display the one root. Otherwise, display "The equation has no roots."
 *  Test: 
 *  positive x^2 +6x + 5 = 0
 *  zero: x^2 - 2x +1 = 0
 *  negative: x^2 -3x +10 = 0
 *  
 */
import java.util.Scanner;
public class QuadraticTest {
	public static void main(String[] args) {
		// Create scanner and prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter values for the three data fields a, b, c: " );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation  quadtraticequation = new QuadraticEquation(a, b, c);
		double discriminant = quadtraticequation.getDiscriminant();
		// If the discriminant is positive, display the two roots. 
		if (discriminant > 0) {
			System.out.println("The equation with values a = " + quadtraticequation.getA()  + ", b = " + quadtraticequation.getB() + 
					", c = " + quadtraticequation.getC() + " has two real roots: r1 = " +  quadtraticequation.getRoot1() + 
					" and r2 = " + quadtraticequation.getRoot2());
		}
		// If the discriminant is 0, display the one root
		else if (discriminant == 0) {
				System.out.println("The equation with values a = " + quadtraticequation.getA()  + ", b = " + quadtraticequation.getB() + 
						", c = " + quadtraticequation.getC() + " has only one root r = " +  (quadtraticequation.getRoot2()));// || quadtraticequation.getRoot2()));
		}
		// Otherwise, display “The equation has no roots"
		else System.out.println("The equation has no roots");
	}
}

class QuadraticEquation {
	// Private data fields a , b , and c that represent three coefficient
	private double a, b, c;
	
	// A constructor for the arguments for a , b , and c
	public QuadraticEquation (double newA, double newB, double newC) {
		a = newA;
		b = newB;
		c = newC;
	}
	
	// Three getter methods for a , b , and c 
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	
	// A method named getDiscriminant() that returns the discriminant, which is b^2 - 4ac.
	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	// The methods named getRoot1() and getRoot2() for returning two roots of the equation
	public double getRoot1() {
		if (getDiscriminant() < 0 )
			return 0;
		else	{
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
		}
	}
	public double getRoot2() {
		if (getDiscriminant() < 0 )
			return 0;
		else	{
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
		}
	}	
}
