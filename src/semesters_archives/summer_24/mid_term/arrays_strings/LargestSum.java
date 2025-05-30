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

package semesters_archives.summer_24.mid_term.arrays_strings;

/*
    You are given an array of strings each containing a mix of letters, special characters, and digits. You need to write a Java program that calculates the sum of the digits contained in each string and output the largest sum along with the string that it came from.

    Sample Input:
    String[] input = {
        "a1b2@c3",
        "D4#e5F6",
        "g!H7i8%",
        "jK9$l0M",
        "N@1o2p3"
    };

    Sample Output:
    The maximum sum is 15 which came from the string D4#e5F6.

    Explanation:
    - For "a1b2@c3", the sum of digits is 1 + 2 + 3 = 6.
    - For "D4#e5F6", the sum of digits is 4 + 5 + 6 = 15.
    - For "g!H7i8%", the sum of digits is 7 + 8 = 15.
    - For "jK9$l0M", the sum of digits is 9 + 0 = 9.
    - For "N@1o2p3", the sum of digits is 1 + 2 + 3 = 6.
    - The string with the largest sum is "D4#e5F6" with a sum of 15.
*/

public class LargestSum {
    static int calcSum(String code) {
        int result = 0;

        for (int i = 0; i < code.length(); i++) {
            char letter = code.charAt(i);
            int ascii = (int) letter;

            if (ascii >= 48 && ascii <= 57) {
                int digit = ascii - 48;
                result += digit;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] inputs = {
                "a1b2@c3",
                "D4#e5F6",
                "g!H7i8%",
                "jK9$l0M",
                "N@1o2p3",
                "Q#r4S5t",
                "u!V6w7X",
                "yZ8@9a0",
                "!b1C2#d",
                "E3$f4G5"
        };

        String maxStr = "";
        int maxSum = 0;

        for (String input : inputs) {
            int sum = calcSum(input);

            if (sum > maxSum) {
                maxSum = sum;
                maxStr = input;
            }
        }

        System.out.printf("The maximum sum is %d which came from the string %s.\n", maxSum, maxStr);
    }
}
