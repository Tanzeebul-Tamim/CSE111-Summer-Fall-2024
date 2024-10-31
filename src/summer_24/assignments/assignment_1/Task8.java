package summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Student ID:");
        int studentID = scanner.nextInt();

        int divisor1 = (int) Math.pow(10, 6);
        int divisor2 = (int) Math.pow(10, 5);

        int year = studentID / divisor1;
        int sessionNo = studentID % divisor1 / divisor2;

        String[] sessions = { "Spring", "Fall", "Summer" };
        String session = sessions[sessionNo - 1];

        System.out.printf("Student Joined BRAC in %s %d\n", session, year);

        scanner.close();
    }
}
