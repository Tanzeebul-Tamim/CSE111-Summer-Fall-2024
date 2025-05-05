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

package semesters_archives.summer_24.assignments.assignment_3.array;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] smallestAndLocation = { 0, 0 };
        int[] largestAndLocation = { 0, 0 };
        boolean firstIteration = true;

        for (int i = 0; i < 5; i++) {
            int num = arr[i];

            if (firstIteration) {
                smallestAndLocation[0] = num;
                smallestAndLocation[1] = i;

                largestAndLocation[0] = num;
                largestAndLocation[1] = i;

                firstIteration = false;
            } else {
                if (num < smallestAndLocation[0]) {
                    smallestAndLocation[0] = num;
                    smallestAndLocation[1] = i;
                }

                if (num > largestAndLocation[0]) {
                    largestAndLocation[0] = num;
                    largestAndLocation[1] = i;
                }
            }
        }

        System.out.printf("\nThe largest number %d was found at location %d.\n", largestAndLocation[0],
                largestAndLocation[1]);
        System.out.printf("The smallest number %d was found at location %d.\n", smallestAndLocation[0],
                smallestAndLocation[1]);
    }
}