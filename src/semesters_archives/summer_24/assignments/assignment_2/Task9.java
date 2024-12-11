package semesters_archives.summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task9 {
    // Method for TASK A
    static int getDigitCount(int num) {
        int digitCount = 0;
        while (num > 0) {
            num /= 10;
            digitCount++;
        }

        return digitCount;
    }

    // Method for TASK B using method of TASK A
    static void encryptInteger(int num) {
        int digitCount = getDigitCount(num);

        for (int i = digitCount; i >= 1; i--) {
            int digit = num / (int) Math.pow(10, i - 1);
            int encryptedDigit = digit * 7;
            num %= (int) Math.pow(10, i - 1);
            System.out.print(encryptedDigit + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Executing TASK A
        System.out.println("TASK A");
        System.out.println("Enter an integer:");
        int userInput1 = sc.nextInt();
        System.out.printf("%d digits", getDigitCount(userInput1));

        System.out.println("\n");

        // Executing TASK B
        System.out.println("TASK B");
        System.out.println("Enter an integer:");
        int userInput2 = sc.nextInt();
        encryptInteger(userInput2);

        sc.close();
    }
}