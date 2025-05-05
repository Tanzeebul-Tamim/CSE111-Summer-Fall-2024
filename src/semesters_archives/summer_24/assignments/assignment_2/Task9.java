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