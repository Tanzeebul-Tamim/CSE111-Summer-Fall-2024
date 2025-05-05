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

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("\nEnter the number of columns: ");
        int col = sc.nextInt();

        int[][] twoD = new int[row][col];
        int[] oneD = new int[row * col];

        for (int i = 0; i < row; i++) {
            String rowSuffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            for (int j = 0; j < col; j++) {
                String colSuffix = j == 0 ? "st" : j == 1 ? "nd" : j == 2 ? "rd" : "th";
                int oneDIndex = col * i + j;

                System.out.printf("\nEnter value for %d%s row, %d%s column:\n", i + 1, rowSuffix, j + 1, colSuffix);
                int input = sc.nextInt();

                twoD[i][j] = input;
                oneD[oneDIndex] = input;
            }
        }

        System.out.println("\n2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoD[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\n1D Array:");
        for (int i = 0; i < row * col; i++) {
            System.out.print(oneD[i] + " ");
        }

        sc.close();
    }
}
