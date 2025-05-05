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

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[][] elemCounts = new int[N][2];

        for (int i = 0; i < N; i++) {
            System.out.printf("\nEnter element no %d:\n", i + 1);
            arr[i] = sc.nextInt();
        }

        int countUnique = 0;

        for (int i = 0; i < N; i++) {
            int currentElem = arr[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] == currentElem) {
                    count++;
                }
            }

            boolean alreadyInput = false;
            for (int j = 0; j < countUnique; j++) {
                if (elemCounts[j][0] == currentElem) {
                    alreadyInput = true;
                    break;
                }
            }

            if (!alreadyInput) {
                elemCounts[countUnique][0] = currentElem;
                elemCounts[countUnique++][1] = count;
            }
        }

        System.out.println();

        for (int i = 0; i < countUnique; i++) {
            int elem = elemCounts[i][0];
            int count = elemCounts[i][1];

            System.out.printf("%d - %d times\n", elem, count);
        }

        sc.close();
    }
}