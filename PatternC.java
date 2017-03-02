/* (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs : PaternB 6x6 matrix
 */
public class PatternC {
    public static void main(String[] args) {
    	
        // Display a 6x6 matrix in reverse order
        for (int i = 1; i <= 6; i++)    {
            for (int j = 1; j <= 6 - i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <=  i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}




