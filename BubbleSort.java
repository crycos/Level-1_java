/* Exercise 7.18
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubble-
sort algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped;
otherwise, the values remain unchanged. The technique is called a bubble sort or
sinking sort because the smaller values gradually “bubble” their way to the top
and the larger values “sink” to the bottom. Write a test program that reads in ten
double numbers, invokes the method, and displays the sorted numbers
 */
public class BubbleSort {
	public static void main(String[] args) {
		double myList[] = new double[10];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = Math.random() * 10;
		}
		bubbleSort(myList);
        for (double e: myList) {
        	System.out.print("\nSorted numbers " + e + " ");
    }
	}
	// Creating the bubbleSort method
	public static void bubbleSort(double[] bubble) {
		double temp;
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i < bubble.length -1; i++) {
				if (bubble[i] > bubble[i + 1]) {
					temp = bubble[i];
					bubble[i] = bubble[i + 1];
					bubble[i + 1] = temp;
					swap = true;
				}
			}
		}
		while (swap);
	}
}
