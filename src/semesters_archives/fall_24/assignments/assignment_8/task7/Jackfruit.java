package semesters_archives.fall_24.assignments.assignment_8.task7;

public class Jackfruit extends Fruit {
    public Jackfruit() {
        super(false, "Jackfruit");
    }

    @Override
    public String toString() {
        return this.getName() + "s are good for you";
    }
}
