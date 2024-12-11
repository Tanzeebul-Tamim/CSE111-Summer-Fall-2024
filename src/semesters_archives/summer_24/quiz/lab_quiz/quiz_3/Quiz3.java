package semesters_archives.summer_24.quiz.lab_quiz.quiz_3;

/*
    Write a Java program that takes two integers as input from the user and determines which number has more odd digits.

    Sample Input 1:
    12345
    67890

    Sample Output 1:
    12345 has more odd digits.

    Sample Input 2:
    123
    456

    Sample Output 2:
    Both numbers have the same number of odd digits.
*/

import java.util.Scanner;

public class Quiz3 {
    static int digitCounter(int num) {
        int digitCount = 0;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            if (digit % 2 != 0) {
                digitCount++;
            }
        }

        return digitCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int digitCount1 = digitCounter(num1);
        int digitCount2 = digitCounter(num2);

        System.out.println();

        if (digitCount1 == digitCount2) {
            System.out.println("Both numbers have the same number of odd digits.");
        } else if (digitCount1 > digitCount2) {
            System.out.printf("%d has more odd digits.", num1);
        } else {
            System.out.printf("%d has more odd digits.", num2);
        }

        sc.close();
    }
}
