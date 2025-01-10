package semesters_archives.fall_24.assignments.assignment_8.task3;

public class Striker extends Football {
    private int goals;
    private int shots;

    public Striker(String name, int age, int stamina, int goals, int shots) {
        super(name, age, stamina);
        this.goals = goals;
        this.shots = shots;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Goals: %d\n", this.goals);
        System.out.printf("Shots on target: %d\n", this.shots);
    }

    @Override
    public void calculatePerformance() {
        double score = this.goals / (double) this.shots;
        System.out.printf("Performance: %.3f\n", score);
    }
}
