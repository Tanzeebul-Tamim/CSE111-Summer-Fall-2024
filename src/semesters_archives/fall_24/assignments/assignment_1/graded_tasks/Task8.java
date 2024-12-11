package semesters_archives.fall_24.assignments.assignment_1.graded_tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("\nEnter the number of columns: ");
        int col = sc.nextInt();

        int[][] twoD = new int[row][col];
        int[] oneD = new int[row * col];

        for (int i = 0; i < row; i++) {
            String rowSuffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            for (int j = 0; j < col; j++) {
                String colSuffix = j == 0 ? "st" : j == 1 ? "nd" : j == 2 ? "rd" : "th";
                int oneDIndex = col * i + j;

                System.out.printf("\nEnter value for %d%s row, %d%s column:\n", i + 1, rowSuffix, j + 1, colSuffix);
                int input = sc.nextInt();

                twoD[i][j] = input;
                oneD[oneDIndex] = input;
            }
        }

        System.out.println("\n2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoD[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\n1D Array:");
        for (int i = 0; i < row * col; i++) {
            System.out.print(oneD[i] + " ");
        }

        sc.close();
    }
}
