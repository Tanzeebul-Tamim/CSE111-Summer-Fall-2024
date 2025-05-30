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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_1;

/*
    For a smart diagnosis system, you need to write a java program to support the diagnosis from patients symptoms - which may repeat. Now, you were told that the most significant symptom is the one that occurs the most.

    Now, Write a java code that takes an input number N, then takes N lines of strings afterwards, which are the actual symptoms and outputs the most recurring symptom. If multiple correct outputs are possible, make sure your code outputs any one.

    Sample Input 1:
    6
    Headache
    Nausea
    Tiredness
    Nausea
    Itching
    Weakness


    Sample Output 1:
    The most recurring symptom is the Nausea.

    Explanation 1:
    Of the given symptoms, Nausea occurs twice while all the other symptoms occur once.

    Sample Input 2:
    7
    Sneezing
    Headache
    Sneezing
    Fever
    Headache
    Nausea
    Headache


    Sample Output 2:
    The most recurring symptom is the Headache.

    Explanation 2:
    Of the given symptoms, Headache occurs three times, and sneezing occurs twice while all the other symptoms occur once.
*/

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of symptoms:");
        int N = sc.nextInt();
        sc.nextLine();

        String[] symptoms = new String[N];

        System.out.println("\nEnter the symptoms:");
        for (int i = 0; i < N; i++) {
            symptoms[i] = sc.nextLine();
        }

        String mostRecurringSymptom = null;
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            String currentSymptom = symptoms[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (symptoms[j].equals(currentSymptom)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostRecurringSymptom = currentSymptom;
            }
        }

        System.out.printf("\nThe most recurring symptom is the %s.\n", mostRecurringSymptom);
        sc.close();
    }
}
