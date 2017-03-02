/* Exercise 6.5
 * (Sort three numbers) Write a method with the following header to display three
 * numbers in increasing order:
 * public static void displaySortedNumbers(
 * double num1, double num2, double num3
 * Write a test program that prompts the user to enter three numbers and invokes the
 * method to display them in increasing order.
 */
import java.util.Scanner;

public class SortThree {
	public static void main(String[] args) {
		
		// Create scanner and prompt the user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Type three numbers with a space or return betwwen each entry: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);
	}
	
	// Method for sorting numbers in increasing and decreasing order
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
			}
		if (num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
			}
		
		// Printing results in increasing and decresing order
		System.out.print("Numbers in increasing order: " + num1 + " " + num2 + " " + num3+ "\n");
		System.out.println("\nNumbers in decreasing order: " + num3 + " " + num2 + " " + num1 + "\n");
	}
}
