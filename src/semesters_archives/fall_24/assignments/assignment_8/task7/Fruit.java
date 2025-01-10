package semesters_archives.fall_24.assignments.assignment_8.task7;

public class Fruit {
    private boolean formalin = false;
    private String name = "";

    public Fruit(boolean formalin, String name) {
        this.formalin = formalin;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasFormalin() {
        return formalin;
    }

}
