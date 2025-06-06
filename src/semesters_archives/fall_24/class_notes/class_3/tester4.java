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

package semesters_archives.fall_24.class_notes.class_3;

import java.util.Arrays;
import java.util.Scanner; // Importing Scanner for user input

public class tester4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating Scanner object 's' to read input from console

        // Prompting user to input the number of students and storing it in 'studentNo'
        System.out.print("Number of students: ");
        int studentNo = s.nextInt();

        // Initializing a 2D array 'scores' to store quiz scores for each student
        // The rows represent students, and each student has 4 quiz scores (columns)
        double[][] scores = new double[studentNo][4];

        // Populating the 'scores' array with quiz scores for each student
        for (int i = 0; i < studentNo; i++) {
            for (int q_no = 0; q_no < 4; q_no++) {
                System.out.print("Student " + (i + 1) + ", quiz " + (q_no + 1) + ": ");
                scores[i][q_no] = s.nextDouble(); // Assigning inputted score to the respective student and quiz index

                // Sample mappings:
                // scores[0][0] = 1st student, 1st quiz
                // scores[0][1] = 1st student, 2nd quiz
                // scores[1][0] = 2nd student, 1st quiz
                // scores[1][1] = 2nd student, 2nd quiz
            }
        }

        // Displaying each student's quiz scores using Arrays.toString for readability
        for (int i = 0; i < studentNo; i++) {
            System.out.println("Student " + (i + 1) + ": " + Arrays.toString(scores[i]));
        }

        // Initializing an array 'max' to store the maximum score of each quiz across
        // all
        // students
        double[] max = new double[4];

        // Looping through each quiz to find the maximum score across all students
        for (int i = 0; i < studentNo; i++) {
            for (int q_no = 0; q_no < 4; q_no++) {
                if (i == 0) {
                    max[q_no] = scores[i][q_no]; // Initialize max array with the first student's scores
                }
                if (scores[i][q_no] > max[q_no]) {
                    max[q_no] = scores[i][q_no]; // Update max if current student's score is higher
                }
            }
        }

        // Displaying the highest score for each quiz
        System.out.println("Max Scores: " + Arrays.toString(max));
    }
}
