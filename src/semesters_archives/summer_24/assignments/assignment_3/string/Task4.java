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

package semesters_archives.summer_24.assignments.assignment_3.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        ArrayList<String> inputWords = new ArrayList<>();

        System.out.println("Enter a word in small letters:");

        checkDuplicate: do {
            flag = false;
            String userInput = sc.next();

            for (String inputWord : inputWords) {
                if (inputWord.equals(userInput)) {
                    System.out.printf("%s has already been input.\nPlease enter another word.\n", userInput);
                    flag = true;
                    continue checkDuplicate;
                }
            }

            inputWords.add(userInput);

            char[] dupLetters = new char[userInput.length()];
            checkDupLetters: for (int i = 0; i < userInput.length(); i++) {
                char currentLetter = userInput.charAt(i);

                if (i != 0) {
                    for (char dupLetter : dupLetters) {
                        if (dupLetter == currentLetter) {
                            continue checkDupLetters;
                        }
                    }
                }

                int count = 1;
                for (int j = i + 1; j < userInput.length(); j++) {
                    char iteratedLetter = userInput.charAt(j);
                    if (currentLetter == iteratedLetter) {
                        count++;
                    }
                }

                if (count > 1) {
                    dupLetters[i] = currentLetter;
                    flag = true;
                    System.out.printf("\"%s\" has been counted %d times in the word \"%s\".\n", currentLetter,
                            count,
                            userInput);
                }
            }

            if (flag) {
                System.out.println("Please enter another word.");
            } else {
                System.out.printf("You entered %s.", userInput);
                sc.close();
                break;
            }
        } while (flag);
    }
}