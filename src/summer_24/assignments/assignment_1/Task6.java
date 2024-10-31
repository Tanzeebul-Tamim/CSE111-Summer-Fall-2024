package summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:2000");
        int year = scanner.nextInt();
        scanner.close();

        if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.format("\n%d is a leap year", year);
        } else {
            System.out.format("\n%d is not a leap year", year);
        }
    }
}
