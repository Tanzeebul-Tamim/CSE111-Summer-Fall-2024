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

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int zeroCounter = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        boolean isFirstInput = true;

        for (int i = 0; true; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            int userInput = sc.nextInt();

            if (userInput == 0) {
                zeroCounter++;
            } else {
                zeroCounter = 0;
                sum += userInput;
                count++;

                if (isFirstInput) {
                    min = userInput;
                    max = userInput;
                    isFirstInput = false;
                } else {
                    if (userInput < min) {
                        min = userInput;
                    }

                    if (userInput > max) {
                        max = userInput;
                    }
                }
            }

            if (zeroCounter == 3) {
                break;
            }
        }

        if (count > 0) {
            double average = sum / (double) count;

            System.out.printf("\nSum = %d\n", sum);
            System.out.printf("Minimum = %d\n", min);
            System.out.printf("Maximum = %d\n", max);
            System.out.printf("Average = %.15f", average);
        } else {
            System.out.println("\nNo numbers found");
        }

        sc.close();
    }
}