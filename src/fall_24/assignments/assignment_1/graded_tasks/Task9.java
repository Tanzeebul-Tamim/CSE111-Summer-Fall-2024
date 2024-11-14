package fall_24.assignments.assignment_1.graded_tasks;

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
