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

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] intArr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("\nEnter element no %d:\n", i + 1);
            intArr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the element you want to remove:");
        int numToRemove = sc.nextInt();

        int[] newIntArr = new int[N - 1];
        boolean found = false;
        for (int i = 0; i < intArr.length; i++) {
            int elem = intArr[i];

            if (elem == numToRemove) {
                found = true;
            } else {
                if (found) {
                    newIntArr[i - 1] = elem;
                } else if (i != intArr.length - 1) {
                    newIntArr[i] = elem;
                }
            }
        }

        System.out.println("\nInput array:");
        for (int i = 0; i < intArr.length; i++) {
            int elem = intArr[i];
            System.out.print(elem);

            if (i != intArr.length - 1) {
                System.out.print(" ");
            }
        }

        if (found) {
            System.out.println("\nNew array:");
            for (int i = 0; i < newIntArr.length; i++) {
                int elem = newIntArr[i];
                System.out.print(elem);

                if (i != intArr.length - 1) {
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("\nElement not found");
        }

        sc.close();
    }
}