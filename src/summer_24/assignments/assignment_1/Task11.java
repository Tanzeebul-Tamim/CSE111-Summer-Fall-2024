package summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x = scanner.nextInt();

        scanner.close();

        if (x < 0) {
            System.out.println(2 * x);
        } else if (x >= 0 && x < 2) {
            System.out.println(x + 1);
        } else if (x >= 2 && x < 5) {
            System.out.println((int) Math.pow(x, 2) - 1);
        } else if (x >= 5) {
            System.out.println(3 * (int) Math.pow(x, 2) + 2);
        }
    }
}
