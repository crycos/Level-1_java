/* Exercvise 6.3 
 * (Palindrome integer) Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome . A number is a palin-
 * drome if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		// Create new scanner and prompt user of input
	       Scanner p = new Scanner(System.in);
	       System.out.print("Please enter a number: ");
	       int input = p.nextInt();
	       int number = reverse(input);
	       
		// Print numbers to user
		if (isPalindrome(number)) {
			System.out.print(number + " is palindrom\n");
		}
		else {
				System.out.print(number + " is not palindrom\n");
		}		
	}
	
	// Method for palindrom
	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}
	
	// Method for reversal of an integer
	public static int reverse(int n) {
	       int number = 0;
	       int rem;
	       while (n > 0) {
	           rem = n % 10;
	           n = n / 10;
	           number = number * 10 + rem;
	       }
	       return number;
	   }
}

