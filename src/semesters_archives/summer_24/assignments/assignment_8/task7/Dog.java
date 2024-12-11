package semesters_archives.summer_24.assignments.assignment_8.task7;

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
