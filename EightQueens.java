/* Exercise 7.22
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
on a chessboard such that no two queens can attack each other (i.e., no two queens
are on the same row, same column, or same diagonal). There are many possible
solutions. Write a program that displays one such solution. A sample output is
shown below:
 * 
 * Note that this can be done with a single dimensional array.
 */
public class EightQueens {
	public static void main(String[] args) {
		// Board has 64 cells, 8 horizontal and 8 vertical
		boolean[] board = new boolean[64];
		int queen = 0;
		// Random position 
		while (queen < 8) {
			int position = intRandom(0, board.length - 1);
			// Verifying queen position
			if (checkPosition(position, board)) {
				board[position] = true;
			    queen++;
			   }
		}
		// Display the board
		for (int i = 0; i < board.length; i++) {
			if (board[i]) {
			    System.out.print("|Q");
			   } else {
			    System.out.print("| ");
			   }
			 
			   if ((i+1) % 8 == 0)
			    System.out.println("|");
			  }
	}
	public static int intRandom(int lowerBound, int upperBound) {
		return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
	}
	public static boolean checkPosition(int pos, boolean[] board) {
		return checkTop(pos, board) & checkBottom(pos, board) & checkLeft(pos, board) & checkRight(pos, board)
				& checkTopLeft(pos, board) & checkTopRight(pos, board) & checkBottomLeft(pos, board) & checkBottomRight(pos, board);
	}	 
	public static boolean checkTop(int i, boolean[] board) {
		// Top 
		if ((i - 8) > -1) {
			if (board[i - 8]) {
				return false;
			}
		}
		return true;
	} 
	public static boolean checkBottom(int i, boolean[] board) {
		// Bottom 
		if ((i + 8) < 64) {
			if (board[i + 8]) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkLeft(int i, boolean[] board) {
		// Left 
		if ((i - 1) > -1) {
			if (board[i - 1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkRight(int i, boolean[] board) {
		// Right 
		if ((i + 1) < 64) {
		   if (board[i + 1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkTopLeft(int i, boolean[] board) {
		if ((i - 9) > -1) {
			if (board[i - 9]) {
				return false;
			}
		}
		return true;
	}		 
	public static boolean checkTopRight(int i, boolean[] board) {
		if ((i - 7) > -1) {
			if (board[i - 7]) {
				return false;
			}
		}
		return true;
	}	 
	public static boolean checkBottomLeft(int i, boolean[] board) {
		if ((i + 7) < 64) {
			if (board[i + 7]) {
				return false;
			}
		}
		return true;
	} 
	public static boolean checkBottomRight(int i, boolean[] board) {
		  if ((i + 9) < 64) {
		   if (board[i + 9]) {
				return false;
			}
		}
		return true;
	} 
}
	
	