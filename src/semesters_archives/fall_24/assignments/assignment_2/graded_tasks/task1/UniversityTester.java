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

package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task1;

public class UniversityTester {
    public static void main(String[] args) {
        // TASK A
        University uni1 = new University();
        University uni2 = new University();

        System.out.println(uni1);
        System.out.println(uni2);

        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        System.out.println("Are the locations same? -> " + (uni1 == uni2));

        // TASK B
        uni1.name = "Imperial College London";
        uni1.country = "England";

        uni2.name = "Brac University";
        uni2.country = "Bangladesh";

        // The instance variables of both objects has been changed to newly assigned
        // values
        System.out.println(uni1.name);
        System.out.println(uni1.country);

        System.out.println(uni2.name);
        System.out.println(uni2.country);

        boolean checkNameSimilarity = uni1.name.equals(uni2.name);
        boolean checkCountrySimilarity = uni1.country.equals(uni2.country);

        System.out.println("Are the names same? -> " + checkNameSimilarity);
        System.out.println("Are the countries same? -> " + checkCountrySimilarity);
    }
}
