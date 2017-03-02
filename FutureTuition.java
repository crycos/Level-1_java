import java.util.Scanner;

public class FutureTuition {
    public static void main(String[] args) {
    // Main Method
    Scanner input = new Scanner(System.in);
    double tuition = 1000;
    int year = 0;
    while (tuition <= 2000) {
        tuition = tuition * 1.07;
        year++;
    }
    
    System.out.println("\nTuition will double in " + year + " years");
    System.out.printf("\nTuition will be $%.2f in %1d years\n", tuition, year);
    }

}



