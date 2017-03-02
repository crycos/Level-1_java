/* Exercise 7.1
 * (Assign grades) Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is >= best - 10
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best - 30;
 * Grade is D if score is >= best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 */
import java.util.Scanner;

public class Grading {
	// Line offered by Eclipse to fix the low warinng for input
	private static Scanner input;

	public static void main(String[] args) {
		// Create Scanner and request user input
		input = new Scanner(System.in);
		System.out.print("Enter the number of student: ");
		int numberStudents = input.nextInt();
		int [] scores = new int[numberStudents];
		int best = 0;
		char grade;
		
		System.out.print("Enter " + numberStudents +  "scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			if (best < scores[i]) {
				best = scores[i];
			}
		}
		
		// Calculate grade from a set of given grades
		char[] setGrade = {'A', 'B', 'C', 'D', 'F'};
		for (int i = 0; i < scores.length; i++){
			if (scores[i] >= best -10)
				grade = setGrade[0];
				else if (scores[i] >= best -20)
					grade = setGrade[1];
				else if (scores[i] >= best -30)
					grade = setGrade[2];
				else if (scores[i] >= best -40)
					grade = setGrade[3];
				else
					grade = setGrade[4];
			
			// Print results
			System.out.println("Student " + i  + " score is " + scores[i] + "  " + grade);
		}
	}
}



