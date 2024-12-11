package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task4;

public class Tester6 {
    public static void main(String[] args) {
        ImaginaryNumber num1 = new ImaginaryNumber();
        num1.printNumber();
        System.out.println("1********");
        num1.realPart = 3;
        num1.imaginaryPart = 7;
        num1.printNumber();
        System.out.println("2********");
        ImaginaryNumber num2 = new ImaginaryNumber();
        num2.realPart = 1;
        num2.imaginaryPart = 9;
        num2.printNumber();
    }
}
