package fall_24.quiz.lab_quiz.quiz_1;

/*
    You are given an array of integer arrays. Print out the array which has the largest sum of even numbers and print the sum as well.
    
    Sample Input:
    int[][] arrays = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };
    
    Sample Output:
    Largest sum of even numbers: 22
    9 10 11 12
    
    Explanation:
    - For the first array { 1, 2, 3, 4 }, the even numbers are 2 and 4, and their sum is 6.
    - For the second array { 5, 6, 7, 8 }, the even numbers are 6 and 8, and their sum is 14.
    - For the third array { 9, 10, 11, 12 }, the even numbers are 10 and 12, and their sum is 22.
    
    Therefore, the array { 9, 10, 11, 12 } has the largest sum of even numbers, which is 22.
*/

public class Quiz1 {
    static void evenSum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int maxSum = -1;
        int maxIdx = -1;

        for (int i = 0; i < row; i++) {
            int sum = 0;

            if (i == 0) {
                maxSum = sum;
                maxIdx = i;
            }

            for (int j = 0; j < col; j++) {
                int elem = arr[i][j];

                if (elem % 2 == 0) {
                    sum += elem;
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxIdx = i;
            }
        }

        System.out.printf("Largest sum of even numbers: %d\n", maxSum);

        for (int i = 0; i < arr[maxIdx].length; i++) {
            int elem = arr[maxIdx][i];
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arrays = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        evenSum(arrays);
    }
}
