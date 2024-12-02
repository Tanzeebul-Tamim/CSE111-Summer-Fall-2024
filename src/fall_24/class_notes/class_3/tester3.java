package fall_24.class_notes.class_3;

import java.util.Scanner; // Importing Scanner class to take user input

public class tester3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating a Scanner object 's' for reading input

        // Prompting the user to input the number of lines to be read
        System.out.print("Input length: ");
        int len = s.nextInt(); // Reads an integer input to determine the length of the array 'arr'

        // Declaring a String array 'arr' of size 'len' to store the user inputs
        String[] arr = new String[len];

        String dummy = s.nextLine(); // Consumes the leftover newline character after reading the integer input

        // Using a for-loop to fill the array with 'len' lines of input from the user
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextLine(); // Reads each line of input and stores it in the 'arr' array
        }

        // Displaying each element of the array with a numbered label
        for (int i = 0; i < len; i++) {
            System.out.println("Course " + (i + 1) + ": " + arr[i]); // Prints each entry in 'arr' prefixed by "Course"
                                                                     // and the entry number
        }
    }
}
