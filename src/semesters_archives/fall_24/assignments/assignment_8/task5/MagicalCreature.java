package semesters_archives.fall_24.assignments.assignment_8.task5;

public class MagicalCreature {
    public String name;
    public int age;

    public MagicalCreature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a magical sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    public void performMagic() {
        System.out.println(name + " performs a generic magic.");
    }
}
