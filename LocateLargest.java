/* Exercise 8.13
 * (Locate the largest element) Write the following method that returns the location
of the largest element in a two-dimensional array.
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These
two elements indicate the row and column indices of the largest element in the
two-dimensional array. Write a test program that prompts the user to enter a two-
dimensional array and displays the location of the largest element in the array
 */
import java.util.Scanner;
public class LocateLargest {
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		// Request user input
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] matrix = new double[row][column];
		
		System.out.print("Enter the array: ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				matrix[i][j] = input.nextDouble();
		// Print results
		int[] loc = locateLargest(matrix);
		System.out.println("he location of the largest element is at " + "(" + loc[0] +", " + loc[1] + ")");
	}
	// Create location method
	public static int[] locateLargest(double[][] a) {
		int[] loc = new int[] {0 ,0};
		double maximum = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maximum) {
					loc[0] = i;
					loc[1] = j;
					maximum = a[i][j];
				}
			}
			
		}
		return loc;
	}
}

