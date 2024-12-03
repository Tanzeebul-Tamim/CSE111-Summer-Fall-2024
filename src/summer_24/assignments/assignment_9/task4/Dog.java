package summer_24.assignments.assignment_9.task4;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s color %s is barking\n", this.color, this.name);
    }

    @Override
    public String info() {
        return super.info() + "Breed: " + this.breed;
    }
}