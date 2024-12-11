package semesters_archives.summer_24.quiz.theory_quiz.quiz_1;

/*
    Write a java program that reads an input number N, then calculates X from the following formula:
    X(N) = 1^3 + 2^2 + 3^3 + 4^2 + 5^3 + 6^2 + .... + N^[?]
    Then, display the terms for X for for N - 1, N - 2 and so on (X(N - 1), X(N - 2), etc.)

    Sample Input 1:
    3

    Sample Output 1:
    32
    5
    1
    
    Explanation for (n = 3):
    For i = 3: 1^3 + 2^2 + 3^3 = 32
    For i = 2: 1^3 + 2^2 = 5
    For i = 1: 1^3 = 1

    Sample Input 2:
    6

    Sample Output 2:
    209
    173
    48
    32
    5
    1

    Explanation for (n = 6):
    For i = 6: 1^3 + 2^2 + 3^3 + 4^2 + 5^3 + 6^2 = 209
    For i = 5: 1^3 + 2^2 + 3^3 + 4^2 + 5^3 = 173
    For i = 4: 1^3 + 2^2 + 3^3 + 4^2 = 48
    For i = 3: 1^3 + 2^2 + 3^3 = 32
    For i = 2: 1^3 + 2^2 = 5
    For i = 1: 1^3 = 1
 */

import java.util.Scanner;

public class Quiz1A {
    static int formula(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (int) Math.pow(i, 2);
            } else {
                sum += (int) Math.pow(i, 3);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println();

        for (int i = n; i >= 1; i--) {
            int result = formula(i);
            System.out.println(result);
        }

        sc.close();
    }
}
