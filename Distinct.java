/* Exercise 7.5
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one
 * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * Read a number and store it to an array if it is new. If the number is already in the
 * array, ignore it.) After the input, the array contains the distinct numbers. Here is
 * the sample run of the program
 */
//import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {
		// Create Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Declare and create the numebrs array
		int[] dNumbers = new int[10];
		int count = 0;
		// Request user input
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < dNumbers.length; i++) {
			int number = input.nextInt();
			
			if (unique(dNumbers, number)) {
				dNumbers[count] = number;
				count++;
			}
		}
		// Print results
		System.out.print("The number of distinct number is " + count + "\n");
		System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(dNumbers[i] + " ");
		}
	}
	// Method for identifying distinct numbers
	public static boolean unique(int[] dNumbers, int number) {
		for (int i : dNumbers) {
			if ( number == i) return false;
		}
		return true;
	}
}
