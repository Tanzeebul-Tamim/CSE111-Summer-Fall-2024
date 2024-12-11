package semesters_archives.summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int userInput = scanner.nextInt();

        if (userInput % 5 == 0 && userInput % 7 == 0) {
            System.out.println("\nDivisible by Both");
        } else {
            if (userInput % 5 == 0) {
                System.out.println("\nInvalid: Divisible by 5 Only");
            } else if (userInput % 7 == 0) {
                System.out.println("\nInvalid: Divisible by 7 Only");
            } else {
                System.out.println("\nNo");
            }
        }

        scanner.close();
    }
}