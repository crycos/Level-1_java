/* Exercise  9.6
 * (Stopwatch) Design a class named StopWatch . The class contains:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */
public class StopwatchTest {
	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
	
		// Create  random numbers
		double[] randomNumbers = new double[100000]; // Note: must be double due to selectionSort
		for  (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 100000);
		}
		selectionSort(randomNumbers);	
		stopwatch.stop(); 
		
		// Print results
		System.out.println("The execution time of sorting 100,000 numbers is: " + stopwatch.getElapsedTime() + " milliseconds.");
	}
		
		// Selection sort method found on page 270, Listing 7.8
		public static void selectionSort(double[] randomNumbers) {
			for (int i = 0; i < randomNumbers.length - 1; i++) {
				double currentMin = randomNumbers[i];
				int currentMinIndex = 1;
				
				for (int j = i + 1; j < randomNumbers.length; j++) {
					if (currentMin > randomNumbers[j]) {
						currentMin = randomNumbers[j];
						currentMinIndex = j;
					}
				}
				
				//  Swap list[i] with list[currentMinIndex] if necessary
				if (currentMinIndex != i) {
					randomNumbers[currentMinIndex] = randomNumbers[i];
					randomNumbers[i] = currentMin;
				}	
			}
		}
}

class StopWatch {
	// Private data fields startTime and endTime with getter methods.
	private long startTime;
	private long endTime;
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	
	// A no-arg constructor that initializes startTime with the current time.
	public StopWatch() {
	//public void startTime() { // auto correction to StopWatch
		startTime = System.currentTimeMillis();
	}
	
	// A method named start() that resets the startTime to the current time.
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	// A method named stop() that sets the endTime to the current time.
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	// A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
	public long getElapsedTime() {
		return endTime - startTime;
	}
}


