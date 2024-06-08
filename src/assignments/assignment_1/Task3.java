package assignments.assignment_1;

public class Task3 {
    public static void main(String[] args) {
        int studentId = 23221454;
        int digitsNeeded = 2;

        for (int i = 0; i < digitsNeeded; i++) {
            int digit = studentId % 10;
            studentId /= 10;
            System.out.println(digit);
        }
    }
}
