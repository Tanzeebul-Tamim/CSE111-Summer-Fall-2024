package assignments.assignment_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();

        scanner.close();

        if (userInput % 2 == 0 && userInput % 5 == 0) {
            System.out.println("Multiple of 2 and 5 both");
        } else {
            if (userInput % 2 == 0 || userInput % 5 == 0) {
                System.out.println(userInput);
            } else {
                System.out.println("Not a multiple we want");
            }
        }
    }
}
