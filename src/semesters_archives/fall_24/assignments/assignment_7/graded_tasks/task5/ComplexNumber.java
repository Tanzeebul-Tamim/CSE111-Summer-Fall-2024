package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task5;

public class ComplexNumber extends RealNumber {
    public double complexValue;

    public ComplexNumber() {
        this(1.0, 1.0);
    }

    public ComplexNumber(double realValue, double complexValue) {
        super(realValue);
        this.complexValue = complexValue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImaginary Part: " + complexValue;
    }
}
