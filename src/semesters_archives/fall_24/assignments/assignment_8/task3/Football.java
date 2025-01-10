package semesters_archives.fall_24.assignments.assignment_8.task3;

public class Football {
    public String name;
    public int age;
    public int stamina;

    public Football(String name, int age, int stamina) {
        this.name = name;
        this.age = age;
        this.stamina = stamina;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Stamina: " + stamina);
    }

    public void calculatePerformance() {
        System.out.println("Performance is not defined yet");
    }
}
