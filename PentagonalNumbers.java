/* Exercise 6.1
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3*n-1)/2 for
 * n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number
 */
public class PentagonalNumbers {
	public static void main(String[] args) {
		// Limit printing to 10 pentagonal numbers on each line
		final int PENTAGONALS_PER_LINE = 10;
		
		// Display pentagonal numbers from 1 to 100, based on the Pentagonal method
		System.out.println("Pentagonal numbers from 1 to 100 are: ");
		for (int i = 1 ; i <= 100; i++) {
			if (i % PENTAGONALS_PER_LINE == 0 )
				// Left aligning result in columns of 6 decimal integers including spcae 
				System.out.printf( "%-6d\n", getPentagonalNumber(i));
			else
				System.out.printf( "%-6d", getPentagonalNumber(i));
		}
	}
	
	// Pentagonal method
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
		}
}


