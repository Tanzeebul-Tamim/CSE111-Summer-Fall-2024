package fall_24.assignments.assignment_1.ungraded_tasks;

public class Task4 {
    static void scalarMultiplication(int[][] matrix, int factor) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int elem = matrix[i][j] * factor;
                System.out.print(elem + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = { { 4, 5, 7 },
                { 0, 3, -2 },
                { 4, 1, -4 },
                { 5, 10, 1 } };
        int k = 4;
        scalarMultiplication(A, k);

        System.out.println();

        int[][] B = { {1, 2, 4},
                      {5, 7, 2} };
        int l = 3;
        scalarMultiplication(B, l);
    }
}
