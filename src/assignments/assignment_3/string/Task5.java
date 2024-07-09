package assignments.assignment_3.string;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = sc.nextLine();

        System.out.println("\nEnter another word:");
        String word2 = sc.nextLine();

        System.out.println();

        String result = "";
        int asciiSum = 0;
        for (int i = 0; i < 2; i++) {
            int condition = i == 0 ? word1.length() : word2.length();
            String word = i == 0 ? word1 : word2;

            for (int j = 0; j < condition; j++) {
                char letter = word.charAt(j);
                result += letter;
                int ascii = (int) letter;

                if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                    asciiSum += (int) letter;
                }

                if (i == 0 && j == word1.length() - 1) {
                    result += " ";
                }
            }
        }

        System.out.println(result);
        System.out.println(asciiSum);
        sc.close();
    }
}