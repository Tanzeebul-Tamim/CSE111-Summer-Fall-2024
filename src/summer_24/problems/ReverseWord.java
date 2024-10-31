package summer_24.problems;

import java.util.Scanner;

/*
    Write a Java program that takes a string as input and reverses the order of words in it.

    Sample Input	    Output
    CSE110 is easy	    easy is CSE110
    Attention please!	please! Attention
 */

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int length = input.length();
        int wordEnd = length;

        for (int i = length - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || i == 0) {
                int wordStart = (i == 0) ? i : i + 1;

                for (int j = wordStart; j < wordEnd; j++) {
                    System.out.print(input.charAt(j));
                }

                if (i != 0) {
                    System.out.print(' ');
                }

                wordEnd = i;
            }
        }
        sc.close();
    }
}
