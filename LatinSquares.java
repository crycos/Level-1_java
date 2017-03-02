/* Exercise 8.36
 * (Latin square) A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column. 
 * Write a program that prompts the user to enter the number n and the array of characters, as shown in the sample output, and checks if the input array 
 * is a Latin square. The characters are the first n characters starting from A
 * 
 */
import java.util.Scanner;
public class LatinSquares {
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.print("Enter number n: ");
		int n = input.nextInt();

		System.out.print("Enter " + n + " rows of letters separated by spaces: ");
		char[][] matrix = new char[n][n];
		for  (int i = 0; i < n; i++) {
			String letter = input.nextLine();
			
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++ )
				matrix[i][j] = input.next().charAt(0);
		}
	}
	
	public static void isLatinSquare(char[][] matrix) {
		
		
		// Create matrix
	}

}
