package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task1;

public class Dog extends Animal {
    public String name;

    public Dog() {
        System.out.println("The dog says hello!");
    }

    public String getName() {
        return this.name;
    }

    public void updateSound(String sound) {
        this.sound = sound;
    }
}
