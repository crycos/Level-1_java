/* Exercise 5.3
 *(Conversion from kilograms to pounds) Write a program that displays the follow-
 * ing table (note that 1 kilogram is 2.2 pounds):
 */
public class Weight_Conversion {
    public static void main(String[] args) {
    System.out.println("Kilograms   " + "   Pounds");

    // Generate and display the table
    for (int i = 1; i < 200; i += 2) {
        System.out.printf("%-10d%10.1f\n", i, (i * 2.2));

    }
    }
}


