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

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[][] count = new int[N][2];

        for (int i = 0; i < N; i++) {
            String suffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i + 1, suffix);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int elem = arr[i];
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (count[j][0] == elem) {
                    count[j][1]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                count[i][0] = elem;
                count[i][1]++;
            }
        }

        System.out.println();

        for (int i = 0; i < count.length; i++) {
            if (count[i][0] != 0) {
                System.out.printf("%d - %d times\n", count[i][0], count[i][1]);
            }
        }

        sc.close();
    }
}
