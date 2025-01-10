package semesters_archives.fall_24.assignments.assignment_8.task5;

public class Phoenix extends MagicalCreature {
    private int rebornCount;

    public Phoenix(String name, int age, int rebornCount) {
        super(name, age);
        this.rebornCount = rebornCount;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s sings an enchanting song.\n", this.name);
    }

    @Override
    public void performMagic() {
        System.out.printf("%s is reborn with %d rebirth cycles.\n", this.name, this.rebornCount);
    }

    public void regenerate() {
        System.out.printf("%s regenerates its body in a burst of flames.\n", this.name);
    }
}
