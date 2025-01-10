package semesters_archives.fall_24.assignments.assignment_8.task7;

public class Mango extends Fruit {
    public Mango() {
        super(true, "Mango");
    }

    @Override
    public String toString() {
        return this.getName() + "es are bad for you";
    }
}
