/* Exercise 5.11
 * (Find numbers divisible by 5 or 6, but not both) Write a program that displays
 * all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
 * both. Numbers are separated by exactly one space.
 */

public class FiveOrSix {
	public static void main(String[] args) {
		
		// Calculate division of 100 to 200 by 5 or by 6
		int count = 0;
        for (int i = 100; i <= 200; i++) {
        	if (i % 5 == 0 || i % 6 == 0) {
        		count++;
        		
        		// Print results in 10 column matrix form
        		System.out.print((count % 10 != 0) ? i + " " : i + "\n" );
            }
        }
	}
}

	

	
