package semesters_archives.fall_24.assignments.assignment_8.task3;

public class Defender extends Football {
    private int tackles;
    private int interceptions;

    public Defender(String name, int age, int stamina, int tackles, int interceptions) {
        super(name, age, stamina);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Tackles: %d\n", this.tackles);
        System.out.printf("Interceptions: %d\n", this.interceptions);
    }

    @Override
    public void calculatePerformance() {
        double score = this.interceptions / (double) this.tackles;
        System.out.printf("Performance: %.3f\n", score);
    }
}
