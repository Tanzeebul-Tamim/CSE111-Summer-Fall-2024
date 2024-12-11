package summer_24.quiz.theory_quiz.quiz_1;

/*
    Write a java program that reads an input number N, then calculates X from the following formula:
    X(N) = 1^2 + 2^3 + 3^2 + 4^3 + 5^2 + 6^3 + .... + N^[?]
    Then, display the terms for X for for N - 1, N - 2 and so on (X(N - 1), X(N - 2), etc.)

    Sample Input 1:
    3

    Sample Output 1:
    18
    9
    1
    
    Explanation for (n = 3):
    For i = 3: 1^2 + 2^3 + 3^2 = 18
    For i = 2: 1^2 + 2^3 = 9
    For i = 1: 1^2 = 1

    Sample Input 2:
    6

    Sample Output 2:
    323
    107
    82
    18
    9
    1

    Explanation for (n = 6):
    For i = 6: 1^2 + 2^3 + 3^2 + 4^3 + 5^2 + 6^3 = 323
    For i = 5: 1^2 + 2^3 + 3^2 + 4^3 + 5^2 = 107
    For i = 4: 1^2 + 2^3 + 3^2 + 4^3 = 82
    For i = 3: 1^2 + 2^3 + 3^2 = 18
    For i = 2: 1^2 + 2^3 = 9
    For i = 1: 1^2 = 1
 */

import java.util.Scanner;

public class Quiz1B {
    static int formula(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (int) Math.pow(i, 3);
            } else {
                sum += (int) Math.pow(i, 2);
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
