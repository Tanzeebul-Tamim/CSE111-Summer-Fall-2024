package fall_24.class_notes.oct_28;

public class tester {
    public static void main(String[] args) {
        int i; // Declaration only (Memory is allocated for variable 'i')
        i = 5; // Initialization (Assigning a value to 'i')
        
        int j = 10; // Declaration and Initialization in one statement
        int[] a = {5, 6}; // 'a' is declared and initialized with elements 5, 6 in one statement

        int[] b = new int[3]; // Declaration and initialization of array 'b' (memory allocated for 3 elements but not assigned values yet)
        int[] c; // Declaration only; memory for 'c' elements is not allocated yet

        /* These are Allowed */
        b[0] = 2; // Assigning values to each element of array 'b'
        b[1] = 3;
        b[2] = 4;

        /* This is NOT ALLOWED */
        // c = {2, 3, 4}; // Not allowed because array literals require declaration; cannot assign literal to an already-declared array without 'new' keyword

        /* This is Allowed */
        c = new int[] {2, 3, 4}; // Allowed, since the 'new' keyword allocates memory for elements; assigning values during initialization
    }
}
