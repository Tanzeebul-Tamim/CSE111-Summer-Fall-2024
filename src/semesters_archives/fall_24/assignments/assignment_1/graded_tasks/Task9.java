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

public class Task9 {
    static String identityMatrixChecker(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean isIdentity = true;

        if (row == col) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    int elem = matrix[i][j];

                    if (i == j) {
                        if (elem != 1) {
                            isIdentity = false;
                        }
                    } else {
                        if (elem != 0) {
                            isIdentity = false;
                        }
                    }
                }
            }
        } else {
            isIdentity = false;
        }

        if (isIdentity) {
            return "Identity Matrix";
        } else {
            return "Not an Identity Matrix";
        }
    }

    public static void main(String[] args) {
        int[][] A = { { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 } };

        System.out.println(identityMatrixChecker(A));
    }
}
