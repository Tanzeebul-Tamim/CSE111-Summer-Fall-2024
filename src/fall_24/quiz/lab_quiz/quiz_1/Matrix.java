package fall_24.quiz.lab_quiz.quiz_1;

/*
    You are give a matrix A that contains positive numbers. Write a Java program to print the row of matrix A which contains the maximum sum of even-elements. Also, print the maximum sum.
    For simplicity, assume that only one row has the maximum sum of even elements. Your code should work for any given 2D array of positive numbers.
    
    Given Array:
    int[][] A = {{2, 5, 6},
                 {5, 3, 8},
                 {1, 6, 8}};
    
    Output:
    Maximum Sum of Even Elements: 14
    1 6 8

    Given Array:
    int[][] A = {{13, 24, 1, 4},
                 {22, 17, 5, 2}};
    
    Output:
    Maximum Sum of Even Elements: 28
    13 24 1 4
    
    Explanation:
    - For the first array { 1, 2, 3, 4 }, the even numbers are 2 and 4, and their sum is 6.
    - For the second array { 5, 6, 7, 8 }, the even numbers are 6 and 8, and their sum is 14.
    - For the third array { 9, 10, 11, 12 }, the even numbers are 10 and 12, and their sum is 22.
    
    Therefore, the array { 9, 10, 11, 12 } has the largest sum of even numbers, which is 22.
*/

public class Matrix {
    static void maxSum(int[][] matrix) {
        int maxSum = -1;
        int maxIdx = -1;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                int elem = matrix[i][j];

                if (elem % 2 == 0) {
                    sum += elem;
                }
            }
            
            if (i == 0) {
                maxSum = sum;
                maxIdx = i;
            } else {
                if (sum > maxSum) {
                    maxSum = sum;
                    maxIdx = i;
                }
            }
        }

        System.out.format("Maximum Sum of Even Elements: %d\n", maxSum);

        for (int i = 0; i < matrix[maxIdx].length; i++) {
            int elem = matrix[maxIdx][i];
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int[][] A = { { 2, 5, 6 },
                      { 5, 3, 8 },
                      { 1, 6, 8 } };

        maxSum(A);
    }
}
