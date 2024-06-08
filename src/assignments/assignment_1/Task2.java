package assignments.assignment_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.printf("Before swapping:\n1st variable: %d, 2nd variable: %d\n\n", a, b);

        // Swapping the values by creating a third variable
        int c;
        c = a;
        a = b;
        b = c;
        System.out.printf("After swapping using third variable:\n1st variable: %d, 2nd variable: %d\n\n", a, b);

        // Swapping back the values without creating a third variable
        a = a + b;
        b = a - b;
        a -= b;
        System.out.printf("After swapping without using third variable:\n1st variable: %d, 2nd variable: %d", a, b);
    }
}
