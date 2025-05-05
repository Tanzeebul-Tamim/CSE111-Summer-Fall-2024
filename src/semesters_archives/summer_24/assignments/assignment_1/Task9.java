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

package semesters_archives.summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your CGPA:");
        float cgpa = scanner.nextFloat();

        System.out.println();

        System.out.println("Enter the number of credits you've completed:");
        int credits = scanner.nextInt();

        scanner.close();

        System.out.println();

        if (credits >= 30 && cgpa >= 3.8f) {
            int waiver;

            if (cgpa >= 3.80f && cgpa <= 3.89f) {
                waiver = 25;
            } else if (cgpa >= 3.90f && cgpa <= 3.94f) {
                waiver = 50;
            } else if (cgpa >= 3.95f && cgpa <= 3.99f) {
                waiver = 75;
            } else {
                waiver = 100;
            }

            System.out.printf("The student is eligible for a waiver of %d percent\n", waiver);
        } else {
            System.out.println("The student is not eligible for a waiver.");
        }
    }
}
