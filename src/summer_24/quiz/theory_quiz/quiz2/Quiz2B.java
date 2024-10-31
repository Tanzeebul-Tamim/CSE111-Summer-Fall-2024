package summer_24.quiz.theory_quiz.quiz2;

import java.util.Scanner;

/*
    For a smart diagnosis system, you need to write a java program to support the diagnosis from patients symptoms - which may repeat. Now, you were once told that the most important symptom is the one that has more letters in its name, especially considering the sum of the ascii numbers of those letters.

    Now, Write a java code that takes an input number N, then takes N lines of strings afterwards, which are the actual symptoms and outputs the symptom with the highest length, highest ascii sum. If multiple correct outputs are possible, make sure your code outputs any one.

    Sample Input 1:
    6
    Headache
    Nausea
    Tiredness
    Nausea
    Itching
    Weakness


    Sample Output 1:
    The most important symptom is the Tiredness.

    Explanation 1:
    Of the given symptoms, Nausea occurs twice while all the other symptoms occur once.

    Sample Input 2:
    7
    Sneezing
    Headache
    Sneezing
    Fever
    Headache
    Nausea
    Headache


    Sample Output 2:
    The most important symptom is the Sneezing.

    Explanation 2:
    Of the given symptoms, Headache occurs three times, and sneezing occurs twice while all the other symptoms occur once.
*/

public class Quiz2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of symptoms:");
        int N = sc.nextInt();
        sc.nextLine();

        int maxLen = 0;
        int maxAscii = 0;
        String mostImportantSymptom = null;

        System.out.println("\nEnter the symptoms:");
        for (int i = 0; i < N; i++) {
            String currentSymptom = sc.nextLine();
            int ascii = 0;

            for (int j = 0; j < currentSymptom.length(); j++) {
                ascii += (int) currentSymptom.charAt(j);
            }

            if (currentSymptom.length() > maxLen) {
                maxLen = currentSymptom.length();
                mostImportantSymptom = currentSymptom;
                maxAscii = ascii;
            } else if (currentSymptom.length() == maxLen && ascii > maxAscii) {
                mostImportantSymptom = currentSymptom;
                maxAscii = ascii;
            }
        }

        System.out.printf("\nThe most important symptom is the %s.\n", mostImportantSymptom);
        sc.close();
    }
}
