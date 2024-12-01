package summer_24.assignments.assignment_9.task4;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
        Cat cat = new Cat("Kitty", 3, "White", "Persian");
        System.out.println("1.========");
        System.out.println(dog.info());
        System.out.println("2.========");
        System.out.println(cat.info());
        System.out.println("3.========");
        dog.makeSound();
        System.out.println("4.========");
        cat.makeSound();
    }
}