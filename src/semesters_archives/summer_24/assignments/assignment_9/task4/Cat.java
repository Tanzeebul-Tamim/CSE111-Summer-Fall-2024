package semesters_archives.summer_24.assignments.assignment_9.task4;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s color %s is meowing\n", this.color, this.name);
    }

    @Override
    public String info() {
        return super.info() + "Breed: " + this.breed;
    }
}
