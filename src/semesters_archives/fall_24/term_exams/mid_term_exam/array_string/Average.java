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

package semesters_archives.fall_24.term_exams.mid_term_exam.array_string;

import java.util.Scanner;

/*
    Question:

    A teacher wants to evaluate the performance of students based on their marks. Instead of calculating the average marks for the entire section, the teacher is interested in finding the maximum average marks for the entire section, the teacher is interested in finding the maximum average marks among some groups of k consecutive students. Given an array of student's marks and a value k, write a Java program that calculates and prints the maximum average among groups of k consecutive student's marks. You code should work for any given array of positive integers.

    [NOTE: You can assume the value of k will always be less than the length of the array]

    Sample Input 1:
    int[] marks = { 12, 15, 20, 17, 20, 13 };
    Enter value of k: 4

    Explanation:
        (12 + 15 + 20 + 17) / 4 = 16.0
        (15 + 20 + 17 + 20) / 4 = 18.0
        (20 + 17 + 20 + 13) / 4 = 17.5
        Among 16.0, 18.0 and 17.5, 18.0 is the maximum average.

    Sample Output 1:
    Max Avg:
    18.0

    Sample Input 2:
    int[] marks = { 13, 11, 19, 17, 16, 15, 18, 11 };
    Enter value of k: 7

    Explanation:
        (13 + 11 + 19 + 17 + 16 + 15 + 18) / 7 = 15.57
        (11 + 19 + 17 + 16 + 15 + 18 + 11) / 7 = 15.28
        Among 15.57 and 15.28, 15.57 is the maximum average.

    Sample Output 2:
    Max Avg:
    15.57
*/

public class Average {
    static void calc(int[] marks, int k) {
        if (k > marks.length) {
            System.out
                    .println(
                            "Error: Number of students in a group cannot exceed the total number of students in the class.");
        } else {
            int groups = (marks.length - k) + 1;
            double max = 0;

            for (int i = 0; i < groups; i++) {
                int sum = 0;

                for (int j = i; j < (i + k); j++) {
                    sum += marks[j];
                }

                double avg = sum / (double) k;

                if (i == 0) {
                    max = avg;
                } else {
                    if (avg > max) {
                        max = avg;
                    }
                }
            }

            System.out.printf("Max Avg:\n%.2f\n", max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks2 = { 13, 11, 19, 17, 16, 15, 18, 11 };

        System.out.println("Enter the number of students in each group:");
        int k2 = sc.nextInt();

        calc(marks2, k2);
        sc.close();
    }
}