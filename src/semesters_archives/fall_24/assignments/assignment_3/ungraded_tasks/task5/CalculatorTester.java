package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task5;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("1=============");
        calc.add(10, 20);
        System.out.println("2=============");
        calc.add(5, 15, 25);
        System.out.println("3=============");
        calc.multiply(6, 7);
        System.out.println("4=============");
        calc.multiply(2, 3, 4);
        System.out.println("5=============");
        calc.multiply("Hello", 3);
        System.out.println("6=============");
        calc.multiply("Java", 5);
    }
}
