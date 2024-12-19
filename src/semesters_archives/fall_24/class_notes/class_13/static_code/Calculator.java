package semesters_archives.fall_24.class_notes.class_13.static_code;

// Class representing a basic Calculator with both static and instance methods
public class Calculator {
    private static double memory; // Static variable to store calculation results and share state between static
                                  // methods

    // Getter for the static memory variable
    public static double getMemory() {
        return memory;
    }

    // Setter for the static memory variable
    public static void setMemory(double memory) {
        Calculator.memory = memory;
    }

    // Static method to add two numbers and store the result in memory
    public static double add(double a, double b) {
        memory = a + b; // Store the result in memory
        return memory; // Return the result
    }

    // Static method to calculate the square of a number and store it in memory
    public static double square(double p) {
        memory = p * p; // Store the result in memory
        return memory; // Return the result
    }

    // Static method to calculate half of a number and store it in memory
    public static double halfOf(double p) {
        memory = p / 2; // Store the result in memory
        return memory; // Return the result
    }

    public int x, y; // Instance variables for the Calculator class

    // Constructor to initialize a Calculator object with positive values
    public Calculator(int a, int b) {
        if (a > 0 && b > 0) { // Ensure both values are positive
            x = a; // Assign a to x
            y = b; // Assign b to y
            System.out.println("Object Created"); // Confirm object creation
        }
    }

    // Static factory method to create a Calculator object if inputs are
    // non-negative
    public static Calculator makeCalculator(int a, int b) {
        if (a >= 0 && b >= 0) { // Check if inputs are non-negative
            Calculator newObj = new Calculator(a, b); // Create a new Calculator object
            return newObj; // Return the created object
        } else {
            return null; // Return null if inputs are invalid
        }
    }
}
