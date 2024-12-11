package semesters_archives.summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task7 {
    static int calculateTerm(int n) {
        if (n <= 1) {
            return n;
        }

        return calculateTerm(n - 1) + calculateTerm(n - 2);
    }

    // Print method for TASK A
    static void printSequence(int n) {
        for (int i = 1; true; i++) {
            int term = calculateTerm(i);

            if (term > n) {
                break;
            }

            System.out.format("%d ", term);
        }
        System.out.println();
    }

    // Print method for TASK B
    static void printSequenceWithSum(int n) {
        int sum = 0;

        for (int i = 1; true; i++) {
            int term = calculateTerm(i);

            if (term > n) {
                break;
            }

            sum += term;

            System.out.format("%d ", term);
        }

        System.out.printf("\nSum = %d", sum);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Executing TASK A
        System.out.println("TASK A");
        System.out.println("Enter the maximum number to display the Fibonacci sequence up to: ");
        int n1 = sc.nextInt();

        while (n1 <= 0) {
            System.out.println("\nInvalid input! Please enter a positive number.");
            n1 = sc.nextInt();
        }

        printSequence(n1);

        System.out.println();

        // Executing TASK B
        System.out.println("TASK B");
        System.out.println("Enter the maximum number to display the Fibonacci sequence up to along with their sum: ");
        int n2 = sc.nextInt();

        while (n2 <= 0) {
            System.out.println("\nInvalid input! Please enter a positive number.");
            n2 = sc.nextInt();
        }

        printSequenceWithSum(n2);

        sc.close();
    }
}