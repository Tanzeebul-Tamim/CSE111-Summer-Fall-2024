package fall_24.class_notes.class_3;

import java.util.Scanner; // Importing Scanner class to enable input from the user

public class tester1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in); // Creating a Scanner object 's' to read input from the console

        int i = s.nextInt();
        int j = s.nextInt();

        // Next line reads any remaining text from the current line after integer input or moves to next line if no text remains.
        String st1 = s.nextLine(); // Reading the rest of the line including any whitespaces after integers; often used to move to a fresh line

        String st2 = s.next(); // Reading the next word (string up to whitespace) and assigning it to 'st2'

        // Output section
        System.out.println("i = " + (i)); // Printing the value of 'i'
        System.out.println("j = " + (j)); // Printing the value of 'j'
        System.out.println("st1 = " + (st1)); // Printing the value of 'st1', which might be empty due to the prior line read
        System.out.println("st2 = " + (st2)); // Printing the value of 'st2'3
    }
}
