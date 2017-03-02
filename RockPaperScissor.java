/* Exercise 3.17 page 111
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0 , 1 , or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0 , 1 , or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws. Here are sample runs
 */
	
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Generate random number from 0 to 2
		int computer = (int)(Math.random() * 3);
		
		// User enters a number from 0 to 2
		System.out.print("Enter 0 for scissor, 1 for rock, or 2 for paper: ");
		int user = input.nextInt();
		
		System.out.print("I am ");
		switch (computer) {
		case 0: System.out.print("scissor ");
		break;
		case 1: System.out.print("rock "); 
		break;
		case 2: System.out.print("paper "); 
		break;
		}
		
		// Show output
		if (computer == user)
			System.out.println("as well.");
		else {
			boolean winner = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
			if (winner)
				System.out.println(", you win!");
			else
				System.out.println(", so I win!");
		}
	}

	

}
