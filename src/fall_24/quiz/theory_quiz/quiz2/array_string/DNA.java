package fall_24.quiz.theory_quiz.quiz2.array_string;

/*
    Suppose you are working with a Company for developing a DNA sequence recognizing software. DNA can be represented with a sequence consisting of proteins: A, T, C and G in many combinations. Your tasks are:
        1. Take a String input that contains several 4-length parts, where each part is separated by a '-' character
        2. Find whether the String input is a correct DNA sequence. In other words, verify the parts that only contain the valid characters for a DNA: 'A', 'T', 'C', 'G'.
    
    Finally, your task is to find the least frequently appearing protein among all the parts in the input sequence.
    Carefully observe the following sample inputs and corresponding outputs and write a java program to complete the tasks described above.

    Sample Input 1
    ATTA-CGGA-ATCG-AATA-ATTA-AATA-ATCG-AATA

    Sample Output 1
    Least Occurring Protein:
    C (3 out of 32)

    Sample Input 2
    CGTA-ATCM-ACTA-ATGA-CATA-ATCG

    Sample Output 2
    Error in input
 */

import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a DNA sequence:");
        String input = sc.nextLine();
        sc.close();

        int[] count = new int[4];
        int total = 0;
        int min = 0;
        String least = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character != '-') {
                if (character == 'A') {
                    count[0]++;
                } else if (character == 'T') {
                    count[1]++;
                } else if (character == 'C') {
                    count[2]++;
                } else if (character == 'G') {
                    count[3]++;
                } else {
                    System.out.println("Error in input");
                    return;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            int proteinOccurrence = count[i];
            total += proteinOccurrence;

            if (i == 0) {
                min = count[0];
            } else if (proteinOccurrence < min) {
                min = proteinOccurrence;
                least = i == 0 ? "A" : i == 1 ? "T" : i == 2 ? "C" : "G";
            }
        }

        System.out.println("Least Occurring Protein:");
        System.out.printf("%s (%d out of %d)\n", least, min, total);

    }
}
