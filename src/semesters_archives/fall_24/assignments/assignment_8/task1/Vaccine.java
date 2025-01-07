package semesters_archives.fall_24.assignments.assignment_8.task1;

public class Vaccine {
    private String name;
    private String origin;
    private int availableDosage;

    public Vaccine(String name, String origin, int availableDosage) {
        this.name = name;
        this.origin = origin;
        this.availableDosage = availableDosage;
    }

    public String getName() {
        return this.name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public int getAvailableDosage() {
        return this.availableDosage;
    }
}
