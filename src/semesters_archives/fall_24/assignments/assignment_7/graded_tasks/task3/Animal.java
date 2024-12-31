package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task3;

public class Animal {
    public String name;
    public int age;
    public String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String info() {
        return "Name: " + name + "\nAge: " + age + "\nColor: " + color + "\n";
    }
}
