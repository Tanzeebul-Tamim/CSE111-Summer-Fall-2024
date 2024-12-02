package fall_24.class_notes.class_7.array_string;

import java.util.Scanner;

public class Task3 {
    private static void printGrades(String grade, int[] scores, int count) {
        if (count > 0) {
            System.out.print(grade + ": ");
            
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i]);

                if (i < count - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalStudent = 5;
        int countA = 0, countB = 0, countC = 0, countF = 0;

        int[] gradeA = new int[totalStudent];
        int[] gradeB = new int[totalStudent];
        int[] gradeC = new int[totalStudent];
        int[] gradeF = new int[totalStudent];

        System.out.println("Enter the final marks of 5 students:");

        for (int i = 0; i < totalStudent; i++) {
            while (true) {
                int score = sc.nextInt();

                if (80 <= score && score <= 100) {
                    gradeA[countA] = score;
                    countA++;
                    break;
                } else if (65 <= score && score < 80) {
                    gradeB[countB] = score;
                    countB++;
                    break;
                } else if (50 <= score && score < 65) {
                    gradeC[countC] = score;
                    countC++;
                    break;
                } else if (0 <= score && score < 50) {
                    gradeF[countF] = score;
                    countF++;
                    break;
                } else {
                    System.out.println(
                            "Invalid marks! Valid marks range is 0 to 100. Please enter again:");
                }
            }
        }

        printGrades("A", gradeA, countA);
        printGrades("B", gradeB, countB);
        printGrades("C", gradeC, countC);
        printGrades("F", gradeF, countF);

        sc.close();
    }
}
