package fall_24.assignments.assignment_2.graded_tasks.task4;

public class ImaginaryNumber {
    public int realPart;
    public int imaginaryPart;

    ImaginaryNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    void printNumber() {
        System.out.format("%d + %di\n", this.realPart, this.imaginaryPart);
    }
}