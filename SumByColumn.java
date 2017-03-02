/* Exercise 8.1
 * (Sum elements column by column) Write a method that returns the sum of all the 
 * elements in a specified column in a m using the following header:
 * public static double sumColumn(double[][] matrix, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column. 
 */
import java.util.Scanner;
public class SumByColumn {
	public static void main(String[] args) {
		// Get an array
		double[][] matrix = getArray();

		// Display results passing the array
		for (int i = 0; i < matrix[0].length; i++) {		
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
			}
	}
	// getArray method
	public static double[][] getArray() {
		// Create scanner
		Scanner input = new Scanner(System.in);
		// Enter array values
		double[][] matrix = new double[3][4];
		System.out.print("Enter a " + matrix.length + "-by-" + matrix[0].length + " matrix row by row: ");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		return matrix;
	}
	// Calculate sum of all elements in a specified column
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int rowIndex = 0; rowIndex < m.length; rowIndex++) {
				total += m[rowIndex][columnIndex];
		}
		return total;
	}
}

	