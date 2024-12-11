package semesters_archives.summer_24.assignments.assignment_8.task7;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        Dog d1 = new Dog();
        d1.name = "Pammy";
        System.out.println("3-------------");
        System.out.println("Name: " + d1.getName());
        d1.details();
        System.out.println("4-------------");
        d1.updateSound("Bark");
        System.out.println("5-------------");
        d1.details();
    }
}
