/* Exercise 5.20
 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 * per line. Numbers are separated by exactly one space
 */
public class PrimeNumbers {
	public static void main(String[] args) {
		// Calculating prime numbers between 2 and 1000
		int count = 0;
		int i = 2;
            while (i <= 1000) {
        	boolean prime = true;
        
        // Logic for prime numbers
        for (int j = 2; j <= i / 2; j++) {
          if (i % j == 0) { 
        	  prime = false;
            break; 
          }
        }

        // Display results
        if (prime) {
          if (count%8 == 0) {
            System.out.println(i);
          }
          else
            System.out.print(i + " ");
       count++; 
        }
       i++;
      }
    }
  }
