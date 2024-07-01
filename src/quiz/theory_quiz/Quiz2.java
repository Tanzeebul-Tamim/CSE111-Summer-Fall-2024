package quiz.theory_quiz;

import java.util.Scanner;

/*
    Write a Java program that takes an integer N as user input, which represents the number of symptoms. 
    Then, take N names of symptoms from the user and store them in an array. 
    One symptom may appear multiple times in the array, indicating that the patient had those particular symptoms multiple times and sequentially.
    The symptom that appears the most times in the array will be considered the recurring one. 
    Based on this information, determine and print the name of the most recurring symptom.

    Example:
    For N = 5, and the symptoms are ["cough", "fever", "cough", "headache", "cough"]
    The program should print:
    "cough" as it appears 3 times, which is the most frequent.

    Sample Input 1:
    5
    cough
    fever
    cough
    headache
    cough

    Sample Output 1:
    cough is diagnosed as the most recurring symptom.

    Explanation for (N = 5):
    The input symptoms are: cough, fever, cough, headache, cough
    The frequencies are:
    cough: 3 times
    fever: 1 time
    headache: 1 time
    Since "cough" appears the most (3 times), it is diagnosed as the most recurring symptom.

    Sample Input 2:
    6
    sneezing
    fever
    sneezing
    nausea
    fever
    fever

    Sample Output 2:
    fever is diagnosed as the most recurring symptom.

    Explanation for (N = 6):
    The input symptoms are: sneezing, fever, sneezing, nausea, fever, fever
    The frequencies are:
    sneezing: 2 times
    fever: 3 times
    nausea: 1 time
    Since "fever" appears the most (3 times), it is diagnosed as the most recurring symptom.
*/

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of symptoms:");
        int N = sc.nextInt();
        sc.nextLine();

        String[] symptoms = new String[N];

        System.out.println("\nEnter the symptoms:");
        for (int i = 0; i < N; i++) {
            symptoms[i] = sc.nextLine();
        }

        sc.close();

        String mostRecurringSymptom = null;
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            String currentSymptom = symptoms[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (symptoms[j].equals(currentSymptom)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostRecurringSymptom = currentSymptom;
            }
        }

        System.out.printf("\n%s is diagnosed as the most recurring symptom.\n", mostRecurringSymptom);
    }
}
