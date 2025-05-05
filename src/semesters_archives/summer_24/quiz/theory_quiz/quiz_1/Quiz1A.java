/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
