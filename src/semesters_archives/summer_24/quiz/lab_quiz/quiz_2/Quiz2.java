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

package semesters_archives.summer_24.quiz.lab_quiz.quiz_2;

/*
    Write a Java program that takes a string input from the user and converts the first character of each sentence
    that starts with a lowercase letter to uppercase. Other characters in the string should remain unchanged.
    Sentences are considered to end with one of the punctuation marks: '.', '?', or '!' followed by a space or the end of the string.

    Sample Input 1:
    hello world. how are you? i'm fine!

    Sample Output 1:
    Hello world. How are you? I'm fine!

    Sample Input 2:
    this is a test! let's see if it works.

    Sample Output 2:
    This is a test! Let's see if it works.
*/

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = sc.nextLine();

        int a = (int) ('a');
        int A = (int) ('A');
        int diff = A - a;
        int periodIdx = 0;

        for (int i = 0; i < userInput.length(); i++) {
            char letter = userInput.charAt(i);
            int ascii = (int) letter;

            if (letter == '.' || letter == '?' || letter == '!') {
                periodIdx = i;
            }

            if ((i == 0 || i == periodIdx + 2) && (ascii >= a && ascii <= a + 25)) {
                char newChar = (char) (ascii + diff);
                System.out.print(newChar);
            } else {
                System.out.print(letter);
            }
        }

        sc.close();
    }
}
