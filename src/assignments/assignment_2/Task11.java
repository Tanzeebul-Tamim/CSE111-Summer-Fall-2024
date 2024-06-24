package assignments.assignment_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int userInput = sc.nextInt();
        sc.close();

        // TASK A
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // TASK B
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}