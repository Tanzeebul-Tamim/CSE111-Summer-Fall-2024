package fall_24.class_notes.lec_3;

import java.util.Scanner; // Importing Scanner class to handle user input

public class tester2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating a Scanner object 's' for reading console input

        int i = s.nextInt(); // Reads an integer input from the user and assigns it to 'i'
        int j = s.nextInt(); // Reads another integer input and assigns it to 'j'

        // To prevent the 'nextLine()' from capturing leftover newline character from previous integer input:
        String dummy = s.nextLine(); // This line consumes the leftover newline character after 'j' input, clearing the buffer
        
        // Now that the buffer is clear, we can safely read the full line
        String st1 = s.nextLine(); // Reads an entire line of text after the integer inputs, including spaces

        String st2 = s.next(); // Reads the next word (up to whitespace) as a single token and assigns it to 'st2'

        // Output section
        System.out.println("i = " + i); // Outputs the value of 'i'
        System.out.println("j = " + j); // Outputs the value of 'j'
        System.out.println("st1 = " + st1); // Outputs the value of 'st1', which contains the line read after 'dummy'
        System.out.println("st2 = " + st2); // Outputs the value of 'st2', which is the next word after 'st1'
    }
}
