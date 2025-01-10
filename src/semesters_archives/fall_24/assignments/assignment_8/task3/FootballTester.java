package semesters_archives.fall_24.assignments.assignment_8.task3;

public class FootballTester {
    public static void main(String[] args) {
        Striker ronaldo = new Striker("Ronaldo", 39, 90, 901, 1000);
        Defender ramos = new Defender("Ramos", 38, 85, 1000, 100);

        System.out.println("1========");
        ronaldo.display();
        System.out.println("2========");
        ronaldo.calculatePerformance();
        System.out.println("3========");
        ramos.display();
        System.out.println("4========");
        ramos.calculatePerformance();
    }

}
