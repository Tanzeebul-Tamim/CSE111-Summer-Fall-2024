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

package semesters_archives.fall_24.class_notes.class_7.array_string;

import java.util.Scanner;

public class Task3 {
    private static void printGrades(String grade, int[] scores, int count) {
        if (count > 0) {
            System.out.print(grade + ": ");

            for (int i = 0; i < count; i++) {
                System.out.print(scores[i]);

                if (i < count - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalStudent = 5;
        int countA = 0, countB = 0, countC = 0, countF = 0;

        int[] gradeA = new int[totalStudent];
        int[] gradeB = new int[totalStudent];
        int[] gradeC = new int[totalStudent];
        int[] gradeF = new int[totalStudent];

        System.out.println("Enter the final marks of 5 students:");

        for (int i = 0; i < totalStudent; i++) {
            while (true) {
                int score = sc.nextInt();

                if (80 <= score && score <= 100) {
                    gradeA[countA++] = score;
                    break;
                } else if (65 <= score && score < 80) {
                    gradeB[countB++] = score;
                    break;
                } else if (50 <= score && score < 65) {
                    gradeC[countC++] = score;
                    break;
                } else if (0 <= score && score < 50) {
                    gradeF[countF++] = score;
                    break;
                } else {
                    System.out.println(
                            "Invalid marks! Valid marks range is 0 to 100. Please enter again:");
                }
            }
        }

        printGrades("A", gradeA, countA);
        printGrades("B", gradeB, countB);
        printGrades("C", gradeC, countC);
        printGrades("F", gradeF, countF);

        sc.close();
    }
}
