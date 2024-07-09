package assignments.assignment_3.string;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = 0;
        String newString = "";

        System.out.println("Enter a string:");
        String inputString = sc.next();
        sc.close();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if ((int) character != ascii) {
                ascii = (int) character;
                newString += character;
            }
        }

        System.out.println(newString);
    }
}