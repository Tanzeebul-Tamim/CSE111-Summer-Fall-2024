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

package semesters_archives.fall_24.assignments.assignment_1.graded_tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, min = 0, max = 0, count = 0;

        for (int i = 1; i <= 10; i++) {
            String suffix = i == 1 ? "st" : i == 2 ? "nd" : i == 3 ? "rd" : "th";

            System.out.format("Enter the %d%s element:\n", i, suffix);
            int elem = sc.nextInt();
            System.out.println();

            if (elem % 2 != 0 && elem >= 0) {
                count++;

                if (i == 1) {
                    sum = elem;
                    min = elem;
                    max = elem;
                } else {
                    sum += elem;

                    if (elem < min) {
                        min = elem;
                    }
                    if (elem > max) {
                        max = elem;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No odd positive number found.");
        } else {
            double avg = (double) sum / count;

            System.out.format("Sum = %d\n", sum);
            System.out.format("Minimum = %d\n", min);
            System.out.format("Maximum = %d\n", max);
            System.out.format("Average = %.1f\n", avg);
        }

        sc.close();
    }
}
