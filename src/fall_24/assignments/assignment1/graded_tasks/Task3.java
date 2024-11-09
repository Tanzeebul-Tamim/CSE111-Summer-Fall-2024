package fall_24.assignments.assignment1.graded_tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = sc.nextLine();

        System.out.println("\nEnter another word:");
        String word2 = sc.nextLine();

        System.out.println();

        String result = word1 + " " + word2;
        int asciiSum = 0;

        for (int i = 0; i < 2; i++) {
            int condition = i == 0 ? word1.length() : word2.length();
            String word = i == 0 ? word1 : word2;

            for (int j = 0; j < condition; j++) {
                int ascii = (int) word.charAt(j);

                if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                    asciiSum += ascii;
                }
            }
        }

        System.out.println(result);
        System.out.println(asciiSum);

        sc.close();
    }
}
