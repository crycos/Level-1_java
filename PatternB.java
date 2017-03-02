/* (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs : PaternB 6x6 matrix
 */
public class PatternB {
    public static void main(String[] args) {
        //
        for (int i = 1; i <= 6; i++) {
        	for (int j = 1; j <= 7 - i; j++) {
        			System.out.print(j + " ");
        }
        System.out.println();
        }
}
}


