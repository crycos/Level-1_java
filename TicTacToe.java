/* Exercise 8.9

 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens (either
 * X or O). When one player has placed three tokens in a horizontal, vertical, or
 * diagonal row on the grid, the game is over and that player has won. A draw (no
 * winner) occurs when all the cells on the grid have been filled with tokens and
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alter-
 * nately. Whenever a token is entered, the program redisplays the board on the
 * console and determines the status of the game (win, draw, or continue).
 */
import java.util.Scanner;
public class TicTacToe {
	// Create scanner
	Scanner input = new Scanner(System.in);
	char[][] baord = new char[3][3];
	char player = 'X';
	char status;
	int row, column;
	
	displayBoard(board);
	while ((status = checkBoard(board)) == 'N') {
		
	}
	
	
	
	
	
	
	
	
	
	
    public static void printBoard() {
        System.out.println("-------------");		
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
	

}
