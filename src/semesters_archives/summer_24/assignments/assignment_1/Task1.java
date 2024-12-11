package semesters_archives.summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // TASK A
        System.out.println("TASK-A");
        int a;
        a = 9;
        System.out.println(a);
        System.out.println();

        // TASK B
        System.out.println("TASK-B");
        int b = 3;
        a += b;
        System.out.println(a);
        System.out.println();

        // TASK C
        System.out.println("TASK-C");
        System.out.println("Product: " + a * b);
        System.out.println("Division: " + a / b);
        System.out.println();

        // TASK D-A
        System.out.println("TASK-D-A");
        double c;
        c = 1.5;
        System.out.println(c);
        System.out.println();

        // TASK D-B
        System.out.println("TASK-D-B");
        double d = 2.5;
        c += d;
        System.out.println(c);
        System.out.println();

        // TASK D-C
        System.out.println("TASK-D-C");
        System.out.println("Product: " + c * d);
        System.out.println("Division: " + c / d);
        System.out.println();

        // TASK E-A
        System.out.println("TASK-E-A");
        double e;
        e = 3.5;
        System.out.println(e);
        System.out.println();

        // TASK E-B
        System.out.println("TASK-E-B");
        int f = 4;
        e += f;
        System.out.println(e);
        System.out.println();

        // TASK E-C
        System.out.println("TASK-E-C");
        System.out.println("Product: " + e * f);
        System.out.println("Division: " + e / f);
        System.out.println();

        // TASK F-A
        System.out.println("TASK-F-A");
        String g;
        g = "Hello ";
        System.out.println(g);
        System.out.println();

        // TASK F-B
        System.out.println("TASK-F-B");
        String h = "World";
        g += h;
        System.out.println(g);
        System.out.println();

        /*
         * The addition operator concatenates the strings and combines them into a
         * single string
         */

        /*
         * System.out.
         * println("What if the first variable is an integer and the second is a String?"
         * );
         * If the first variable is an integer and the second is a String or vice versa,
         * the addition operator will convert the integer to a String first, and then
         * concatenate the two Strings together. Here's an example:
         */
        int i = 10;
        String j = " Good Morning";
        System.out.println(i + j);
        System.out.println();

        // TASK G-A
        System.out.println("TASK G-A");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int k;
        k = scanner.nextInt();
        System.out.println(k);
        System.out.println();

        // TASK G-B
        System.out.println("TASK G-B");
        System.out.println("Enter another integer:");
        int l = scanner.nextInt();
        k += l;
        System.out.println(k);
        scanner.close();
    }
}
