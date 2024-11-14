package fall_24.assignments.assignment_1.ungraded_tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (M) for the matrix:");
        int M = sc.nextInt();

        System.out.println("\nEnter the number of columns (N) for the matrix:");
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            String rowSuffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";
            for (int j = 0; j < N; j++) {
                String colSuffix = j == 0 ? "st" : j == 1 ? "nd" : j == 2 ? "rd" : "th";
                System.out.format("\nEnter the element of %d%s row, %d%s column:\n", i + 1, rowSuffix, j + 1, colSuffix);
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nMatrix A");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
